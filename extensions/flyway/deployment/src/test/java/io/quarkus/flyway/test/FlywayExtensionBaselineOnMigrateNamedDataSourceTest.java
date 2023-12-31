package io.quarkus.flyway.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.inject.Inject;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.flyway.FlywayDataSource;
import io.quarkus.test.QuarkusUnitTest;

public class FlywayExtensionBaselineOnMigrateNamedDataSourceTest {

    @Inject
    @FlywayDataSource("users")
    Flyway flyway;

    static final FlywayH2TestCustomizer customizer = FlywayH2TestCustomizer
            .withDbName("quarkus-flyway-baseline-on-named-ds")
            .withPort(11302)
            .withInitSqlFile("src/test/resources/h2-init-data.sql");

    @RegisterExtension
    static final QuarkusUnitTest config = new QuarkusUnitTest()
            .setBeforeAllCustomizer(customizer::startH2)
            .setAfterAllCustomizer(customizer::stopH2)
            .withApplicationRoot((jar) -> jar
                    .addClass(FlywayH2TestCustomizer.class)
                    .addAsResource("baseline-on-migrate-named-datasource.properties", "application.properties"));

    @Test
    @DisplayName("Create history table correctly")
    public void testFlywayInitialBaselineInfo() {
        MigrationInfo baselineInfo = flyway.info().applied()[0];

        assertEquals("0.0.1", baselineInfo.getVersion().getVersion());
        assertEquals("Initial description for test", baselineInfo.getDescription());
    }
}
