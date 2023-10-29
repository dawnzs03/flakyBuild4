/*
 * Copyright © 2017 camunda services GmbH (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.camunda.zeebe.protocol.record.value;

import io.camunda.zeebe.protocol.record.ImmutableProtocol;
import io.camunda.zeebe.protocol.record.RecordValue;
import io.camunda.zeebe.protocol.record.intent.EscalationIntent;
import org.immutables.value.Value;

/**
 * Represents an escalation event
 *
 * <p>See {@link EscalationIntent} for intents.
 */
@Value.Immutable
@ImmutableProtocol(builder = ImmutableEscalationRecordValue.Builder.class)
public interface EscalationRecordValue extends RecordValue {

  /**
   * @return the key of the process instance
   */
  long getProcessInstanceKey();

  /**
   * @return the code of the escalation
   */
  String getEscalationCode();

  /**
   * @return the id of the escalation throw event
   */
  String getThrowElementId();

  /**
   * @return the id of the escalation catch event
   */
  String getCatchElementId();
}
