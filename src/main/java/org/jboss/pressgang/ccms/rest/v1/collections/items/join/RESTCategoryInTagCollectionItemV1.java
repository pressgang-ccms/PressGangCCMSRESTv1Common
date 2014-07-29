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
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryInTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;

public class RESTCategoryInTagCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTCategoryInTagV1, RESTCategoryInTagCollectionV1,
        RESTCategoryInTagCollectionItemV1> {
    private RESTCategoryInTagV1 item;

    public RESTCategoryInTagCollectionItemV1() {

    }

    public RESTCategoryInTagCollectionItemV1(final RESTCategoryInTagV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCategoryInTagCollectionItemV1(final RESTCategoryInTagV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCategoryInTagCollectionItemV1 clone(boolean deepCopy) {
        final RESTCategoryInTagCollectionItemV1 retValue = new RESTCategoryInTagCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCategoryInTagV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCategoryInTagV1 item) {
        this.item = item;
    }
}
