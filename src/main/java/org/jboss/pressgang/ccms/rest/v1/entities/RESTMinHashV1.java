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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTMinHashCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTMinHashCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;


public class RESTMinHashV1 extends RESTBaseEntityV1<RESTMinHashV1, RESTMinHashCollectionV1, RESTMinHashCollectionItemV1> {

    private Integer minHash;
    private Integer minHashFuncId;
    /**
     * A list of the Envers revision numbers
     */
    private RESTMinHashCollectionV1 revisions = null;

    @Override
    public RESTMinHashCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTMinHashCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTMinHashV1 clone(boolean deepCopy) {
        final RESTMinHashV1 retValue = new RESTMinHashV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTMinHashV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.minHash = minHash;
        clone.minHashFuncId = minHashFuncId;

        if (deepCopy) {

            if (revisions != null) {
                clone.revisions = new RESTMinHashCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }  else {
                clone.revisions = null;
            }
        } else {
            clone.revisions = revisions;
        }
    }

    public Integer getMinHash() {
        return minHash;
    }

    public void setMinHash(final Integer minHash) {
        this.minHash = minHash;
    }

    public Integer getMinHashFuncId() {
        return minHashFuncId;
    }

    public void setMinHashFuncId(final Integer minHashFuncId) {
        this.minHashFuncId = minHashFuncId;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTMinHashV1)) return false;

        return super.equals(other);
    }
}
