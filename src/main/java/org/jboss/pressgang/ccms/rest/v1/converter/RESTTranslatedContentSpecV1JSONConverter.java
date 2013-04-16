package org.jboss.pressgang.ccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTranslatedContentSpecV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTTranslatedContentSpecV1JSONConverter extends RESTBaseV1JSONConverter<RESTTranslatedContentSpecV1> implements
        StringConverter<RESTTranslatedContentSpecV1> {
    public RESTTranslatedContentSpecV1JSONConverter() {
        super(RESTTranslatedContentSpecV1.class);
    }
}
