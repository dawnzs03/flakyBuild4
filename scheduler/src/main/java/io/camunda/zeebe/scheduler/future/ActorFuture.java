/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.scheduler.future;

import io.camunda.zeebe.scheduler.ActorTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/** interface for actor futures */
public interface ActorFuture<V> extends Future<V>, BiConsumer<V, Throwable> {
  void complete(V value);

  void completeExceptionally(String failure, Throwable throwable);

  void completeExceptionally(Throwable throwable);

  V join();

  V join(long timeout, TimeUnit timeUnit);

  /** To be used by scheduler only */
  void block(ActorTask onCompletion);

  /**
   * Registers an consumer, which is executed after the future was completed. If the caller of this
   * method is an actor, the consumer is executed in the caller's actor thread. If the caller is not
   * an actor, the consumer is executed in the actor which completes this future. If the caller is
   * not an actor, it is recommended to use {@link ActorFuture#onComplete(BiConsumer, Executor)}
   * instead.
   *
   * <p>Example:
   *
   * <p>Actor A calls Actor B to retrieve an value. Actor B returns an future, which will be
   * completed later with the right value. Actor A wants to do some work, after B returns the value.
   * For that Actor A calls `#onComplete`, at this returned future, to register an consumer. After
   * the future is completed, the registered consumer is called in the Actor A context.
   *
   * <p>Running in Actor A context:
   *
   * <pre>
   *  final ActorFuture<Value> future = ActorB.getValue();
   *  future.onComplete(value, throwable -> { // do things - runs in Actor A context again
   *  });
   * </pre>
   *
   * @param consumer the consumer which should be called after the future was completed
   */
  void onComplete(BiConsumer<V, Throwable> consumer);

  /**
   * Registers a consumer, which is executed after the future was completed. The consumer is
   * executed in the provided executor. It is recommended to not use this method if the caller is an
   * actor (use {@link ActorFuture#onComplete(BiConsumer)} instead), as it has some extra overhead
   * for synchronization.
   *
   * @param consumer the callback which should be called after the future was completed
   * @param executor the executor on which the callback will be executed
   */
  void onComplete(BiConsumer<V, Throwable> consumer, Executor executor);

  boolean isCompletedExceptionally();

  Throwable getException();

  @Override
  default void accept(final V value, final Throwable throwable) {
    if (throwable != null) {
      completeExceptionally(throwable);
    } else {
      complete(value);
    }
  }
}
