/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.processing.bpmn.event;

import io.camunda.zeebe.engine.processing.bpmn.BpmnElementContext;
import io.camunda.zeebe.engine.processing.bpmn.BpmnElementContextImpl;
import io.camunda.zeebe.engine.processing.bpmn.BpmnElementProcessor;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnBehaviors;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnEventSubscriptionBehavior;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnIncidentBehavior;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnStateBehavior;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnStateTransitionBehavior;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnVariableMappingBehavior;
import io.camunda.zeebe.engine.processing.deployment.model.element.ExecutableCatchEventSupplier;
import io.camunda.zeebe.engine.processing.deployment.model.element.ExecutableStartEvent;

public class StartEventProcessor implements BpmnElementProcessor<ExecutableStartEvent> {

  private final BpmnStateTransitionBehavior stateTransitionBehavior;
  private final BpmnVariableMappingBehavior variableMappingBehavior;
  private final BpmnIncidentBehavior incidentBehavior;
  private final BpmnEventSubscriptionBehavior eventSubscriptionBehavior;
  private final BpmnStateBehavior stateBehavior;

  public StartEventProcessor(
      final BpmnBehaviors bpmnBehaviors,
      final BpmnStateTransitionBehavior stateTransitionBehavior) {
    incidentBehavior = bpmnBehaviors.incidentBehavior();
    this.stateTransitionBehavior = stateTransitionBehavior;
    variableMappingBehavior = bpmnBehaviors.variableMappingBehavior();
    eventSubscriptionBehavior = bpmnBehaviors.eventSubscriptionBehavior();
    stateBehavior = bpmnBehaviors.stateBehavior();
  }

  @Override
  public Class<ExecutableStartEvent> getType() {
    return ExecutableStartEvent.class;
  }

  @Override
  public void onActivate(final ExecutableStartEvent element, final BpmnElementContext context) {
    final var activated = stateTransitionBehavior.transitionToActivated(context);
    stateTransitionBehavior.completeElement(activated);
  }

  @Override
  public void onComplete(final ExecutableStartEvent element, final BpmnElementContext context) {
    final var flowScope = (ExecutableCatchEventSupplier) element.getFlowScope();

    final BpmnElementContextImpl flowScopeInstanceContext =
        buildContextForFlowScopeInstance(context);

    variableMappingBehavior
        .applyOutputMappings(context, element)
        .flatMap(
            ok -> eventSubscriptionBehavior.subscribeToEvents(flowScope, flowScopeInstanceContext))
        .flatMap(ok -> stateTransitionBehavior.transitionToCompleted(element, context))
        .ifRightOrLeft(
            completed -> stateTransitionBehavior.takeOutgoingSequenceFlows(element, completed),
            failure -> incidentBehavior.createIncident(failure, context));
  }

  @Override
  public void onTerminate(final ExecutableStartEvent element, final BpmnElementContext context) {
    final var terminated = stateTransitionBehavior.transitionToTerminated(context);

    incidentBehavior.resolveIncidents(terminated);
    stateTransitionBehavior.onElementTerminated(element, terminated);
  }

  private BpmnElementContextImpl buildContextForFlowScopeInstance(
      final BpmnElementContext context) {
    final var flowScopeInstance = stateBehavior.getFlowScopeInstance(context);
    final var flowScopeInstanceContext = new BpmnElementContextImpl();
    flowScopeInstanceContext.init(
        flowScopeInstance.getKey(), flowScopeInstance.getValue(), flowScopeInstance.getState());
    return flowScopeInstanceContext;
  }
}
