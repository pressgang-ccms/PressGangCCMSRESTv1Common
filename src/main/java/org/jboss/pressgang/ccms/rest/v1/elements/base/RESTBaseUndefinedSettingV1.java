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

package org.jboss.pressgang.ccms.rest.v1.elements.base;

public abstract class RESTBaseUndefinedSettingV1<T extends RESTBaseUndefinedSettingV1<T, U>,
        U> extends RESTBaseElementWithConfiguredParametersV1<T> {
    public static final String KEY_NAME = "key";

    protected String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public abstract U getValue();

    public abstract void setValue(U value);

    public abstract T clone(boolean deepCopy);

    public void cloneInto(final RESTBaseUndefinedSettingV1<?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone);

        clone.key = key;
    }
}
