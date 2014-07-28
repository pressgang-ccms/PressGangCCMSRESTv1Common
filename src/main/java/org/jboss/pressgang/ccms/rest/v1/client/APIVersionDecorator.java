/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.client;

import javax.ws.rs.ext.Provider;

import org.jboss.pressgang.ccms.rest.v1.constants.RESTv1Constants;
import org.jboss.resteasy.annotations.interception.ClientInterceptor;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.spi.interception.ClientExecutionContext;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;

@Provider
@ClientInterceptor
public class APIVersionDecorator implements ClientExecutionInterceptor {
    private final String version;

    public APIVersionDecorator(String version) {
        this.version = version;
    }

    public APIVersionDecorator() {
        version = "unknown";
    }

    @Override
    public ClientResponse execute(ClientExecutionContext clientExecutionContext) throws Exception {
        if (version != null) {
            clientExecutionContext.getRequest().getHeadersAsObjects().add(RESTv1Constants.X_VERSION_HEADER, version);
        }
        return clientExecutionContext.proceed();
    }
}
