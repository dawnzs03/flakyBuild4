package io.quarkus.bootstrap.resolver.maven.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import io.quarkus.bootstrap.resolver.maven.BootstrapMavenContext;

public class CentralRepoOverridesEffectivePomTest extends BootstrapMavenContextTestBase {

    @Test
    public void basicPomRepos() throws Exception {
        final BootstrapMavenContext mvn = bootstrapMavenContextForProject("effective-pom/central-repo-overrides");
        Files.createDirectories(mvn.getCurrentProjectBaseDir().resolve("target"));
        assertEquals(
                Arrays.asList(
                        newRepo("central", "https://settings.central"),
                        newRepo("other-pom-repo", "https://pom.other")),
                mvn.getRemoteRepositories());
    }
}
