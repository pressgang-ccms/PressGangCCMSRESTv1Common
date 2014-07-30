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

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementV1;

public interface RESTUpdateCollectionV1<T extends RESTBaseElementV1<T>, V extends RESTBaseCollectionItemV1<T,
        V>> extends RESTCollectionV1<T, V> {
    /**
     * @return A collection of updated items
     */
    List<T> returnUpdatedItems();

    /**
     * @return A collection of existing, added and updated items
     */
    List<V> returnExistingAddedAndUpdatedCollectionItems();

    /**
     * @return A collection of added, deleted and updated items (i.e. all those that would trigger a change in the db)
     */
    List<V> returnDeletedAddedAndUpdatedCollectionItems();

    /**
     * @return A collection of updated items
     */
    List<V> returnUpdatedCollectionItems();

    void addUpdateItem(final T item);
}
