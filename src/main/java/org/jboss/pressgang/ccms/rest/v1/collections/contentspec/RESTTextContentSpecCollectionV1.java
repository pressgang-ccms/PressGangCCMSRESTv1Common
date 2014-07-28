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

package org.jboss.pressgang.ccms.rest.v1.collections.contentspec;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTextContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTTextContentSpecV1;

public class RESTTextContentSpecCollectionV1 extends RESTBaseEntityCollectionV1<RESTTextContentSpecV1, RESTTextContentSpecCollectionV1, RESTTextContentSpecCollectionItemV1> {
    private List<RESTTextContentSpecCollectionItemV1> items = new ArrayList<RESTTextContentSpecCollectionItemV1>();

    @Override
    public List<RESTTextContentSpecCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTTextContentSpecCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTTextContentSpecV1 item, final Integer state) {
        if (items == null) {
            items = new ArrayList<RESTTextContentSpecCollectionItemV1>();
        }

        items.add(new RESTTextContentSpecCollectionItemV1(item, state));
    }
}
