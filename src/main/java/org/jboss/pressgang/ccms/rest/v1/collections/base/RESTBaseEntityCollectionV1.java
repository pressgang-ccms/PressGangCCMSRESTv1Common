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

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

/**
 * @param <T> The REST entity type
 * @param <U> The REST Collection type
 * @author Matthew Casperson
 */
@SuppressWarnings("serial")
public abstract class RESTBaseEntityCollectionV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseCollectionV1<T, V> {

    /**
     * It is possible that a client has sent up a collection that asks to add and remove the same child item in a collection.
     * This method, combined with the ignoreDuplicatedAddRemoveItemRequests() method, will weed out any duplicated requests.
     */
    @Override
    public void removeInvalidChangeItemRequests() {
        /* ignore attempts to add/remove/update null items and items with invalid states */
        if (getItems() != null) {
            final List<V> items = new ArrayList<V>(getItems());

            for (final V item : items) {
                if (item.getItem() == null) {
                    getItems().remove(item);
                } else if (item.getState() != null && item.getState().equals(UNCHANGED_STATE)) {
                    getItems().remove(item);
                } else if (item.getItem().getId() == null && !item.getState().equals(ADD_STATE)) {
                    getItems().remove(item);
                } else if (item.getState() != null && !item.validState(item.getState())) {
                    getItems().remove(item);
                }
            }

            ignoreDuplicatedChangeItemRequests();
        }
    }

    /**
     * This method will clear out any child items that are marked for both add and remove, or duplicated add and remove
     * requests. Override this method to deal with collections where the children are not uniquely identified by only their id.
     * <p/>
     * This shouldn't occur when using the REST API through Java but may occur if a request is sent through a generic browser.
     */
    @Override
    protected void ignoreDuplicatedChangeItemRequests() {
        if (getItems() != null) {
            final List<V> items = new ArrayList<V>(getItems());

            /* on the second loop, remove any items that are marked for both add and remove is separate items */
            for (int i = 0; i < items.size(); ++i) {
                final V child1 = items.get(i);
                final T childItem1 = child1.getItem();

                // New Entity so ignore it
                if (childItem1.getId() == null) continue;

                /* at this point we know that either add1 or remove1 will be true, but not both */
                final boolean add1 = child1.getState().equals(ADD_STATE);
                final boolean remove1 = child1.getState().equals(REMOVE_STATE);
                final boolean update1 = child1.getState().equals(UPDATE_STATE);

                /* Loop a second time, looking for duplicates */
                for (int j = i + 1; j < items.size(); ++j) {
                    final V child2 = items.get(j);
                    final T childItem2 = child2.getItem();

                    // New Entity so ignore it
                    if (childItem2.getId() == null) continue;
                    
                    /* Check the PropertyTags for uniqueness and their value as well as their IDs */
                    if (childItem1.getId().equals(childItem2.getId())) {
                        final boolean add2 = child2.getState().equals(ADD_STATE);
                        final boolean remove2 = child2.getState().equals(REMOVE_STATE);
                        final boolean update2 = child2.getState().equals(UPDATE_STATE);

                        /* check for double add, double remove, double update, and remove one instance */
                        if ((add1 && add2) || (remove1 && remove2) || (update1 && update2)) getItems().remove(child1);

                        /* check for double add, double remove, add and remove, remove and add */
                        if ((add1 && remove2) || (remove1 && add2) || (update1 && remove2) || (update2 && remove1) || (update1 && add2)
                                || (update2 && add1)) {
                            getItems().remove(child1);
                            getItems().remove(child2);
                        }
                    }
                }
            }
        }
    }

    public void cloneInto(final RESTBaseEntityCollectionV1<T, U, V> dest, final boolean deepCopy) {
        if (getItems() != null) {
            dest.setItems(new ArrayList<V>());
            if (deepCopy) {
                for (final V item : getItems())
                    dest.getItems().add(item.clone(deepCopy));
            } else {
                dest.getItems().addAll(getItems());
            }
        }
    }
}
