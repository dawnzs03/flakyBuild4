package io.quarkus.elytron.security.ldap.config;

import java.time.Duration;
import java.util.Optional;

import org.wildfly.security.auth.realm.ldap.DirContextFactory;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class DirContextConfig {

    /**
     * The url of the ldap server
     */
    @ConfigItem
    public String url;

    /**
     * The principal: user which is used to connect to ldap server (also named "bindDn")
     */
    @ConfigItem
    public Optional<String> principal;

    /**
     * The password which belongs to the principal (also named "bindCredential")
     */
    @ConfigItem
    public Optional<String> password;

    /**
     * how ldap redirects are handled
     */
    @ConfigItem(defaultValue = "ignore")
    public DirContextFactory.ReferralMode referralMode;

    /**
     * The connect timeout
     */
    @ConfigItem(defaultValue = "5s")
    public Duration connectTimeout;

    /**
     * The read timeout
     */
    @ConfigItem(defaultValue = "60s")
    public Duration readTimeout;

    @Override
    public String toString() {
        return "DirContextConfig{" +
                "url='" + url + '\'' +
                ", principal=" + principal +
                ", password=" + password +
                ", referralMode=" + referralMode +
                ", connectTimeout=" + connectTimeout +
                ", readTimeout=" + readTimeout +
                '}';
    }
}
