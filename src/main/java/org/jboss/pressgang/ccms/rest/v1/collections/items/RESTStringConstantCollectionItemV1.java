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

package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTStringConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTStringConstantV1;

public class RESTStringConstantCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTStringConstantV1, RESTStringConstantCollectionV1,
        RESTStringConstantCollectionItemV1> {
    private RESTStringConstantV1 item;

    public RESTStringConstantCollectionItemV1() {

    }

    public RESTStringConstantCollectionItemV1(final RESTStringConstantV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTStringConstantCollectionItemV1(final RESTStringConstantV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTStringConstantCollectionItemV1 clone(boolean deepCopy) {
        final RESTStringConstantCollectionItemV1 retValue = new RESTStringConstantCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTStringConstantV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTStringConstantV1 item) {
        this.item = item;
    }
}