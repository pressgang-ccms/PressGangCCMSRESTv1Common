package org.jboss.pressgangccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgangccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgangccms.rest.v1.entities.RESTImageV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTImageV1JSONConverter extends RESTBaseV1JSONConverter<RESTImageV1>implements StringConverter<RESTImageV1>
{
    public RESTImageV1JSONConverter()
    {
        super(RESTImageV1.class);
    }
}
