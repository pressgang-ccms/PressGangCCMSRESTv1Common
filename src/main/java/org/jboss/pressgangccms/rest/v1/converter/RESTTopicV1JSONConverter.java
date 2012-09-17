package org.jboss.pressgangccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgangccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgangccms.rest.v1.entities.RESTTopicV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTTopicV1JSONConverter extends RESTBaseV1JSONConverter<RESTTopicV1> implements StringConverter<RESTTopicV1>
{
    public RESTTopicV1JSONConverter() 
   {
        super(RESTTopicV1.class);
    }
}
