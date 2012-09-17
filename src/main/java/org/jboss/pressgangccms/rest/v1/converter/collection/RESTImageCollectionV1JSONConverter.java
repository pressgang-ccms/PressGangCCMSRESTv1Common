package org.jboss.pressgangccms.rest.v1.converter.collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgangccms.rest.v1.collections.RESTImageCollectionV1;
import org.jboss.pressgangccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTImageCollectionV1JSONConverter extends RESTBaseV1JSONConverter<RESTImageCollectionV1> implements StringConverter<RESTImageCollectionV1>
{
    public RESTImageCollectionV1JSONConverter()
    {
        super(RESTImageCollectionV1.class);
    }
}
