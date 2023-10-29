/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.broker.exporter.stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;

import io.camunda.zeebe.broker.exporter.repo.ExporterDescriptor;
import io.camunda.zeebe.broker.exporter.util.ControlledTestExporter;
import io.camunda.zeebe.protocol.impl.record.value.deployment.DeploymentRecord;
import io.camunda.zeebe.protocol.record.intent.DeploymentIntent;
import io.camunda.zeebe.scheduler.clock.ControlledActorClock;
import io.camunda.zeebe.util.buffer.BufferUtil;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.agrona.DirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionEvaluationListener;
import org.awaitility.core.EvaluatedCondition;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public final class ExporterDirectorDistributionTest {

  private static final String EXPORTER_ID_1 = "exporter-1";
  private static final String EXPORTER_ID_2 = "exporter-2";

  private static final DirectBuffer EXPORTER_METADATA_1 = BufferUtil.wrapString("e1");
  private static final DirectBuffer EXPORTER_METADATA_2 = BufferUtil.wrapString("e2");

  private static final UnsafeBuffer NO_METADATA = new UnsafeBuffer();

  private static final Duration DISTRIBUTION_INTERVAL = Duration.ofSeconds(15);

  private final SimplePartitionMessageService simplePartitionMessageService =
      new SimplePartitionMessageService();

  @Rule
  public final ExporterRule activeExporters =
      ExporterRule.activeExporter()
          .withPartitionMessageService(simplePartitionMessageService)
          .withDistributionInterval(DISTRIBUTION_INTERVAL);

  @Rule
  public final ExporterRule passiveExporters =
      ExporterRule.passiveExporter().withPartitionMessageService(simplePartitionMessageService);

  private final List<ControlledTestExporter> exporters = new ArrayList<>();
  private final List<ExporterDescriptor> exporterDescriptors = new ArrayList<>();

  @Before
  public void init() {
    exporters.clear();
    exporterDescriptors.clear();

    createExporter(EXPORTER_ID_1, EXPORTER_METADATA_1);
    createExporter(EXPORTER_ID_2, EXPORTER_METADATA_2);
  }

  @After
  public void tearDown() throws Exception {
    activeExporters.closeExporterDirector();
    passiveExporters.closeExporterDirector();
  }

  private void createExporter(final String exporterId, final DirectBuffer exporterMetadata) {
    final ControlledTestExporter exporter = spy(new ControlledTestExporter());

    final ExporterDescriptor descriptor =
        spy(new ExporterDescriptor(exporterId, exporter.getClass(), Map.of()));
    doAnswer(c -> exporter).when(descriptor).newInstance();

    final var exporterMetadataBytes = BufferUtil.bufferAsArray(exporterMetadata);
    exporter.onExport(
        record ->
            exporter
                .getController()
                .updateLastExportedRecordPosition(record.getPosition(), exporterMetadataBytes));

    exporters.add(exporter);
    exporterDescriptors.add(descriptor);
  }

  private void startExporters(final List<ExporterDescriptor> exporterDescriptors) {
    activeExporters.startExporterDirector(exporterDescriptors);
    passiveExporters.startExporterDirector(exporterDescriptors);
  }

  @Test
  public void shouldDistributeExporterState() {
    // given
    startExporters(exporterDescriptors);

    final long position =
        activeExporters.writeEvent(DeploymentIntent.CREATED, new DeploymentRecord());

    final var activeExporterState = activeExporters.getExportersState();
    Awaitility.await("Director has read all records and update the positions.")
        .untilAsserted(
            () -> {
              assertThat(activeExporterState.getPosition(EXPORTER_ID_1)).isEqualTo(position);
              assertThat(activeExporterState.getExporterMetadata(EXPORTER_ID_1))
                  .isEqualTo(EXPORTER_METADATA_1);

              assertThat(activeExporterState.getPosition(EXPORTER_ID_2)).isEqualTo(position);
              assertThat(activeExporterState.getExporterMetadata(EXPORTER_ID_2))
                  .isEqualTo(EXPORTER_METADATA_2);
            });

    final var passiveExporterState = passiveExporters.getExportersState();
    assertThat(passiveExporterState.getPosition(EXPORTER_ID_1)).isEqualTo(-1);
    assertThat(passiveExporterState.getExporterMetadata(EXPORTER_ID_1)).isEqualTo(NO_METADATA);

    assertThat(passiveExporterState.getPosition(EXPORTER_ID_2)).isEqualTo(-1);
    assertThat(passiveExporterState.getExporterMetadata(EXPORTER_ID_2)).isEqualTo(NO_METADATA);

    // when
    activeExporters.getClock().addTime(DISTRIBUTION_INTERVAL);

    // then
    Awaitility.await("Active Director has distributed positions and passive has received it")
        .conditionEvaluationListener(new ClockShifter(activeExporters.getClock()))
        .untilAsserted(
            () -> {
              assertThat(passiveExporterState.getPosition(EXPORTER_ID_1)).isEqualTo(position);
              assertThat(passiveExporterState.getExporterMetadata(EXPORTER_ID_1))
                  .isEqualTo(EXPORTER_METADATA_1);

              assertThat(passiveExporterState.getPosition(EXPORTER_ID_2)).isEqualTo(position);
              assertThat(passiveExporterState.getExporterMetadata(EXPORTER_ID_2))
                  .isEqualTo(EXPORTER_METADATA_2);
            });
  }

  @Test
  public void shouldNotResetExporterPositionWhenOldPositionReceived() {
    // given
    startExporters(exporterDescriptors);

    Awaitility.await("Exporter has recovered and started exporting.")
        .untilAsserted(
            () ->
                assertThat(activeExporters.getDirector().getPhase().join())
                    .isEqualTo(ExporterPhase.EXPORTING));

    final long position = 10L;
    activeExporters.getExportersState().setPosition(EXPORTER_ID_1, position);
    activeExporters.getExportersState().setPosition(EXPORTER_ID_2, position);

    activeExporters.getClock().addTime(DISTRIBUTION_INTERVAL);

    final var passiveExporterState = passiveExporters.getExportersState();
    Awaitility.await("Active Director has distributed positions and passive has received it")
        .conditionEvaluationListener(new ClockShifter(activeExporters.getClock()))
        .untilAsserted(
            () -> {
              assertThat(passiveExporterState.getPosition(EXPORTER_ID_1)).isEqualTo(position);
              assertThat(passiveExporterState.getPosition(EXPORTER_ID_2)).isEqualTo(position);
            });

    // when
    activeExporters.getExportersState().setPosition(EXPORTER_ID_1, position - 1);
    activeExporters.getExportersState().setPosition(EXPORTER_ID_2, position + 1);

    activeExporters.getClock().addTime(DISTRIBUTION_INTERVAL);
    Awaitility.await("Active Director has distributed positions and passive has received it")
        .conditionEvaluationListener(new ClockShifter(activeExporters.getClock()))
        .untilAsserted(
            () ->
                assertThat(passiveExporterState.getPosition(EXPORTER_ID_2))
                    .isEqualTo(position + 1));

    // then - the exported position should not go back
    assertThat(passiveExporterState.getPosition(EXPORTER_ID_1)).isEqualTo(position);
  }

  /**
   * Shifts the actor clock by the {@link this#DISTRIBUTION_INTERVAL} after an awaitility condition
   * was evaluated.
   *
   * <p>This makes sure that even if we miss one export position event, we distribute the event
   * later again, which makes tests less flaky.
   */
  private record ClockShifter(ControlledActorClock clock)
      implements ConditionEvaluationListener<Void> {

    @Override
    public void conditionEvaluated(final EvaluatedCondition<Void> condition) {
      clock.addTime(DISTRIBUTION_INTERVAL);
    }
  }
}
