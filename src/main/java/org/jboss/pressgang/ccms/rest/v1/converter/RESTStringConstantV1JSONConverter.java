package org.jboss.pressgang.ccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTStringConstantV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTStringConstantV1JSONConverter extends RESTBaseV1JSONConverter<RESTStringConstantV1> implements
        StringConverter<RESTStringConstantV1> {
    public RESTStringConstantV1JSONConverter() {
        super(RESTStringConstantV1.class);
    }
}
