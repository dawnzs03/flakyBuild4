package io.quarkus.it.main;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Assertions;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.callback.QuarkusTestBeforeClassCallback;

public class SimpleAnnotationCheckerBeforeClassCallback implements QuarkusTestBeforeClassCallback {

    public static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void beforeClass(Class<?> testClass) {
        if (testClass.isAnnotationPresent(QuarkusTest.class)) {
            assertQuarkusClassLoader(Thread.currentThread().getContextClassLoader());
            assertQuarkusClassLoader(testClass.getClassLoader());
        }

        // make sure that this comes into play only for the test we care about
        if (!testClass.getName().startsWith("io.quarkus.it.main.QuarkusTestCallbacks")) {
            return;
        }

        count.incrementAndGet();
    }

    private void assertQuarkusClassLoader(ClassLoader contextClassLoader) {
        Assertions.assertTrue(contextClassLoader.getClass().getName().contains("QuarkusClassLoader"));
    }
}
