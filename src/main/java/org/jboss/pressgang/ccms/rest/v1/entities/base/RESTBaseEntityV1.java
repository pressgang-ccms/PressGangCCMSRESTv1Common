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

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementWithConfiguredParametersV1;


public abstract class RESTBaseEntityV1<T extends RESTBaseEntityV1<T>> extends RESTBaseElementWithConfiguredParametersV1<T> {
    /**
     * The id of the entity
     */
    private Integer id = null;
    /**
     * The names of collections that can be expanded
     */
    private List<String> expand = null;

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseEntityV1)) return false;

        @SuppressWarnings("rawtypes")
        final RESTBaseEntityV1 otherCasted = (RESTBaseEntityV1) other;

        if (id == null && otherCasted.id == null) return true;
        if (id == null || otherCasted.id == null) return false;

        return id.equals(otherCasted.id);
    }

    @Override
    public int hashCode() {
        if (id == null) return 0;
        return id.hashCode();
    }

    public void cloneInto(final RESTBaseEntityV1<?> clone, final boolean deepCopy) {
        super.cloneInto(clone);
        clone.setId(id == null ? null : id);
        clone.setExpand(expand);
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(final List<String> expand) {
        this.expand = expand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
