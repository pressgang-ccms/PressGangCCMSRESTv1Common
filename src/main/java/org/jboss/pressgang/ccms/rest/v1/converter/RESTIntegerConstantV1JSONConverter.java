package org.jboss.pressgang.ccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTIntegerConstantV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTIntegerConstantV1JSONConverter extends RESTBaseV1JSONConverter<RESTIntegerConstantV1>implements StringConverter<RESTIntegerConstantV1>
{
    public RESTIntegerConstantV1JSONConverter()
    {
        super(RESTIntegerConstantV1.class);
    }
}