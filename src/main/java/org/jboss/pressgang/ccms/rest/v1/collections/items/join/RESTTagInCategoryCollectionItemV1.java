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

package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagInCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTTagInCategoryV1;

public class RESTTagInCategoryCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTTagInCategoryV1, RESTTagInCategoryCollectionV1,
        RESTTagInCategoryCollectionItemV1> {
    private RESTTagInCategoryV1 item;

    public RESTTagInCategoryCollectionItemV1() {

    }

    public RESTTagInCategoryCollectionItemV1(final RESTTagInCategoryV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTagInCategoryCollectionItemV1(final RESTTagInCategoryV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTagInCategoryCollectionItemV1 clone(boolean deepCopy) {
        final RESTTagInCategoryCollectionItemV1 retValue = new RESTTagInCategoryCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTagInCategoryV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTagInCategoryV1 item) {
        this.item = item;
    }
}