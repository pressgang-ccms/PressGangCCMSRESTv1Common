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

package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;

public class RESTCSNodeCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTCSNodeV1, RESTCSNodeCollectionV1, RESTCSNodeCollectionItemV1> {
    private List<RESTCSNodeCollectionItemV1> items = new ArrayList<RESTCSNodeCollectionItemV1>();

    @Override
    public List<RESTCSNodeCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTCSNodeCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSNodeV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTCSNodeCollectionItemV1>();
        }

        items.add(new RESTCSNodeCollectionItemV1(item, state));
    }
}
