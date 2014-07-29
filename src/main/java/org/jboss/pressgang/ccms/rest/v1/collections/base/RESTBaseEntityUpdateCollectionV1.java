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

package org.jboss.pressgang.ccms.rest.v1.collections.base;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;

import java.util.Arrays;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

/**
 * @param <T> The REST entity type
 * @param <U> The REST Collection type
 * @author Matthew Casperson
 */
public abstract class RESTBaseEntityUpdateCollectionV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseEntityUpdateCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityCollectionV1<T, U,
        V> implements RESTUpdateCollectionV1<T, V> {
    /**
     * @return A collection of updated items
     */
    @Override
    public List<V> returnUpdatedCollectionItems() {
        return returnCollectionItemsWithState(Arrays.asList(UPDATE_STATE));
    }

    /**
     * @return A collection of existing, added and updated items
     */
    @Override
    public List<V> returnExistingAddedAndUpdatedCollectionItems() {
        return returnCollectionItemsWithState(Arrays.asList(UNCHANGED_STATE, ADD_STATE, UPDATE_STATE));
    }

    /**
     * @return A collection of added, deleted and updated items (i.e. all those that would trigger a change in the db)
     */
    @Override
    public List<V> returnDeletedAddedAndUpdatedCollectionItems() {
        return returnCollectionItemsWithState(Arrays.asList(REMOVE_STATE, ADD_STATE, UPDATE_STATE));
    }

    /**
     * @return A collection of updated items
     */
    @Override
    public List<T> returnUpdatedItems() {
        return returnItemsWithState(Arrays.asList(UPDATE_STATE));
    }

    @Override
    public void addUpdateItem(final T item) {
        addItem(item, UPDATE_STATE);
    }
}