/*
  Copyright 2011-2014 Red Hat

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

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
