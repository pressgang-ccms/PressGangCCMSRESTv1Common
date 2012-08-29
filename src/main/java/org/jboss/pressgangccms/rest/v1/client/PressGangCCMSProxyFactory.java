package org.jboss.pressgangccms.rest.v1.client;

import java.net.URI;

import org.jboss.pressgangccms.rest.v1.converter.RESTLogDetailsV1JSONConverter;
import org.jboss.pressgangccms.rest.v1.jaxrsinterfaces.RESTInterfaceAdvancedV1;
import org.jboss.pressgangccms.rest.v1.jaxrsinterfaces.RESTInterfaceV1;
import org.jboss.resteasy.client.ClientRequestFactory;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

public class PressGangCCMSProxyFactory
{
    static
    {
       final ResteasyProviderFactory providerFactory = ResteasyProviderFactory.getInstance();
       providerFactory.addStringConverter(RESTLogDetailsV1JSONConverter.class);
       RegisterBuiltin.register(providerFactory);
    }
    
    private final ClientRequestFactory requestFactory;
    
    private PressGangCCMSProxyFactory(final String url)
    {
        final URI uri = ProxyFactory.createUri(fixUrl(url));
        requestFactory = new ClientRequestFactory(uri);
    }
    
    public static PressGangCCMSProxyFactory create(final String url)
    {
        return new PressGangCCMSProxyFactory(url);
    }
    
    private String fixUrl(final String url)
    {
        String fixedUrl = new String(url);
        if (!fixedUrl.endsWith("/"))
        {
            fixedUrl += "/";
        }
        
        return fixedUrl;
    }
    
    public RESTInterfaceV1 getRESTInterfaceV1Client()
    {
        return requestFactory.createProxy(RESTInterfaceV1.class);
    }
    
    public RESTInterfaceAdvancedV1 getRESTInterfaceAdvancedV1Client()
    {
        return requestFactory.createProxy(RESTInterfaceAdvancedV1.class);
    }
}
