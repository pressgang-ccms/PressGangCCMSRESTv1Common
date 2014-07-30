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

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTextContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTextContentSpecV1;

public class RESTTextContentSpecCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTTextContentSpecV1, RESTTextContentSpecCollectionV1,
        RESTTextContentSpecCollectionItemV1> {
    private RESTTextContentSpecV1 item;

    public RESTTextContentSpecCollectionItemV1() {

    }

    public RESTTextContentSpecCollectionItemV1(final RESTTextContentSpecV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTextContentSpecCollectionItemV1(final RESTTextContentSpecV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTextContentSpecCollectionItemV1 clone(boolean deepCopy) {
        final RESTTextContentSpecCollectionItemV1 retValue = new RESTTextContentSpecCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTextContentSpecV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTextContentSpecV1 item) {
        this.item = item;
    }
}
