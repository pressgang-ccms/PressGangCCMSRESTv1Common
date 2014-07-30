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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicSourceUrlV1;

public class RESTTopicSourceUrlCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTTopicSourceUrlV1,
        RESTTopicSourceUrlCollectionV1, RESTTopicSourceUrlCollectionItemV1> {
    private RESTTopicSourceUrlV1 item;

    public RESTTopicSourceUrlCollectionItemV1() {

    }

    public RESTTopicSourceUrlCollectionItemV1(final RESTTopicSourceUrlV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTopicSourceUrlCollectionItemV1(final RESTTopicSourceUrlV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTopicSourceUrlCollectionItemV1 clone(boolean deepCopy) {
        final RESTTopicSourceUrlCollectionItemV1 retValue = new RESTTopicSourceUrlCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTopicSourceUrlV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTopicSourceUrlV1 item) {
        this.item = item;
    }
}