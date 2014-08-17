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


public abstract class RESTBaseAuditedEntityV1<T extends RESTBaseAuditedEntityV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityV1<T> {
    public static final String REVISIONS_NAME = "revisions";
    public static final String LOG_DETAILS_NAME = "logDetails";

    /**
     * The revision of the entity
     */
    private Integer revision = null;
    private RESTLogDetailsV1 logDetails = null;

    public abstract U getRevisions();

    public abstract void setRevisions(U revisions);

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseAuditedEntityV1)) return false;

        @SuppressWarnings("rawtypes")
        final RESTBaseAuditedEntityV1 otherCasted = (RESTBaseAuditedEntityV1) other;

        if (getId() == null && otherCasted.getId() == null) {
            if (revision == null && otherCasted.revision == null) return super.equals(other);

            if (revision == null || otherCasted.revision == null) return false;

            return revision.equals(otherCasted.revision);
        }

        if (getId() == null || otherCasted.getId() == null) return false;

        if (getId().equals(otherCasted.getId())) {
            if (revision == null && otherCasted.revision == null) return true;

            if (revision == null || otherCasted.revision == null) return false;

            return revision.equals(otherCasted.revision);
        } else {
            return false;
        }
    }

    public void cloneInto(final RESTBaseAuditedEntityV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);
        clone.setRevision(revision);

        if (deepCopy) {
            if (logDetails != null) {
                clone.setLogDetails(logDetails.clone(deepCopy));
            }
        } else {
            clone.setLogDetails(logDetails);
        }
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(final Integer revision) {
        this.revision = revision;
    }

    public RESTLogDetailsV1 getLogDetails() {
        return logDetails;
    }

    public void setLogDetails(final RESTLogDetailsV1 logDetails) {
        this.logDetails = logDetails;
    }
}
