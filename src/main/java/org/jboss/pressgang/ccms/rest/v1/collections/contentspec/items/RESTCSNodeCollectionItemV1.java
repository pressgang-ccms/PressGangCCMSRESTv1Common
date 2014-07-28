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

package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;

public class RESTCSNodeCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTCSNodeV1, RESTCSNodeCollectionV1,
        RESTCSNodeCollectionItemV1> {
    private RESTCSNodeV1 item;

    public RESTCSNodeCollectionItemV1() {

    }

    public RESTCSNodeCollectionItemV1(final RESTCSNodeV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCSNodeCollectionItemV1(final RESTCSNodeV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSNodeCollectionItemV1 clone(boolean deepCopy) {
        final RESTCSNodeCollectionItemV1 retValue = new RESTCSNodeCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCSNodeV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCSNodeV1 item) {
        this.item = item;
    }
}
