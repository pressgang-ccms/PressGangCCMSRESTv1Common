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

package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProcessInformationCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTProcessInformationV1;

public class RESTProcessInformationCollectionV1  extends RESTBaseCollectionV1<RESTProcessInformationV1, RESTProcessInformationCollectionItemV1> {
    private List<RESTProcessInformationCollectionItemV1> items = new ArrayList<RESTProcessInformationCollectionItemV1>();

    @Override
    public List<RESTProcessInformationCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTProcessInformationCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTProcessInformationV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTProcessInformationCollectionItemV1>();
        }

        items.add(new RESTProcessInformationCollectionItemV1(item, state));
    }
}
