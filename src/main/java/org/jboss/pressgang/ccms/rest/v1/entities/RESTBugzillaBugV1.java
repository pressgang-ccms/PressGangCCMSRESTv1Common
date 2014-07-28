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

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBugzillaBugCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBugzillaBugCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;


public class RESTBugzillaBugV1 extends RESTBaseEntityV1<RESTBugzillaBugV1, RESTBugzillaBugCollectionV1, RESTBugzillaBugCollectionItemV1> {
    public static final String BUG_ID = "bugzillaBugId";
    public static final String BUG_ISOPEN = "bugIsOpen";
    public static final String BUG_SUMMARY = "bugSummary";

    private Integer bugId = null;
    private Boolean isOpen = null;
    private String summary = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTBugzillaBugCollectionV1 revisions = null;

    @Override
    public RESTBugzillaBugCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTBugzillaBugCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTBugzillaBugV1 clone(boolean deepCopy) {
        final RESTBugzillaBugV1 retValue = new RESTBugzillaBugV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTBugzillaBugV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.bugId = bugId == null ? null : bugId;
        clone.isOpen = isOpen == null ? null : isOpen;
        clone.summary = summary;


        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTBugzillaBugCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.revisions = revisions;
        }

    }

    public Integer getBugId() {
        return bugId;
    }

    public void setBugId(final Integer bugId) {
        this.bugId = bugId;
    }

    public void setBugIdExplicit(final Integer bugId) {
        this.bugId = bugId;
        setParameterToConfigured(BUG_ID);
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(final Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void setIsOpenExplicit(final Boolean isOpen) {
        this.isOpen = isOpen;
        setParameterToConfigured(BUG_ISOPEN);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public void setSummaryExplicit(final String summary) {
        this.summary = summary;
        setParameterToConfigured(BUG_SUMMARY);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBugzillaBugV1)) return false;

        return super.equals(other);
    }

}
