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

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTServerUndefinedEntityV1;

public class RESTServerUndefinedEntityCollectionItemV1 extends RESTBaseUndefinedSettingCollectionItemV1<RESTServerUndefinedEntityV1,
        Integer, RESTServerUndefinedEntityCollectionItemV1> {
    private RESTServerUndefinedEntityV1 item;

    public RESTServerUndefinedEntityCollectionItemV1() {

    }

    public RESTServerUndefinedEntityCollectionItemV1(final RESTServerUndefinedEntityV1 item) {
        setItem(item);
        setState(RESTBaseEntityCollectionItemV1.UNCHANGED_STATE);
    }

    public RESTServerUndefinedEntityCollectionItemV1(final RESTServerUndefinedEntityV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTServerUndefinedEntityV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTServerUndefinedEntityV1 item) {
        this.item = item;
    }

    @Override
    public RESTServerUndefinedEntityCollectionItemV1 clone(boolean deepCopy) {
        final RESTServerUndefinedEntityCollectionItemV1 retValue = new RESTServerUndefinedEntityCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }
}
