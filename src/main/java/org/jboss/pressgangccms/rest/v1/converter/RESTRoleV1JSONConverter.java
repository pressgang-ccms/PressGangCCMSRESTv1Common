package org.jboss.pressgangccms.rest.v1.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jboss.pressgangccms.rest.v1.converter.base.RESTBaseV1JSONConverter;
import org.jboss.pressgangccms.rest.v1.entities.RESTRoleV1;
import org.jboss.resteasy.spi.StringConverter;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTRoleV1JSONConverter extends RESTBaseV1JSONConverter<RESTRoleV1> implements StringConverter<RESTRoleV1>
{
    public RESTRoleV1JSONConverter()
    {
        super(RESTRoleV1.class);
    }
}
