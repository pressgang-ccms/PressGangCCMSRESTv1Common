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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBlobConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBlobConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryAuditedEntityV1;

/**
 * A REST representation of the BlobConstants database entity
 */
public class RESTBlobConstantV1 extends RESTBasePrimaryAuditedEntityV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1,
        RESTBlobConstantCollectionItemV1> {
    public static final String NAME_NAME = "name";
    public static final String VALUE_NAME = "value";

    private String name = null;
    private byte[] value = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTBlobConstantCollectionV1 revisions = null;

    @Override
    public RESTBlobConstantCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTBlobConstantCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTBlobConstantV1 clone(boolean deepCopy) {
        final RESTBlobConstantV1 retValue = new RESTBlobConstantV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTBlobConstantV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;

        if (deepCopy) {
            if (value != null) {
                clone.value = new byte[value.length];
                System.arraycopy(value, 0, clone.value, 0, value.length);
            } else {
                clone.value = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTBlobConstantCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.value = value;
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

    public byte[] getValue() {
        return value;
    }

    public void setValue(final byte[] value) {
        this.value = value;
    }

    public void explicitSetValue(final byte[] value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBlobConstantV1)) return false;

        return super.equals(other);
    }
}
