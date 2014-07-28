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
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTPropertyCategoryCollectionV1 extends RESTBaseEntityCollectionV1<RESTPropertyCategoryV1, RESTPropertyCategoryCollectionV1,
        RESTPropertyCategoryCollectionItemV1> {
    private List<RESTPropertyCategoryCollectionItemV1> items = new ArrayList<RESTPropertyCategoryCollectionItemV1>();

    @Override
    public List<RESTPropertyCategoryCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTPropertyCategoryCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTPropertyCategoryV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTPropertyCategoryCollectionItemV1>();
        }

        items.add(new RESTPropertyCategoryCollectionItemV1(item, state));
    }
}
