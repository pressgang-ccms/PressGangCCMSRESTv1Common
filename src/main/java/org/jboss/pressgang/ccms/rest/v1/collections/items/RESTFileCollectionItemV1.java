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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTFileCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFileV1;

public class RESTFileCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTFileV1, RESTFileCollectionV1, RESTFileCollectionItemV1> {
    private RESTFileV1 item;

    public RESTFileCollectionItemV1() {

    }

    public RESTFileCollectionItemV1(final RESTFileV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTFileCollectionItemV1(final RESTFileV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTFileCollectionItemV1 clone(boolean deepCopy) {
        final RESTFileCollectionItemV1 retValue = new RESTFileCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTFileV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTFileV1 item) {
        this.item = item;
    }
}