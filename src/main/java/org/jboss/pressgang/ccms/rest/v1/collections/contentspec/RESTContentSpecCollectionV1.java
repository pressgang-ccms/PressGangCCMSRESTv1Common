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

package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;

public class RESTContentSpecCollectionV1 extends RESTBaseEntityCollectionV1<RESTContentSpecV1, RESTContentSpecCollectionV1,
        RESTContentSpecCollectionItemV1> {
    private List<RESTContentSpecCollectionItemV1> items = new ArrayList<RESTContentSpecCollectionItemV1>();

    @Override
    public List<RESTContentSpecCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTContentSpecCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTContentSpecV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTContentSpecCollectionItemV1>();
        }

        items.add(new RESTContentSpecCollectionItemV1(item, state));
    }
}
