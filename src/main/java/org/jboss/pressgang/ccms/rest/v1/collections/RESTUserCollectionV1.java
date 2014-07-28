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

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTUserCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTUserV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTUserCollectionV1 extends RESTBaseEntityCollectionV1<RESTUserV1, RESTUserCollectionV1, RESTUserCollectionItemV1> {
    private List<RESTUserCollectionItemV1> items = new ArrayList<RESTUserCollectionItemV1>();

    @Override
    public List<RESTUserCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTUserCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTUserV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTUserCollectionItemV1>();
        }

        items.add(new RESTUserCollectionItemV1(item, state));
    }
}
