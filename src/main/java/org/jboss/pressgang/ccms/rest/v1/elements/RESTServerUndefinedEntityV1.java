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

package org.jboss.pressgang.ccms.rest.v1.elements;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseUndefinedSettingV1;

public class RESTServerUndefinedEntityV1 extends RESTBaseUndefinedSettingV1<RESTServerUndefinedEntityV1, Integer> {
    public static final String VALUE_NAME = "value";

    private Integer value;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(final Integer value) {
        this.value = value;
    }

    public void explicitSetValue(final Integer value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public RESTServerUndefinedEntityV1 clone(boolean deepCopy) {
        final RESTServerUndefinedEntityV1 clone = new RESTServerUndefinedEntityV1();

        cloneInto(clone, deepCopy);

        return clone;
    }

    public void cloneInto(final RESTServerUndefinedEntityV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.value = value;
    }
}
