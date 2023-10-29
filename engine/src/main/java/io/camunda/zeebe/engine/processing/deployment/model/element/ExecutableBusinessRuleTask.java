/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.processing.deployment.model.element;

import io.camunda.zeebe.el.Expression;

public final class ExecutableBusinessRuleTask extends ExecutableJobWorkerTask
    implements ExecutableCalledDecision {

  private Expression decisionId;
  private String resultVariable;

  public ExecutableBusinessRuleTask(final String id) {
    super(id);
  }

  @Override
  public Expression getDecisionId() {
    return decisionId;
  }

  @Override
  public void setDecisionId(final Expression decisionId) {
    this.decisionId = decisionId;
  }

  @Override
  public String getResultVariable() {
    return resultVariable;
  }

  @Override
  public void setResultVariable(final String resultVariable) {
    this.resultVariable = resultVariable;
  }
}
