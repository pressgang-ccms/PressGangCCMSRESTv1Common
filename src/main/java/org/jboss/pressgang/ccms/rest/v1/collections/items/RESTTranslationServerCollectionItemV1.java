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

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslationServerCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTranslationServerV1;

public class RESTTranslationServerCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTTranslationServerV1,
        RESTTranslationServerCollectionV1, RESTTranslationServerCollectionItemV1> {
    private RESTTranslationServerV1 item;

    public RESTTranslationServerCollectionItemV1() {

    }

    public RESTTranslationServerCollectionItemV1(final RESTTranslationServerV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTranslationServerCollectionItemV1(final RESTTranslationServerV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTranslationServerCollectionItemV1 clone(boolean deepCopy) {
        final RESTTranslationServerCollectionItemV1 retValue = new RESTTranslationServerCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTranslationServerV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTranslationServerV1 item) {
        this.item = item;
    }
}