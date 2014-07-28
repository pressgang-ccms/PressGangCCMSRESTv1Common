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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTIntegerConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTIntegerConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

/**
 * A REST representation of the StringConstants database entity
 */
public class RESTIntegerConstantV1 extends RESTBasePrimaryEntityV1<RESTIntegerConstantV1, RESTIntegerConstantCollectionV1,
        RESTIntegerConstantCollectionItemV1> {
    public static final String ID_NAME = "id";
    public static final String NAME_NAME = "name";
    public static final String VALUE_NAME = "value";

    private String name = null;
    private Integer value = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTIntegerConstantCollectionV1 revisions = null;

    @Override
    public RESTIntegerConstantCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTIntegerConstantCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTIntegerConstantV1 clone(boolean deepCopy) {
        final RESTIntegerConstantV1 retValue = new RESTIntegerConstantV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTIntegerConstantV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.value = value;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTIntegerConstantCollectionV1();
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

    public Integer getValue() {
        return value;
    }

    public void setValue(final Integer value) {
        this.value = value;
    }

    public void explicitSetValue(final Integer value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTIntegerConstantV1)) return false;

        return super.equals(other);
    }
}
