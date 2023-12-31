package io.quarkus.rest.client.reactive.provider;

import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.ext.Provider;

import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientRequestContext;
import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientResponseFilter;

@Priority(10) // lower prio here means executed later
@Provider
public class GlobalResponseFilterLowPrio implements ResteasyReactiveClientResponseFilter {

    public static final int STATUS = 244;
    public static boolean skip = false;

    @Override
    public void filter(ResteasyReactiveClientRequestContext requestContext, ClientResponseContext responseContext) {
        if (!skip) {
            responseContext.setStatus(STATUS);
        }
    }
}
