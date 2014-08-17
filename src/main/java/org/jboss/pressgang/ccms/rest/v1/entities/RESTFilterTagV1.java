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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseAuditedEntityV1;

public class RESTFilterTagV1 extends RESTBaseAuditedEntityV1<RESTFilterTagV1, RESTFilterTagCollectionV1, RESTFilterTagCollectionItemV1> {
    public static final String TAG_NAME = "tag";
    public static final String STATE_NAME = "state";
    public static final String FILTER_NAME = "filter";

    private RESTTagV1 tag = null;
    private Integer state = null;
    private RESTFilterV1 filter = null;

    private RESTFilterTagCollectionV1 revisions = null;

    @Override
    public RESTFilterTagCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterTagCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterTagV1 clone(boolean deepCopy) {
        final RESTFilterTagV1 retValue = new RESTFilterTagV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTFilterTagV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.state = state;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTFilterTagCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }

            if (tag != null) {
                clone.tag = tag.clone(deepCopy);
            } else {
                clone.tag = null;
            }

            if (filter != null) {
                clone.filter = filter.clone(deepCopy);
            } else {
                clone.filter = null;
            }
        } else {
            clone.revisions = revisions;
            clone.tag = tag;
            clone.filter = filter;
        }
    }

    public RESTTagV1 getTag() {
        return tag;
    }

    public void setTag(final RESTTagV1 tag) {
        this.tag = tag;
    }

    public void explicitSetTag(final RESTTagV1 tag) {
        this.tag = tag;
        setParameterToConfigured(TAG_NAME);
    }

    public Integer getState() {
        return state;
    }

    public void setState(final Integer state) {
        this.state = state;
    }

    public void explicitSetState(final Integer state) {
        this.state = state;
        setParameterToConfigured(STATE_NAME);
    }

    public RESTFilterV1 getFilter() {
        return filter;
    }

    public void setFilter(final RESTFilterV1 filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTFilterTagV1)) return false;

        return super.equals(other);
    }
}
