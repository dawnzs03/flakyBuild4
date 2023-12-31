package io.quarkus.smallrye.faulttolerance.test.asynchronous.additional;

import java.util.concurrent.CompletionStage;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.faulttolerance.Retry;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.common.annotation.NonBlocking;

@ApplicationScoped
@Blocking
@NonBlocking
public class BlockingNonBlockingOnClassService {
    @Retry
    public CompletionStage<String> hello() {
        throw new IllegalArgumentException();
    }
}
