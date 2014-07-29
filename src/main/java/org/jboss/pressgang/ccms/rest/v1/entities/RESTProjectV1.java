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

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTProjectV1 extends RESTBasePrimaryEntityV1<RESTProjectV1, RESTProjectCollectionV1, RESTProjectCollectionItemV1> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String TAGS_NAME = "tags";

    private String name = null;
    private String description = null;
    private RESTTagCollectionV1 tags = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTProjectCollectionV1 revisions = null;

    @Override
    public RESTProjectCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTProjectCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTProjectV1 clone(boolean deepCopy) {
        final RESTProjectV1 retValue = new RESTProjectV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTProjectV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.description = description;

        if (deepCopy) {
            if (tags != null) {
                clone.tags = new RESTTagCollectionV1();
                tags.cloneInto(clone.tags, deepCopy);
            } else {
                clone.tags = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTProjectCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }  else {
                clone.revisions = null;
            }
        } else {
            clone.tags = tags;
            clone.revisions = revisions;
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

    public RESTTagCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
        setParameterToConfigured(TAGS_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTProjectV1)) return false;

        return super.equals(other);
    }
}
