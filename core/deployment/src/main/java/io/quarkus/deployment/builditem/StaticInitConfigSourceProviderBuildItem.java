package io.quarkus.deployment.builditem;

import io.quarkus.builder.item.MultiBuildItem;

/**
 * Provides a way to register a ConfigSourceProvider in STATIC INIT.
 *
 * @deprecated Please use {@link StaticInitConfigBuilderBuildItem} instead.
 */
@Deprecated
public final class StaticInitConfigSourceProviderBuildItem extends MultiBuildItem {
    private final String providerClassName;

    public StaticInitConfigSourceProviderBuildItem(String providerClassName) {
        this.providerClassName = providerClassName;
    }

    public String getProviderClassName() {
        return providerClassName;
    }
}
