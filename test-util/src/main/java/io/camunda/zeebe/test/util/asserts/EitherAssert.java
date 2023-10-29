/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.test.util.asserts;

import io.camunda.zeebe.util.Either;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.AssertFactory;
import org.assertj.core.api.InstanceOfAssertFactory;
import org.assertj.core.api.ObjectAssert;

/**
 * AssertJ assertions to help you test {@link Either} instances. Typically, you will check if it is
 * of the expected side using {@link #isLeft()} or {@link #isRight()}, and then extract that value
 * using {@link #left()} and {@link #right()} to assert properties on the actual result. You can
 * further chain these with a standard {@link #asInstanceOf(InstanceOfAssertFactory)} to get a more
 * specific type.
 *
 * @param <L> the left type
 * @param <R> the right type
 */
public final class EitherAssert<L, R>
    extends AbstractObjectAssert<EitherAssert<L, R>, Either<L, R>> {
  public EitherAssert(final Either<L, R> actual) {
    super(actual, EitherAssert.class);
  }

  /**
   * Convenience factory method which you can use as an {@link AssertFactory}.
   *
   * @param actual the actual object under test
   * @param <L> the left type
   * @param <R> the right type
   * @return an instance of {@link EitherAssert} on {@code actual}
   */
  public static <L, R> EitherAssert<L, R> assertThat(final Either<L, R> actual) {
    return new EitherAssert<>(actual);
  }

  /**
   * Fails if {@link #actual} has no right member or is null.
   *
   * @return itself for chaining
   */
  public EitherAssert<L, R> isRight() {
    isNotNull();

    if (actual.isLeft()) {
      failWithMessage("Expected <%s> to be right, but was left <%s>", actual, actual.getLeft());
    }

    return myself;
  }

  /**
   * Extracts the right member of {@link #actual} and returns an {@link ObjectAssert} wrapping it.
   * Fails if {@link #actual} has no right member or is null.
   *
   * @return a new {@link ObjectAssert} around the right member of {@link #actual}
   */
  public ObjectAssert<R> right() {
    isNotNull();

    // use asInstanceOf to preserve the current assertion info and description
    return asInstanceOf(
        new InstanceOfAssertFactory<>(
            Either.Right.class, object -> new ObjectAssert<>(actual.get())));
  }

  /**
   * Fails if {@link #actual} has no left member or is null.
   *
   * @return itself for chaining
   */
  public EitherAssert<L, R> isLeft() {
    isNotNull();

    if (actual.isRight()) {
      failWithMessage("Expected <%s> to be left, but was right <%s>", actual, actual.get());
    }

    return myself;
  }

  /**
   * Extracts the left member of {@link #actual} and returns an {@link ObjectAssert} wrapping it.
   * Fails if {@link #actual} has no left member or is null.
   *
   * @return a new {@link ObjectAssert} around the left member of {@link #actual}
   */
  public ObjectAssert<L> left() {
    isNotNull();

    // use asInstanceOf to preserve the current assertion info and description
    return asInstanceOf(
        new InstanceOfAssertFactory<>(
            Either.Left.class, object -> new ObjectAssert<>(actual.getLeft())));
  }
}
