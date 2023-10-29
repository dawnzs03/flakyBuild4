/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.processing.job;

import io.camunda.zeebe.engine.metrics.JobMetrics;
import io.camunda.zeebe.engine.processing.bpmn.behavior.BpmnBehaviors;
import io.camunda.zeebe.engine.processing.common.EventHandle;
import io.camunda.zeebe.engine.processing.streamprocessor.TypedRecordProcessors;
import io.camunda.zeebe.engine.processing.streamprocessor.writers.Writers;
import io.camunda.zeebe.engine.state.mutable.MutableProcessingState;
import io.camunda.zeebe.protocol.record.ValueType;
import io.camunda.zeebe.protocol.record.intent.JobBatchIntent;
import io.camunda.zeebe.protocol.record.intent.JobIntent;

public final class JobEventProcessors {

  public static void addJobProcessors(
      final TypedRecordProcessors typedRecordProcessors,
      final MutableProcessingState processingState,
      final BpmnBehaviors bpmnBehaviors,
      final Writers writers,
      final JobMetrics jobMetrics) {

    final var jobState = processingState.getJobState();
    final var keyGenerator = processingState.getKeyGenerator();

    final EventHandle eventHandle =
        new EventHandle(
            keyGenerator,
            processingState.getEventScopeInstanceState(),
            writers,
            processingState.getProcessState(),
            bpmnBehaviors.eventTriggerBehavior(),
            bpmnBehaviors.stateBehavior());

    final var jobBackoffChecker = new JobBackoffChecker(jobState);
    typedRecordProcessors
        .onCommand(
            ValueType.JOB,
            JobIntent.COMPLETE,
            new JobCompleteProcessor(processingState, jobMetrics, eventHandle))
        .onCommand(
            ValueType.JOB,
            JobIntent.FAIL,
            new JobFailProcessor(
                processingState,
                writers,
                processingState.getKeyGenerator(),
                jobMetrics,
                jobBackoffChecker,
                bpmnBehaviors))
        .onCommand(
            ValueType.JOB,
            JobIntent.YIELD,
            new JobYieldProcessor(processingState, bpmnBehaviors, writers))
        .onCommand(
            ValueType.JOB,
            JobIntent.THROW_ERROR,
            new JobThrowErrorProcessor(
                processingState,
                bpmnBehaviors.eventPublicationBehavior(),
                keyGenerator,
                jobMetrics))
        .onCommand(
            ValueType.JOB,
            JobIntent.TIME_OUT,
            new JobTimeOutProcessor(
                processingState, writers, jobMetrics, bpmnBehaviors.jobActivationBehavior()))
        .onCommand(
            ValueType.JOB, JobIntent.UPDATE_RETRIES, new JobUpdateRetriesProcessor(processingState))
        .onCommand(
            ValueType.JOB, JobIntent.CANCEL, new JobCancelProcessor(processingState, jobMetrics))
        .onCommand(
            ValueType.JOB,
            JobIntent.RECUR_AFTER_BACKOFF,
            new JobRecurProcessor(processingState, writers, bpmnBehaviors.jobActivationBehavior()))
        .onCommand(
            ValueType.JOB_BATCH,
            JobBatchIntent.ACTIVATE,
            new JobBatchActivateProcessor(
                writers, processingState, processingState.getKeyGenerator(), jobMetrics))
        .withListener(new JobTimeoutTrigger(jobState))
        .withListener(jobBackoffChecker);
  }
}
