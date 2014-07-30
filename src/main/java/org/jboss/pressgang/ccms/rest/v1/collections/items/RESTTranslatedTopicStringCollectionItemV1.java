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

package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslatedTopicStringV1;

public class RESTTranslatedTopicStringCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTTranslatedTopicStringV1,
        RESTTranslatedTopicStringCollectionV1, RESTTranslatedTopicStringCollectionItemV1> {
    private RESTTranslatedTopicStringV1 item;

    public RESTTranslatedTopicStringCollectionItemV1() {

    }

    public RESTTranslatedTopicStringCollectionItemV1(final RESTTranslatedTopicStringV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTranslatedTopicStringCollectionItemV1(final RESTTranslatedTopicStringV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTranslatedTopicStringCollectionItemV1 clone(boolean deepCopy) {
        final RESTTranslatedTopicStringCollectionItemV1 retValue = new RESTTranslatedTopicStringCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTranslatedTopicStringV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTranslatedTopicStringV1 item) {
        this.item = item;
    }
}