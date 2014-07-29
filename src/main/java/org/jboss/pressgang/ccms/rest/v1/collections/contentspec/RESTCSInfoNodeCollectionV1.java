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

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSInfoNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSInfoNodeV1;

public class RESTCSInfoNodeCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTCSInfoNodeV1, RESTCSInfoNodeCollectionV1,
        RESTCSInfoNodeCollectionItemV1> {
    private List<RESTCSInfoNodeCollectionItemV1> items = new ArrayList<RESTCSInfoNodeCollectionItemV1>();

    @Override
    public List<RESTCSInfoNodeCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTCSInfoNodeCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTCSInfoNodeV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTCSInfoNodeCollectionItemV1>();
        }

        items.add(new RESTCSInfoNodeCollectionItemV1(item, state));
    }
}
