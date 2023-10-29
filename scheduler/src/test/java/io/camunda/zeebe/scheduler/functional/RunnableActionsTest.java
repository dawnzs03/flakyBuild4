/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.scheduler.functional;

import static org.assertj.core.api.Assertions.assertThat;

import io.camunda.zeebe.scheduler.Actor;
import io.camunda.zeebe.scheduler.ActorThread;
import io.camunda.zeebe.scheduler.testing.ControlledActorSchedulerRule;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Rule;
import org.junit.Test;

public final class RunnableActionsTest {
  @Rule public final ControlledActorSchedulerRule scheduler = new ControlledActorSchedulerRule();

  @Test
  public void shouldInvokeRunFromWithinActor() {
    // given
    final Runner runner =
        new Runner() {
          @Override
          protected void onActorStarted() {
            doRun();
          }
        };

    scheduler.submitActor(runner);

    // when
    scheduler.workUntilDone();

    // then
    assertThat(runner.runs).isEqualTo(1);
  }

  @Test
  public void shouldInvokeRunFromNonActorThread() {
    // given
    final Runner runner = new Runner();
    scheduler.submitActor(runner);

    // when
    runner.doRun();
    scheduler.workUntilDone();

    // then
    assertThat(runner.runs).isEqualTo(1);
  }

  @Test
  public void shouldInvokeSubmitFromNonActorThread() {
    // given
    final AtomicBoolean toggle = new AtomicBoolean(false);
    final Submitter submitter = new Submitter();
    scheduler.submitActor(submitter);

    // when
    submitter.submit(() -> toggle.set(true));
    scheduler.workUntilDone();

    // then
    assertThat(toggle).isTrue();
  }

  @Test
  public void shouldInvokeRunFromAnotherActor() {
    // given
    final Runner runner = new Runner();
    final Actor invoker =
        new Actor() {
          @Override
          protected void onActorStarted() {
            runner.doRun();
          }
        };

    scheduler.submitActor(runner);
    scheduler.submitActor(invoker);

    // when
    scheduler.workUntilDone();

    // then
    assertThat(runner.runs).isEqualTo(1);
  }

  @Test
  public void shouldSubmitRunnableToCorrectActorTask() {
    // given
    final List<Actor> actorContext = new ArrayList<>();
    final Runner runner =
        new Runner(() -> actorContext.add(ActorThread.current().getCurrentTask().getActor()));

    final Actor invoker =
        new Actor() {
          @Override
          protected void onActorStarted() {
            runner.doRun();
          }
        };

    scheduler.submitActor(runner);
    scheduler.submitActor(invoker);

    // when
    scheduler.workUntilDone();

    // then
    assertThat(actorContext).containsExactly(runner);
  }

  @Test
  public void shouldSubmitFromAnotherActor() {
    // given
    final AtomicInteger invocations = new AtomicInteger();
    final AtomicBoolean exceptionOnSubmit = new AtomicBoolean(false);

    final Submitter submitter = new Submitter();

    final Actor actor =
        new Actor() {
          @Override
          protected void onActorStarted() {
            try {
              submitter.submit(invocations::incrementAndGet);
            } catch (final Exception e) {
              exceptionOnSubmit.set(true);
            }
          }
        };

    scheduler.submitActor(submitter);
    scheduler.submitActor(actor);

    // when
    scheduler.workUntilDone();

    // then
    assertThat(invocations).hasValue(1);
    assertThat(exceptionOnSubmit).isFalse();
  }

  private static final class Submitter extends Actor {
    public void submit(final Runnable r) {
      actor.submit(r);
    }
  }

  private static class Runner extends Actor {
    int runs = 0;
    final Runnable onExecution;

    Runner() {
      this(null);
    }

    Runner(final Runnable onExecution) {
      this.onExecution = onExecution;
    }

    public void doRun() {
      actor.run(
          () -> {
            if (onExecution != null) {
              onExecution.run();
            }
            runs++;
          });
    }
  }
}
