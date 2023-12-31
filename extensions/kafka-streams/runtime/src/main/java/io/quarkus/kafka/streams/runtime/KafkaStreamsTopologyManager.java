package io.quarkus.kafka.streams.runtime;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.jboss.logging.Logger;

public class KafkaStreamsTopologyManager {

    private static final Logger LOGGER = Logger.getLogger(KafkaStreamsTopologyManager.class.getName());

    private final Admin adminClient;

    public KafkaStreamsTopologyManager(Admin adminClient) {
        this.adminClient = adminClient;
    }

    public Set<String> getMissingTopics(Collection<String> topicsToCheck) throws InterruptedException {
        return getMissingTopics(topicsToCheck, Duration.ofSeconds(10)); // keep defaults
    }

    public Set<String> getMissingTopics(Collection<String> topicsToCheck, Duration timeout) throws InterruptedException {
        Set<String> missing = new LinkedHashSet<>(topicsToCheck);

        try {
            ListTopicsResult topics = adminClient.listTopics();
            Set<String> topicNames = topics.names().get(timeout.toMillis(), TimeUnit.MILLISECONDS);

            if (topicNames.containsAll(topicsToCheck)) {
                return Collections.emptySet();
            } else {
                missing.removeAll(topicNames);
            }
        } catch (ExecutionException | TimeoutException e) {
            LOGGER.error("Failed to get topic names from broker", e);
        }

        return missing;
    }
}
