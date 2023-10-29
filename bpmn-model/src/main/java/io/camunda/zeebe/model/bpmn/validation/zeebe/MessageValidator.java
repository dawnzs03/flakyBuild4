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
package io.camunda.zeebe.model.bpmn.validation.zeebe;

import io.camunda.zeebe.model.bpmn.instance.BoundaryEvent;
import io.camunda.zeebe.model.bpmn.instance.EndEvent;
import io.camunda.zeebe.model.bpmn.instance.ExtensionElements;
import io.camunda.zeebe.model.bpmn.instance.IntermediateCatchEvent;
import io.camunda.zeebe.model.bpmn.instance.IntermediateThrowEvent;
import io.camunda.zeebe.model.bpmn.instance.Message;
import io.camunda.zeebe.model.bpmn.instance.MessageEventDefinition;
import io.camunda.zeebe.model.bpmn.instance.Process;
import io.camunda.zeebe.model.bpmn.instance.ReceiveTask;
import io.camunda.zeebe.model.bpmn.instance.SendTask;
import io.camunda.zeebe.model.bpmn.instance.StartEvent;
import io.camunda.zeebe.model.bpmn.instance.SubProcess;
import io.camunda.zeebe.model.bpmn.instance.zeebe.ZeebeSubscription;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.camunda.bpm.model.xml.impl.ModelInstanceImpl;
import org.camunda.bpm.model.xml.impl.util.ModelUtil;
import org.camunda.bpm.model.xml.instance.DomElement;
import org.camunda.bpm.model.xml.instance.ModelElementInstance;
import org.camunda.bpm.model.xml.validation.ModelElementValidator;
import org.camunda.bpm.model.xml.validation.ValidationResultCollector;

public class MessageValidator implements ModelElementValidator<Message> {

  @Override
  public Class<Message> getElementType() {
    return Message.class;
  }

  @Override
  public void validate(
      final Message element, final ValidationResultCollector validationResultCollector) {
    if (isReferredByCatchEvent(element)
        || isReferredByReceiveTask(element)
        || isReferredByEventSubProcessStartEvent(element)) {
      validateName(element, validationResultCollector);
      validateSubscription(element, validationResultCollector);
    } else if (isReferredByThrowEvent(element) || isReferredBySendTask(element)) {
      validateName(element, validationResultCollector);
    } else {
      validateIfReferredByStartEvent(element, validationResultCollector);
    }
  }

  private void validateName(
      final Message element, final ValidationResultCollector validationResultCollector) {
    if (element.getName() == null || element.getName().isEmpty()) {
      validationResultCollector.addError(0, "Name must be present and not empty");
    }
  }

  private void validateSubscription(
      final Message element, final ValidationResultCollector validationResultCollector) {
    final ExtensionElements extensionElements = element.getExtensionElements();

    if (extensionElements == null
        || extensionElements.getChildElementsByType(ZeebeSubscription.class).size() != 1) {
      validationResultCollector.addError(
          0, "Must have exactly one zeebe:subscription extension element");
    }
  }

  private void validateIfReferredByStartEvent(
      final Message element, final ValidationResultCollector validationResultCollector) {
    final Collection<StartEvent> startEvents =
        element.getParentElement().getChildElementsByType(Process.class).stream()
            .flatMap(p -> p.getChildElementsByType(StartEvent.class).stream())
            .collect(Collectors.toList());
    final long numReferredStartEvents =
        startEvents.stream()
            .flatMap(i -> i.getEventDefinitions().stream())
            .filter(
                e ->
                    e instanceof MessageEventDefinition
                        && ((MessageEventDefinition) e).getMessage() == element)
            .count();

    if (numReferredStartEvents > 1) {
      validationResultCollector.addError(
          0, "A message cannot be referred by more than one start event");
    } else if (numReferredStartEvents == 1) {
      validateName(element, validationResultCollector);
    }
  }

  private boolean isReferredByCatchEvent(final Message element) {
    final Collection<IntermediateCatchEvent> intermediateCatchEvents =
        getAllElementsByType(element, IntermediateCatchEvent.class);

    final Collection<BoundaryEvent> boundaryEvents =
        getAllElementsByType(element, BoundaryEvent.class);

    return Stream.concat(intermediateCatchEvents.stream(), boundaryEvents.stream())
        .flatMap(i -> i.getEventDefinitions().stream())
        .anyMatch(
            e ->
                e instanceof MessageEventDefinition
                    && ((MessageEventDefinition) e).getMessage() == element);
  }

  private boolean isReferredByThrowEvent(final Message element) {
    final Collection<IntermediateThrowEvent> intermediateCatchEvents =
        getAllElementsByType(element, IntermediateThrowEvent.class);

    final Collection<EndEvent> endEvents = getAllElementsByType(element, EndEvent.class);

    return Stream.concat(intermediateCatchEvents.stream(), endEvents.stream())
        .flatMap(i -> i.getEventDefinitions().stream())
        .filter(MessageEventDefinition.class::isInstance)
        .anyMatch(e -> ((MessageEventDefinition) e).getMessage() == element);
  }

  private boolean isReferredBySendTask(final Message element) {
    final Collection<SendTask> sendTasks = getAllElementsByType(element, SendTask.class);

    return sendTasks.stream().anyMatch(r -> r.getMessage() == element);
  }

  private boolean isReferredByReceiveTask(final Message element) {
    final Collection<ReceiveTask> receiveTasks = getAllElementsByType(element, ReceiveTask.class);

    return receiveTasks.stream().anyMatch(r -> r.getMessage() == element);
  }

  private boolean isReferredByEventSubProcessStartEvent(final Message element) {
    final Collection<StartEvent> startEvents =
        element.getParentElement().getChildElementsByType(Process.class).stream()
            .flatMap(p -> p.getChildElementsByType(SubProcess.class).stream())
            .flatMap(p -> p.getChildElementsByType(StartEvent.class).stream())
            .collect(Collectors.toList());
    final long numReferredSubProcessStartEvents =
        startEvents.stream()
            .flatMap(i -> i.getEventDefinitions().stream())
            .filter(
                e ->
                    e instanceof MessageEventDefinition
                        && ((MessageEventDefinition) e).getMessage() == element)
            .count();
    return numReferredSubProcessStartEvents == 1;
  }

  private <T extends ModelElementInstance> Collection<T> getAllElementsByType(
      final Message element, final Class<T> type) {
    return element.getParentElement().getChildElementsByType(Process.class).stream()
        .flatMap(p -> getAllElementsByTypeRecursive(p, type).stream())
        .collect(Collectors.toList());
  }

  private <T extends ModelElementInstance> Collection<T> getAllElementsByTypeRecursive(
      final ModelElementInstance element, final Class<T> type) {

    // look for immediate children
    final Collection<T> result = element.getChildElementsByType(type);

    // look for children in subtree
    final List<DomElement> childDomElements = element.getDomElement().getChildElements();
    final Collection<ModelElementInstance> childModelElements =
        ModelUtil.getModelElementCollection(
            childDomElements, (ModelInstanceImpl) element.getModelInstance());

    result.addAll(
        childModelElements.stream()
            .flatMap(child -> getAllElementsByTypeRecursive(child, type).stream())
            .collect(Collectors.toList()));

    return result;
  }
}
