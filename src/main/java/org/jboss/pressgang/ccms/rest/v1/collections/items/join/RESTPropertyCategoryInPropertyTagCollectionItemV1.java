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

package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryInPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryInPropertyTagV1;

public class RESTPropertyCategoryInPropertyTagCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTPropertyCategoryInPropertyTagV1, RESTPropertyCategoryInPropertyTagCollectionV1,
                RESTPropertyCategoryInPropertyTagCollectionItemV1> {
    private RESTPropertyCategoryInPropertyTagV1 item;

    public RESTPropertyCategoryInPropertyTagCollectionItemV1() {

    }

    public RESTPropertyCategoryInPropertyTagCollectionItemV1(final RESTPropertyCategoryInPropertyTagV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTPropertyCategoryInPropertyTagCollectionItemV1(final RESTPropertyCategoryInPropertyTagV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTPropertyCategoryInPropertyTagCollectionItemV1 clone(boolean deepCopy) {
        final RESTPropertyCategoryInPropertyTagCollectionItemV1 retValue = new RESTPropertyCategoryInPropertyTagCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTPropertyCategoryInPropertyTagV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTPropertyCategoryInPropertyTagV1 item) {
        this.item = item;
    }
}