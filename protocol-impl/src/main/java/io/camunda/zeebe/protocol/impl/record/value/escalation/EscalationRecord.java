/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.protocol.impl.record.value.escalation;

import io.camunda.zeebe.msgpack.property.LongProperty;
import io.camunda.zeebe.msgpack.property.StringProperty;
import io.camunda.zeebe.protocol.impl.record.UnifiedRecordValue;
import io.camunda.zeebe.protocol.record.value.EscalationRecordValue;
import io.camunda.zeebe.util.buffer.BufferUtil;
import org.agrona.DirectBuffer;

public class EscalationRecord extends UnifiedRecordValue implements EscalationRecordValue {

  private final LongProperty processInstanceKeyProp = new LongProperty("processInstanceKey", -1L);
  private final StringProperty escalationCodeProp = new StringProperty("escalationCode", "");
  private final StringProperty throwElementIdProp = new StringProperty("throwElementId", "");
  private final StringProperty catchElementIdProp = new StringProperty("catchElementId", "");

  public EscalationRecord() {
    declareProperty(processInstanceKeyProp)
        .declareProperty(escalationCodeProp)
        .declareProperty(throwElementIdProp)
        .declareProperty(catchElementIdProp);
  }

  public void wrap(final EscalationRecord record) {
    processInstanceKeyProp.setValue(record.getProcessInstanceKey());
    escalationCodeProp.setValue(record.getEscalationCode());
    throwElementIdProp.setValue(record.getThrowElementId());
    catchElementIdProp.setValue(record.getCatchElementId());
  }

  @Override
  public long getProcessInstanceKey() {
    return processInstanceKeyProp.getValue();
  }

  @Override
  public String getEscalationCode() {
    return BufferUtil.bufferAsString(escalationCodeProp.getValue());
  }

  public EscalationRecord setEscalationCode(final String escalationCode) {
    escalationCodeProp.setValue(escalationCode);
    return this;
  }

  @Override
  public String getThrowElementId() {
    return BufferUtil.bufferAsString(throwElementIdProp.getValue());
  }

  @Override
  public String getCatchElementId() {
    return BufferUtil.bufferAsString(catchElementIdProp.getValue());
  }

  public EscalationRecord setCatchElementId(final DirectBuffer catchElementId) {
    catchElementIdProp.setValue(catchElementId);
    return this;
  }

  public EscalationRecord setThrowElementId(final DirectBuffer throwElementId) {
    throwElementIdProp.setValue(throwElementId);
    return this;
  }

  public EscalationRecord setProcessInstanceKey(final long processInstanceKey) {
    processInstanceKeyProp.setValue(processInstanceKey);
    return this;
  }
}
