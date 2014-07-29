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

package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryInPropertyTagCollectionV1;

public abstract class RESTBasePropertyTagV1<T extends RESTBasePropertyTagV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBasePrimaryEntityV1<T, U, V> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String REGEX_NAME = "regex";
    public static final String CANBENULL_NAME = "canBeNull";
    public static final String ISUNIQUE_NAME = "isUnique";
    public static final String PROPERTY_CATEGORIES_NAME = "propertyCategories";

    protected String name = null;
    protected String description = null;
    protected String regex = null;
    protected boolean canBeNull;
    protected boolean isUnique;

    protected RESTPropertyCategoryInPropertyTagCollectionV1 propertyCategories = null;

    public void cloneInto(final RESTBasePropertyTagV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.description = description;
        clone.regex = regex;
        clone.canBeNull = canBeNull;
        clone.isUnique = isUnique;

        if (deepCopy) {
            if (propertyCategories != null) {
                clone.propertyCategories = new RESTPropertyCategoryInPropertyTagCollectionV1();
                propertyCategories.cloneInto(clone.propertyCategories, deepCopy);
            }
        } else {
            clone.propertyCategories = propertyCategories;
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

    public String getRegex() {
        return regex;
    }

    public void setRegex(final String regex) {
        this.regex = regex;
    }

    public boolean getCanBeNull() {
        return canBeNull;
    }

    public void setCanBeNull(final boolean canBeNull) {
        this.canBeNull = canBeNull;
    }

    public boolean getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(boolean isUnique) {
        this.isUnique = isUnique;
    }

    public RESTPropertyCategoryInPropertyTagCollectionV1 getPropertyCategories() {
        return propertyCategories;
    }

    public void setPropertyCategories(final RESTPropertyCategoryInPropertyTagCollectionV1 propertyTagCategories) {
        propertyCategories = propertyTagCategories;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBasePropertyTagV1)) return false;

        return super.equals(other);
    }
}
