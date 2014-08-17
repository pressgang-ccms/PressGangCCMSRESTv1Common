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

package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public abstract class RESTBaseEntityUpdateCollectionItemV1<T extends RESTBaseEntityV1<T>, U extends RESTBaseEntityCollectionV1<T,
        U, V>, V extends RESTBaseEntityUpdateCollectionItemV1<T, U, V>> extends RESTBaseEntityCollectionItemV1<T, U,
        V> implements RESTUpdateCollectionItemV1<T, V> {
    private static final Integer MAX_UPDATE_STATE = 3;

    @Override
    protected boolean validState(final Integer state) {
        return state != null && state >= MIN_STATE && state <= MAX_UPDATE_STATE;
    }

    @Override
    public boolean returnIsUpdateItem() {
        return getState().equals(UPDATE_STATE);
    }
}
