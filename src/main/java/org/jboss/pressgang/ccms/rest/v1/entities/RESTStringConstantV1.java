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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTStringConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTStringConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryAuditedEntityV1;

/**
 * A REST representation of the StringConstants database entity
 */
public class RESTStringConstantV1 extends RESTBasePrimaryAuditedEntityV1<RESTStringConstantV1, RESTStringConstantCollectionV1,
        RESTStringConstantCollectionItemV1> {
    public static final String ID_NAME = "id";
    public static final String NAME_NAME = "name";
    public static final String VALUE_NAME = "value";

    private String name = null;
    private String value = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTStringConstantCollectionV1 revisions = null;

    @Override
    public RESTStringConstantCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTStringConstantCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTStringConstantV1 clone(boolean deepCopy) {
        final RESTStringConstantV1 retValue = new RESTStringConstantV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTStringConstantV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.value = value;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTStringConstantCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
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

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void explicitSetValue(final String value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTStringConstantV1)) return false;

        return super.equals(other);
    }
}
