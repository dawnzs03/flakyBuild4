/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.test.util.bpmn.random.blocks;

import io.camunda.zeebe.model.bpmn.builder.AbstractFlowNodeBuilder;
import io.camunda.zeebe.model.bpmn.builder.IntermediateCatchEventBuilder;
import io.camunda.zeebe.test.util.bpmn.random.BlockBuilder;
import io.camunda.zeebe.test.util.bpmn.random.BlockBuilderFactory;
import io.camunda.zeebe.test.util.bpmn.random.ConstructionContext;
import io.camunda.zeebe.test.util.bpmn.random.ExecutionPathContext;
import io.camunda.zeebe.test.util.bpmn.random.ExecutionPathSegment;
import io.camunda.zeebe.test.util.bpmn.random.IDGenerator;
import io.camunda.zeebe.test.util.bpmn.random.steps.StepPublishMessage;

/**
 * Generates an intermediate message catch event. It waits for a message with name {@code
 * message_[id]} and a correlation key of {@code CORRELATION_KEY_VALUE}
 */
public class IntermediateMessageCatchEventBlockBuilder extends AbstractBlockBuilder {

  public static final String CORRELATION_KEY_FIELD = "correlationKey";
  public static final String CORRELATION_KEY_VALUE = "default_correlation_key";
  private final String messageName;

  public IntermediateMessageCatchEventBlockBuilder(final IDGenerator idGenerator) {
    super(idGenerator.nextId());
    messageName = "message_" + elementId;
  }

  @Override
  public AbstractFlowNodeBuilder<?, ?> buildFlowNodes(
      final AbstractFlowNodeBuilder<?, ?> nodeBuilder) {

    final IntermediateCatchEventBuilder result = nodeBuilder.intermediateCatchEvent(getElementId());

    result.message(
        messageBuilder -> {
          messageBuilder.zeebeCorrelationKeyExpression(CORRELATION_KEY_FIELD);
          messageBuilder.name(messageName);
        });

    return result;
  }

  @Override
  public ExecutionPathSegment generateRandomExecutionPath(final ExecutionPathContext context) {
    final ExecutionPathSegment result = new ExecutionPathSegment();

    result.appendDirectSuccessor(
        new StepPublishMessage(messageName, CORRELATION_KEY_FIELD, CORRELATION_KEY_VALUE));

    return result;
  }

  public static class Factory implements BlockBuilderFactory {

    @Override
    public BlockBuilder createBlockBuilder(final ConstructionContext context) {
      return new IntermediateMessageCatchEventBlockBuilder(context.getIdGenerator());
    }

    @Override
    public boolean isAddingDepth() {
      return false;
    }
  }
}
