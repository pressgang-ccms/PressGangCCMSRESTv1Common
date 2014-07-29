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

package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTBlobConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTBlobConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTBlobConstantCollectionV1 extends RESTBaseEntityCollectionV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1,
        RESTBlobConstantCollectionItemV1> {
    private List<RESTBlobConstantCollectionItemV1> items = new ArrayList<RESTBlobConstantCollectionItemV1>();

    @Override
    public List<RESTBlobConstantCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTBlobConstantCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTBlobConstantV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTBlobConstantCollectionItemV1>();
        }

        items.add(new RESTBlobConstantCollectionItemV1(item, state));
    }
}
