package io.quarkus.kubernetes.service.binding.runtime;

import static io.quarkus.kubernetes.service.binding.runtime.KubernetesServiceBindingConfigSourceFactory.getServiceBindings;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.entry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.junit.jupiter.api.Test;

class KubernetesServiceBindingConfigSourceFactoryTest {

    @Test
    void testNonExistentDir() throws IOException {
        Path path = Files.createTempDirectory("tmp");
        KubernetesServiceBindingConfigSourceFactory configSourceFactory = new KubernetesServiceBindingConfigSourceFactory();
        Iterable<ConfigSource> configSources = configSourceFactory
                .getConfigSources(getServiceBindings(path.resolve("non-existent").toString()), emptyList());
        assertThat(configSources).isEmpty();
    }

    @Test
    void testNotDir() throws IOException {
        Path path = Files.createTempDirectory("tmp");
        assertThatIllegalArgumentException()
                .isThrownBy(() -> getServiceBindings(Files.createFile(path.resolve("file")).toString()));
    }

    @Test
    void test() {
        Path path = Paths.get("src/test/resources/k8s");
        KubernetesServiceBindingConfigSourceFactory configSourceFactory = new KubernetesServiceBindingConfigSourceFactory();
        Iterable<ConfigSource> configSources = configSourceFactory.getConfigSources(getServiceBindings(path.toString()),
                List.of(
                        serviceBindings -> {
                            for (ServiceBinding serviceBinding : serviceBindings) {
                                if ("test-type-1".equals(serviceBinding.getType())) {
                                    return Optional.of(new ServiceBindingConfigSource("test",
                                            Map.of("key", serviceBinding.getProperties().get("test-secret-key"))));
                                }
                            }
                            return Optional.of(new ServiceBindingConfigSource("test",
                                    Map.of("key", ServiceBinding.matchingByType("test-type-1", serviceBindings).get(0)
                                            .getProperties().get("test-secret-key"))));
                        }));

        assertThat(configSources).hasSize(3).extracting("name").containsOnly("test", "service-binding-test-name-raw",
                "service-binding-test-k8s-raw");
        assertThat(configSources).filteredOn(c -> c.getName().equals("test")).singleElement()
                .satisfies(c -> assertThat(c.getProperties()).containsExactly(entry("key", "test-secret-value")));
        assertThat(configSources).filteredOn(c -> c.getName().equals("service-binding-test-name-raw")).singleElement()
                .satisfies(c -> assertThat(c.getProperties()).containsOnly(
                        entry("quarkus.service-binding.test-name.test-secret-key", "test-secret-value-2"),
                        entry("quarkus.service-binding.test-name.test-other-secret-key", "test-other-secret-value-2")));
    }
}
