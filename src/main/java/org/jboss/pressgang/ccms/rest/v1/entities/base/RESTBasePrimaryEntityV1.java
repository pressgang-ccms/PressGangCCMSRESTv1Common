/*
  Copyright 2011-2014 Red Hat, Inc

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

package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;

public abstract class RESTBasePrimaryEntityV1<T extends RESTBasePrimaryEntityV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityV1<T, U, V> {
    private String selfLink = null;
    private String editLink = null;
    private String deleteLink = null;
    private String addLink = null;

    public void cloneInto(final RESTBasePrimaryEntityV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.setSelfLink(selfLink);
        clone.setEditLink(editLink);
        clone.setDeleteLink(deleteLink);
        clone.setAddLink(addLink);
    }

    public void setLinks(final String baseUrl, final String restBasePath, final String dataType, final Object id) {
        setSelfLink(baseUrl + (baseUrl.endsWith("/") ? "" : "/") + "1/" + restBasePath + "/get/" + dataType + "/" + id);
        setDeleteLink(baseUrl + (baseUrl.endsWith("/") ? "" : "/") + "1/" + restBasePath + "/delete/" + dataType + "/" + id);
        setAddLink(baseUrl + (baseUrl.endsWith("/") ? "" : "/") + "1/" + restBasePath + "/create/" + dataType);
        setEditLink(baseUrl + (baseUrl.endsWith("/") ? "" : "/") + "1/" + restBasePath + "/update/" + dataType);
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(final String selfLink) {
        this.selfLink = selfLink;
    }

    public String getEditLink() {
        return editLink;
    }

    public void setEditLink(final String editLink) {
        this.editLink = editLink;
    }

    public String getDeleteLink() {
        return deleteLink;
    }

    public void setDeleteLink(final String deleteLink) {
        this.deleteLink = deleteLink;
    }

    public String getAddLink() {
        return addLink;
    }

    public void setAddLink(final String addLink) {
        this.addLink = addLink;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBasePrimaryEntityV1)) return false;

        return super.equals(other);
    }
}
