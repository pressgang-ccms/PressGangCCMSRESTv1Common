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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTUserCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTUserV1;

public class RESTUserCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTUserV1, RESTUserCollectionV1, RESTUserCollectionItemV1> {
    private RESTUserV1 item;

    public RESTUserCollectionItemV1() {

    }

    public RESTUserCollectionItemV1(final RESTUserV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTUserCollectionItemV1(final RESTUserV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTUserCollectionItemV1 clone(boolean deepCopy) {
        final RESTUserCollectionItemV1 retValue = new RESTUserCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTUserV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTUserV1 item) {
        this.item = item;
    }
}