/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.gateway;

import io.camunda.zeebe.gateway.impl.configuration.GatewayCfg;
import io.camunda.zeebe.scheduler.ActorScheduler;
import io.camunda.zeebe.shared.ActorClockConfiguration;
import io.camunda.zeebe.util.VisibleForTesting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@VisibleForTesting
public final class ActorSchedulerComponent {

  private final GatewayCfg config;
  private final ActorClockConfiguration clockConfiguration;

  @Autowired
  public ActorSchedulerComponent(
      final GatewayCfg config, final ActorClockConfiguration clockConfiguration) {
    this.config = config;
    this.clockConfiguration = clockConfiguration;
  }

  @Bean(destroyMethod = "close")
  public ActorScheduler actorScheduler() {
    return ActorScheduler.newActorScheduler()
        .setCpuBoundActorThreadCount(config.getThreads().getManagementThreads())
        .setIoBoundActorThreadCount(0)
        .setSchedulerName("Gateway-%s".formatted(config.getCluster().getMemberId()))
        .setActorClock(clockConfiguration.getClock().orElse(null))
        .build();
  }
}
