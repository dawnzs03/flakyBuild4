/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.metrics;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;

import io.camunda.zeebe.engine.util.EngineRule;
import io.camunda.zeebe.model.bpmn.Bpmn;
import io.camunda.zeebe.protocol.record.intent.IncidentIntent;
import io.camunda.zeebe.protocol.record.intent.ProcessInstanceIntent;
import io.camunda.zeebe.protocol.record.value.BpmnElementType;
import io.camunda.zeebe.test.util.record.RecordingExporter;
import java.util.Map;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

public class ProcessEngineMetricsTest {

  @ClassRule public static final EngineRule ENGINE = EngineRule.singlePartition();

  private static final String DMN_RESOURCE = "/dmn/drg-force-user.dmn";
  private static final String PROCESS_ID = "process";
  private static final String TASK_ID = "task";

  @Before
  public void resetMetrics() {
    ProcessEngineMetrics.EVALUATED_DMN_ELEMENTS.clear();
    ProcessEngineMetrics.EXECUTED_INSTANCES.clear();
    ProcessEngineMetrics.CREATED_PROCESS_INSTANCES.clear();
  }

  @Test
  public void shouldIncreaseSuccessfullyEvaluatedDmnElements() {
    ENGINE
        .deployment()
        .withXmlClasspathResource(DMN_RESOURCE)
        .withXmlResource(
            Bpmn.createExecutableProcess(PROCESS_ID)
                .startEvent()
                .businessRuleTask(
                    TASK_ID,
                    t -> t.zeebeCalledDecisionId("force_user").zeebeResultVariable("result"))
                .endEvent()
                .done())
        .deploy();

    final long processInstanceKey =
        ENGINE
            .processInstance()
            .ofBpmnProcessId(PROCESS_ID)
            .withVariables(Map.of("lightsaberColor", "blue", "height", 175))
            .create();

    RecordingExporter.processInstanceRecords(ProcessInstanceIntent.ELEMENT_COMPLETED)
        .withProcessInstanceKey(processInstanceKey)
        .withElementType(BpmnElementType.PROCESS)
        .await();

    assertThat(activatedProcessInstanceMetric()).isNotNull().isEqualTo(1);

    assertThat(completedProcessInstanceMetric()).isNotNull().isEqualTo(1);

    assertThat(succeededEvaluatedDmnElementsMetric())
        .isNotNull()
        .describedAs(
            "Expected two decision where executed, i.e. the root decision and one required decision")
        .isEqualTo(2);
  }

  @Test
  public void shouldIncreaseFailedEvaluatedDmnElements() {
    ENGINE
        .deployment()
        .withXmlClasspathResource(DMN_RESOURCE)
        .withXmlResource(
            Bpmn.createExecutableProcess(PROCESS_ID)
                .startEvent()
                .businessRuleTask(
                    TASK_ID,
                    t -> t.zeebeCalledDecisionId("force_user").zeebeResultVariable("result"))
                .endEvent()
                .done())
        .deploy();

    final long processInstanceKey =
        ENGINE
            .processInstance()
            .ofBpmnProcessId(PROCESS_ID)
            .withVariable("lightsaberColor", "blue")
            .create();

    RecordingExporter.incidentRecords(IncidentIntent.CREATED)
        .withProcessInstanceKey(processInstanceKey)
        .await();

    ENGINE.processInstance().withInstanceKey(processInstanceKey).cancel();

    RecordingExporter.processInstanceRecords(ProcessInstanceIntent.ELEMENT_TERMINATED)
        .withProcessInstanceKey(processInstanceKey)
        .withElementType(BpmnElementType.PROCESS)
        .await();

    assertThat(activatedProcessInstanceMetric()).isNotNull().isEqualTo(1);

    assertThat(terminatedProcessInstanceMetric()).isNotNull().isEqualTo(1);

    assertThat(failedEvaluatedDmnElementsMetric())
        .isNotNull()
        .describedAs(
            "Expected two decision where executed as the required decision succeeded but the root decision failed")
        .isEqualTo(2);
  }

  @Test
  public void shouldIncreaseFailedEvaluatedDmnElementsIfRequiredDecisionFailed() {
    ENGINE
        .deployment()
        .withXmlClasspathResource(DMN_RESOURCE)
        .withXmlResource(
            Bpmn.createExecutableProcess(PROCESS_ID)
                .startEvent()
                .businessRuleTask(
                    TASK_ID,
                    t -> t.zeebeCalledDecisionId("force_user").zeebeResultVariable("result"))
                .endEvent()
                .done())
        .deploy();

    final long processInstanceKey = ENGINE.processInstance().ofBpmnProcessId(PROCESS_ID).create();

    RecordingExporter.incidentRecords(IncidentIntent.CREATED)
        .withProcessInstanceKey(processInstanceKey)
        .await();

    assertThat(failedEvaluatedDmnElementsMetric())
        .isNotNull()
        .describedAs("Expected only one decision was executed as the required decision failed")
        .isEqualTo(1);
  }

  @Test
  public void shouldIncreaseProcessInstanceCreatedAtDefaultStartEvent() {
    // given
    ENGINE
        .deployment()
        .withXmlResource(
            Bpmn.createExecutableProcess(PROCESS_ID).startEvent("start").endEvent("end").done())
        .deploy();

    // when
    ENGINE.processInstance().ofBpmnProcessId(PROCESS_ID).create();

    // then
    assertThat(processInstanceCreationsMetric("creation_at_given_element")).isNull();
    assertThat(processInstanceCreationsMetric("creation_at_default_start_event")).isEqualTo(1);
  }

  @Test
  public void shouldIncreaseProcessInstanceCreatedAtGivenElement() {
    // given
    ENGINE
        .deployment()
        .withXmlResource(
            Bpmn.createExecutableProcess(PROCESS_ID).startEvent("start").endEvent("end").done())
        .deploy();

    // when
    ENGINE.processInstance().ofBpmnProcessId(PROCESS_ID).withStartInstruction("end").create();

    // then
    assertThat(processInstanceCreationsMetric("creation_at_default_start_event")).isNull();
    assertThat(processInstanceCreationsMetric("creation_at_given_element")).isEqualTo(1);
  }

  private Double activatedProcessInstanceMetric() {
    return executedProcessInstanceMetric("activated");
  }

  private Double completedProcessInstanceMetric() {
    return executedProcessInstanceMetric("completed");
  }

  private Double terminatedProcessInstanceMetric() {
    return executedProcessInstanceMetric("terminated");
  }

  private Double executedProcessInstanceMetric(final String action) {
    return MetricsTestHelper.readMetricValue(
        "zeebe_executed_instances_total",
        entry("organizationId", "null"),
        entry("type", "ROOT_PROCESS_INSTANCE"),
        entry("action", action),
        entry("partition", "1"));
  }

  private Double processInstanceCreationsMetric(final String creationMode) {
    return MetricsTestHelper.readMetricValue(
        "zeebe_process_instance_creations_total",
        entry("partition", "1"),
        entry("creation_mode", creationMode));
  }

  private Double succeededEvaluatedDmnElementsMetric() {
    return evaluatedDmnElementsMetric("evaluated_successfully");
  }

  private Double failedEvaluatedDmnElementsMetric() {
    return evaluatedDmnElementsMetric("evaluated_failed");
  }

  private Double evaluatedDmnElementsMetric(final String action) {
    return MetricsTestHelper.readMetricValue(
        "zeebe_evaluated_dmn_elements_total",
        entry("organizationId", "null"),
        entry("action", action),
        entry("partition", "1"));
  }
}
