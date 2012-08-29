package org.jboss.pressgangccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTLogDetailsV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTLogDetailsV1JSONConverter implements StringConverter<RESTLogDetailsV1>
{

    final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public RESTLogDetailsV1 fromString(String arg0)
    {
        try
        {
            return mapper.readValue(arg0, RESTLogDetailsV1.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString(RESTLogDetailsV1 arg0)
    {
        try
        {
            return mapper.writeValueAsString(arg0);
        } catch (Exception e) {
         // TODO Something intelligent
        }
        return null;
    }

}
