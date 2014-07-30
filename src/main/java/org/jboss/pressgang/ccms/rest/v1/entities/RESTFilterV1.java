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

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterFieldCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;
import org.jboss.pressgang.ccms.rest.v1.entities.enums.RESTFilterTypeV1;

public class RESTFilterV1 extends RESTBasePrimaryEntityV1<RESTFilterV1, RESTFilterCollectionV1, RESTFilterCollectionItemV1> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String TYPE_NAME = "type";
    public static final String FILTER_TAGS_NAME = "filterTags_OTM";
    public static final String FILTER_LOCALES_NAME = "filterLocales_OTM";
    public static final String FILTER_CATEGORIES_NAME = "filterCategories_OTM";
    public static final String FILTER_FIELDS_NAME = "filterFields_OTM";

    private String name = null;
    private String description = null;
    private RESTFilterTypeV1 type = null;
    private RESTFilterTagCollectionV1 filterTags_OTM = null;
    private RESTFilterLocaleCollectionV1 filterLocales_OTM = null;
    private RESTFilterCategoryCollectionV1 filterCategories_OTM = null;
    private RESTFilterFieldCollectionV1 filterFields_OTM = null;

    private RESTFilterCollectionV1 revisions = null;

    @Override
    public RESTFilterCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterV1 clone(boolean deepCopy) {
        final RESTFilterV1 retValue = new RESTFilterV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTFilterV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.description = description;
        clone.type = type;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTFilterCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }

            if (filterCategories_OTM != null) {
                clone.filterCategories_OTM = new RESTFilterCategoryCollectionV1();
                filterCategories_OTM.cloneInto(clone.filterCategories_OTM, deepCopy);
            } else {
                clone.filterCategories_OTM = null;
            }

            if (filterLocales_OTM != null) {
                clone.filterLocales_OTM = new RESTFilterLocaleCollectionV1();
                filterLocales_OTM.cloneInto(clone.filterLocales_OTM, deepCopy);
            } else {
                clone.filterLocales_OTM = null;
            }

            if (filterTags_OTM != null) {
                clone.filterTags_OTM = new RESTFilterTagCollectionV1();
                filterTags_OTM.cloneInto(clone.filterTags_OTM, deepCopy);
            } else {
                clone.filterTags_OTM = null;
            }

            if (filterFields_OTM != null) {
                clone.filterFields_OTM = new RESTFilterFieldCollectionV1();
                filterFields_OTM.cloneInto(clone.filterFields_OTM, deepCopy);
            } else {
                clone.filterFields_OTM = null;
            }
        } else {
            clone.revisions = revisions;
            clone.filterCategories_OTM = filterCategories_OTM;
            clone.filterLocales_OTM = filterLocales_OTM;
            clone.filterTags_OTM = filterTags_OTM;
            clone.filterFields_OTM = filterFields_OTM;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void explicitSetName(final String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public RESTFilterTypeV1 getType() {
        return type;
    }

    public void setType(final RESTFilterTypeV1 type) {
        this.type = type;
    }

    public void explicitSetType(final RESTFilterTypeV1 type) {
        this.type = type;
        setParameterToConfigured(TYPE_NAME);
    }

    public RESTFilterTagCollectionV1 getFilterTags_OTM() {
        return filterTags_OTM;
    }

    public void setFilterTags_OTM(final RESTFilterTagCollectionV1 filterTags) {
        filterTags_OTM = filterTags;
    }

    public void explicitSetFilterTags_OTM(final RESTFilterTagCollectionV1 filterTags) {
        filterTags_OTM = filterTags;
        setParameterToConfigured(FILTER_TAGS_NAME);
    }

    public RESTFilterLocaleCollectionV1 getFilterLocales_OTM() {
        return filterLocales_OTM;
    }

    public void setFilterLocales_OTM(final RESTFilterLocaleCollectionV1 filterLocales) {
        filterLocales_OTM = filterLocales;
    }

    public void explicitSetFilterLocales_OTM(final RESTFilterLocaleCollectionV1 filterLocales) {
        filterLocales_OTM = filterLocales;
        setParameterToConfigured(FILTER_LOCALES_NAME);
    }

    public RESTFilterCategoryCollectionV1 getFilterCategories_OTM() {
        return filterCategories_OTM;
    }

    public void setFilterCategories_OTM(final RESTFilterCategoryCollectionV1 filterCategories) {
        filterCategories_OTM = filterCategories;
    }

    public void explicitSetFilterCategories_OTM(final RESTFilterCategoryCollectionV1 filterCategories) {
        filterCategories_OTM = filterCategories;
        setParameterToConfigured(FILTER_CATEGORIES_NAME);
    }

    public RESTFilterFieldCollectionV1 getFilterFields_OTM() {
        return filterFields_OTM;
    }

    public void setFilterFields_OTM(final RESTFilterFieldCollectionV1 filterFields) {
        filterFields_OTM = filterFields;
    }

    public void explicitSetFilterFields_OTM(final RESTFilterFieldCollectionV1 filterFields) {
        filterFields_OTM = filterFields;
        setParameterToConfigured(FILTER_FIELDS_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTFilterV1)) return false;

        return super.equals(other);
    }
}