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

package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

public class RESTAssignedPropertyTagCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTAssignedPropertyTagV1,
        RESTAssignedPropertyTagCollectionV1, RESTAssignedPropertyTagCollectionItemV1> {
    private RESTAssignedPropertyTagV1 item;

    public RESTAssignedPropertyTagCollectionItemV1() {

    }

    public RESTAssignedPropertyTagCollectionItemV1(final RESTAssignedPropertyTagV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTAssignedPropertyTagCollectionItemV1(final RESTAssignedPropertyTagV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTAssignedPropertyTagCollectionItemV1 clone(boolean deepCopy) {
        final RESTAssignedPropertyTagCollectionItemV1 retValue = new RESTAssignedPropertyTagCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTAssignedPropertyTagV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTAssignedPropertyTagV1 item) {
        this.item = item;
    }
}
