/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.client;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.jboss.pressgang.ccms.rest.v1.jaxrsinterfaces.RESTInterfaceAdvancedV1;
import org.jboss.pressgang.ccms.rest.v1.jaxrsinterfaces.RESTInterfaceV1;
import org.jboss.resteasy.client.ClientRequestFactory;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

public class PressGangCCMSProxyFactoryV1 {
    private static final ResteasyProviderFactory providerFactory = ResteasyProviderFactory.getInstance();
    static {
        // Configure the Jackson Provider to ignore Unknown Fields
        final ResteasyJacksonProvider jacksonProvider = new ResteasyJacksonProvider();
        jacksonProvider.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        providerFactory.registerProviderInstance(jacksonProvider);

        final APIVersionDecorator versionDecorator = new APIVersionDecorator("1.9");
        providerFactory.registerProviderInstance(versionDecorator);

        RegisterBuiltin.register(providerFactory);
    }

    private final ClientRequestFactory requestFactory;

    private PressGangCCMSProxyFactoryV1(final String url) {
        this(url, new ArrayList<Class<?>>());
    }

    private PressGangCCMSProxyFactoryV1(final String url, final List<Class<?>> providers) {
        final URI uri = ProxyFactory.createUri(fixUrl(url));
        requestFactory = new ClientRequestFactory(null, providerFactory, uri);
        requestFactory.setFollowRedirects(true);
        if (providers != null) {
            for (final Class<?> clazz : providers) {
                providerFactory.registerProvider(clazz);
            }
        }
    }

    public static PressGangCCMSProxyFactoryV1 create(final String url) {
        return new PressGangCCMSProxyFactoryV1(url);
    }

    public static PressGangCCMSProxyFactoryV1 create(final String url, List<Class<?>> providers) {
        return new PressGangCCMSProxyFactoryV1(url, providers);
    }

    private String fixUrl(final String url) {
        String fixedUrl = new String(url);
        if (!fixedUrl.endsWith("/")) {
            fixedUrl += "/";
        }

        return fixedUrl;
    }

    public RESTInterfaceV1 getRESTClient() {
        return requestFactory.createProxy(RESTInterfaceV1.class);
    }

    public RESTInterfaceAdvancedV1 getRESTAdvancedClient() {
        return requestFactory.createProxy(RESTInterfaceAdvancedV1.class);
    }

    public ResteasyProviderFactory getProviderFactory() {
        return providerFactory;
    }
}