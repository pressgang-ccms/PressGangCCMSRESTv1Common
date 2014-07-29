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

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLanguageFileCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageFileV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 */
public class RESTLanguageFileCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTLanguageFileV1, RESTLanguageFileCollectionV1,
        RESTLanguageFileCollectionItemV1> {
    private List<RESTLanguageFileCollectionItemV1> items = new ArrayList<RESTLanguageFileCollectionItemV1>();

    @Override
    public List<RESTLanguageFileCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTLanguageFileCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTLanguageFileV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTLanguageFileCollectionItemV1>();
        }

        items.add(new RESTLanguageFileCollectionItemV1(item, state));
    }
}
