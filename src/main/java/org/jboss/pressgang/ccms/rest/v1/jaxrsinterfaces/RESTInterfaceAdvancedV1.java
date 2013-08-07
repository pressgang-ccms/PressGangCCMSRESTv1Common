package org.jboss.pressgang.ccms.rest.v1.jaxrsinterfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

import org.jboss.resteasy.plugins.providers.atom.Feed;

/**
 * This interface defines the REST endpoints that are not supported by Errai.
 *
 * @author Matthew Casperson
 */
public interface RESTInterfaceAdvancedV1 {
    @GET
    @Path("/topics/get/atom/{query}")
    @Produces(MediaType.APPLICATION_ATOM_XML)
    @Consumes(MediaType.MEDIA_TYPE_WILDCARD)
    Feed getATOMTopicsWithQuery(@PathParam("query") PathSegment query, @QueryParam("expand") final String expand);
}
