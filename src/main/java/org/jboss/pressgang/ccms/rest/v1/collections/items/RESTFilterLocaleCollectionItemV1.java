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

package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterLocaleV1;

public class RESTFilterLocaleCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1,
        RESTFilterLocaleCollectionItemV1> {
    private RESTFilterLocaleV1 item;

    public RESTFilterLocaleCollectionItemV1() {

    }

    public RESTFilterLocaleCollectionItemV1(final RESTFilterLocaleV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTFilterLocaleCollectionItemV1(final RESTFilterLocaleV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFilterLocaleCollectionItemV1 clone(boolean deepCopy) {
        final RESTFilterLocaleCollectionItemV1 retValue = new RESTFilterLocaleCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTFilterLocaleV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTFilterLocaleV1 item) {
        this.item = item;
    }
}