/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.gateway.impl.broker.request;

import io.camunda.zeebe.protocol.impl.record.value.decision.DecisionEvaluationRecord;
import io.camunda.zeebe.protocol.record.ValueType;
import io.camunda.zeebe.protocol.record.intent.DecisionEvaluationIntent;
import org.agrona.DirectBuffer;

public class BrokerEvaluateDecisionRequest extends BrokerExecuteCommand<DecisionEvaluationRecord> {

  private final DecisionEvaluationRecord requestDto = new DecisionEvaluationRecord();

  public BrokerEvaluateDecisionRequest() {
    super(ValueType.DECISION_EVALUATION, DecisionEvaluationIntent.EVALUATE);
  }

  public BrokerEvaluateDecisionRequest setDecisionId(final String decisionId) {
    requestDto.setDecisionId(decisionId);
    return this;
  }

  public BrokerEvaluateDecisionRequest setDecisionKey(final long decisionKey) {
    requestDto.setDecisionKey(decisionKey);
    return this;
  }

  public BrokerEvaluateDecisionRequest setVariables(final DirectBuffer variables) {
    requestDto.setVariables(variables);
    return this;
  }

  @Override
  public DecisionEvaluationRecord getRequestWriter() {
    return requestDto;
  }

  @Override
  protected DecisionEvaluationRecord toResponseDto(final DirectBuffer buffer) {
    final DecisionEvaluationRecord responseDto = new DecisionEvaluationRecord();
    responseDto.wrap(buffer);
    return responseDto;
  }
}
