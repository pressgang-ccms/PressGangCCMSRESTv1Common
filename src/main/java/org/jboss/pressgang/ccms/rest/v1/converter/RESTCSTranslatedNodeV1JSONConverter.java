package org.jboss.pressgang.ccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSTranslatedNodeV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTCSTranslatedNodeV1JSONConverter extends RESTBaseV1JSONConverter<RESTCSTranslatedNodeV1> implements
        StringConverter<RESTCSTranslatedNodeV1> {
    public RESTCSTranslatedNodeV1JSONConverter() {
        super(RESTCSTranslatedNodeV1.class);
    }
}
