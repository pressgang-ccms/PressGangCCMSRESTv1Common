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

package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTFilterTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTFilterTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTFilterTagCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTFilterTagV1, RESTFilterTagCollectionV1,
        RESTFilterTagCollectionItemV1> {
    private List<RESTFilterTagCollectionItemV1> items = new ArrayList<RESTFilterTagCollectionItemV1>();

    @Override
    public List<RESTFilterTagCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterTagCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTFilterTagV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTFilterTagCollectionItemV1>();
        }

        items.add(new RESTFilterTagCollectionItemV1(item, state));
    }
}
