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
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;

public abstract class RESTBaseEntityWithPropertiesV1<T extends RESTBaseEntityWithPropertiesV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T,
        U, V>, V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBasePrimaryAuditedEntityV1<T, U, V> {
    public static String PROPERTIES_NAME = "properties";

    protected RESTAssignedPropertyTagCollectionV1 properties = null;

    public void cloneInto(final RESTBaseEntityWithPropertiesV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (this.properties != null) {
                clone.properties = new RESTAssignedPropertyTagCollectionV1();
                this.properties.cloneInto(clone.properties, deepCopy);
            } else {
                clone.properties = null;
            }
        } else {
            clone.properties = this.properties;
        }
    }

    public RESTAssignedPropertyTagCollectionV1 getProperties() {
        return properties;
    }

    public void setProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseEntityWithPropertiesV1)) return false;

        return super.equals(other);
    }
}
