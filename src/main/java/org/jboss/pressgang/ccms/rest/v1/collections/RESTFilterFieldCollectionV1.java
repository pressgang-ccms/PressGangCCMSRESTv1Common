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

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterFieldCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterFieldV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTFilterFieldCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1,
        RESTFilterFieldCollectionItemV1> {
    private List<RESTFilterFieldCollectionItemV1> items = new ArrayList<RESTFilterFieldCollectionItemV1>();

    @Override
    public List<RESTFilterFieldCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterFieldCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTFilterFieldV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTFilterFieldCollectionItemV1>();
        }

        items.add(new RESTFilterFieldCollectionItemV1(item, state));
    }
}
