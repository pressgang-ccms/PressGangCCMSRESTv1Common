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

public interface RESTCollectionV1<T extends RESTBaseElementV1<T>, V extends RESTCollectionItemV1> {
    List<V> getItems();
    void setItems(final List<V> items);

    /**
     * Get a collection of REST entities wrapped as collection items that have a particular state
     *
     * @param states Defines the list of states that an entity can be in to be returned
     * @return A collection that holds all the REST entities included in the states collection
     */
    List<V> returnCollectionItemsWithState(final List<Integer> states);

    /**
     * @return A collection of deleted items
     */
    List<V> returnDeletedCollectionItems();

    /**
     * @return A collection of added items
     */
    List<V> returnAddedCollectionItems();

    /**
     * @return A collection of existing items
     */
    List<V> returnExistingCollectionItems();

    /**
     * @return A collection of existing and added items
     */
    List<V> returnExistingAndAddedCollectionItems();

    /**
     * @return A collection of added and deleted items
     */
    List<V> returnDeletedAndAddedCollectionItems();

    /**
     * Get a collection of REST entities that have a particular state
     *
     * @param states Defines the list of states that an entity can be in to be returned
     * @return A collection that holds all the REST entities included in the states collection
     */
    List<T> returnItemsWithState(final List<Integer> states);

    /**
     * @return A collection of deleted items
     */
    List<T> returnDeletedItems();

    /**
     * @return A collection of added items
     */
    List<T> returnAddedItems();

    /**
     * @return A collection of existing items
     */
    List<T> returnExistingItems();

    /**
     * Get any items that were added or unchanged. This is commonly used when
     * getting items that should be displayed to the end user.
     *
     * @return A collection of added and existing items
     */
    List<T> returnExistingAndAddedItems();

    /**
     * Get any items that were added or deleted. This is commonly used when
     * getting items that will change the database.
     *
     * @return A collection of added and existing items
     */
    List<T> returnDeletedAndAddedItems();

    List<T> returnItems();

    /**
     * It is possible that a client has sent up a collection that asks to add and remove the same child item in a collection.
     * This method, combined with the ignoreDuplicatedAddRemoveItemRequests() method, will weed out any duplicated requests.
     */
    void removeInvalidChangeItemRequests();

    void cloneInto(final RESTCollectionV1<T, V> dest, final boolean deepCopy);

    String getExpand();
    void setExpand(final String expand);

    Integer getStartExpandIndex();
    void setStartExpandIndex(final Integer startExpandIndex);

    Integer getEndExpandIndex();
    void setEndExpandIndex(final Integer endExpandIndex);

    Integer getSize();
    void setSize(final Integer size);

    void addItem(final T item);

    void addNewItem(final T item);

    void addRemoveItem(final T item);
}