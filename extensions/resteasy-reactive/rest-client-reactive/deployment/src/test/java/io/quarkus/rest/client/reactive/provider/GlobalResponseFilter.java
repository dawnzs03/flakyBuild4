package io.quarkus.rest.client.reactive.provider;

import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.ext.Provider;

import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientRequestContext;
import org.jboss.resteasy.reactive.client.spi.ResteasyReactiveClientResponseFilter;

@Provider
@Priority(20)
public class GlobalResponseFilter implements ResteasyReactiveClientResponseFilter {

    public static final int STATUS = 222;

    @Override
    public void filter(ResteasyReactiveClientRequestContext requestContext, ClientResponseContext responseContext) {
        if (responseContext.getStatus() != GlobalRequestFilter.STATUS) {
            responseContext.setStatus(STATUS);
        }
    }
}
