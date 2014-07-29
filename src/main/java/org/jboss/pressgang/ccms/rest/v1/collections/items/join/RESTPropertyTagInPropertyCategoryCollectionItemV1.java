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
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagInPropertyCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagInPropertyCategoryV1;

public class RESTPropertyTagInPropertyCategoryCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTPropertyTagInPropertyCategoryV1, RESTPropertyTagInPropertyCategoryCollectionV1,
                RESTPropertyTagInPropertyCategoryCollectionItemV1> {
    private RESTPropertyTagInPropertyCategoryV1 item;

    public RESTPropertyTagInPropertyCategoryCollectionItemV1() {

    }

    public RESTPropertyTagInPropertyCategoryCollectionItemV1(final RESTPropertyTagInPropertyCategoryV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTPropertyTagInPropertyCategoryCollectionItemV1(final RESTPropertyTagInPropertyCategoryV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyTagInPropertyCategoryCollectionItemV1 clone(boolean deepCopy) {
        final RESTPropertyTagInPropertyCategoryCollectionItemV1 retValue = new RESTPropertyTagInPropertyCategoryCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTPropertyTagInPropertyCategoryV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyTagInPropertyCategoryV1 item) {
        this.item = item;
    }
}