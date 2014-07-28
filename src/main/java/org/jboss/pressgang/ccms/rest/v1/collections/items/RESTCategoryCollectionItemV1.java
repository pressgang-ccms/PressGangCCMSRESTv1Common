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

package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;

public class RESTCategoryCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTCategoryV1, RESTCategoryCollectionV1,
        RESTCategoryCollectionItemV1> {
    private RESTCategoryV1 item;

    public RESTCategoryCollectionItemV1() {

    }

    public RESTCategoryCollectionItemV1(final RESTCategoryV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCategoryCollectionItemV1(final RESTCategoryV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCategoryCollectionItemV1 clone(boolean deepCopy) {
        final RESTCategoryCollectionItemV1 retValue = new RESTCategoryCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCategoryV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCategoryV1 item) {
        this.item = item;
    }
}
