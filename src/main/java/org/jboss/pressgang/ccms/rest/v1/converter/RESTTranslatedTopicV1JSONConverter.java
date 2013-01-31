package org.jboss.pressgang.ccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTTranslatedTopicV1JSONConverter extends RESTBaseV1JSONConverter<RESTTranslatedTopicV1> implements
        StringConverter<RESTTranslatedTopicV1> {
    public RESTTranslatedTopicV1JSONConverter() {
        super(RESTTranslatedTopicV1.class);
    }
}
