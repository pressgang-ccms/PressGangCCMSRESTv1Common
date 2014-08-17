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
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagInPropertyCategoryCollectionV1;

public abstract class RESTBasePropertyCategoryV1<T extends RESTBasePropertyCategoryV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBasePrimaryAuditedEntityV1<T, U, V> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String PROPERTY_TAGS_NAME = "propertyTags";

    protected String name = null;
    protected String description = null;
    protected RESTPropertyTagInPropertyCategoryCollectionV1 propertyTags = null;

    public void cloneInto(final RESTBasePropertyCategoryV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.description = description;

        if (deepCopy) {
            if (propertyTags != null) {
                clone.propertyTags = new RESTPropertyTagInPropertyCategoryCollectionV1();
                propertyTags.cloneInto(clone.propertyTags, deepCopy);
            }
        } else {
            clone.propertyTags = propertyTags;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public RESTPropertyTagInPropertyCategoryCollectionV1 getPropertyTags() {
        return propertyTags;
    }

    public void setPropertyTags(final RESTPropertyTagInPropertyCategoryCollectionV1 propertyTags) {
        this.propertyTags = propertyTags;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBasePropertyCategoryV1)) return false;

        return super.equals(other);
    }
}
