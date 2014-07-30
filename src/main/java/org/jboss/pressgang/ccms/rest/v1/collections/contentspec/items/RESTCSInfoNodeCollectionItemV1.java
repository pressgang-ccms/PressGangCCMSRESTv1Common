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

package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSInfoNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSInfoNodeV1;

public class RESTCSInfoNodeCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTCSInfoNodeV1, RESTCSInfoNodeCollectionV1,
        RESTCSInfoNodeCollectionItemV1> {
    private RESTCSInfoNodeV1 item;

    public RESTCSInfoNodeCollectionItemV1() {

    }

    public RESTCSInfoNodeCollectionItemV1(final RESTCSInfoNodeV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCSInfoNodeCollectionItemV1(final RESTCSInfoNodeV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSInfoNodeCollectionItemV1 clone(boolean deepCopy) {
        final RESTCSInfoNodeCollectionItemV1 retValue = new RESTCSInfoNodeCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCSInfoNodeV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCSInfoNodeV1 item) {
        this.item = item;
    }
}
