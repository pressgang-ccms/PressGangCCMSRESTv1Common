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

package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageImageV1;

public class RESTLanguageImageCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTLanguageImageV1, RESTLanguageImageCollectionV1,
        RESTLanguageImageCollectionItemV1> {
    private RESTLanguageImageV1 item;

    public RESTLanguageImageCollectionItemV1() {

    }

    public RESTLanguageImageCollectionItemV1(final RESTLanguageImageV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTLanguageImageCollectionItemV1(final RESTLanguageImageV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTLanguageImageCollectionItemV1 clone(boolean deepCopy) {
        final RESTLanguageImageCollectionItemV1 retValue = new RESTLanguageImageCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTLanguageImageV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTLanguageImageV1 item) {
        this.item = item;
    }
}