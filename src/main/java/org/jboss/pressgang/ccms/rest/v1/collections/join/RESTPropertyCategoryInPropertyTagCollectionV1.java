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

package org.jboss.pressgang.ccms.rest.v1.collections.join;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyCategoryInPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyCategoryInPropertyTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 *
 * @author Matthew Casperson
 */
public class RESTPropertyCategoryInPropertyTagCollectionV1 extends RESTBaseEntityUpdateCollectionV1<RESTPropertyCategoryInPropertyTagV1,
        RESTPropertyCategoryInPropertyTagCollectionV1, RESTPropertyCategoryInPropertyTagCollectionItemV1> {
    private List<RESTPropertyCategoryInPropertyTagCollectionItemV1> items = new
            ArrayList<RESTPropertyCategoryInPropertyTagCollectionItemV1>();

    @Override
    public List<RESTPropertyCategoryInPropertyTagCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTPropertyCategoryInPropertyTagCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTPropertyCategoryInPropertyTagV1 item, final Integer state) {
        if (getItems() == null) {
            setItems(new ArrayList<RESTPropertyCategoryInPropertyTagCollectionItemV1>());
        }

        getItems().add(new RESTPropertyCategoryInPropertyTagCollectionItemV1(item, state));
    }

    /**
     * This method will clear out any child items that are marked for both add and remove, or duplicated add and remove requests.
     * Override this method to deal with collections where the children are not uniquely identified by only their id.
     * <p/>
     * PropertyTags are only duplicated when they are unique, have the same ID and the same value.
     */
    @Override
    protected void ignoreDuplicatedChangeItemRequests() {
        if (getItems() != null) {
            final List<RESTPropertyCategoryInPropertyTagCollectionItemV1> items = new
                    ArrayList<RESTPropertyCategoryInPropertyTagCollectionItemV1>(getItems());

			/* on the second loop, remove any items that are marked for both add and remove is separate items */
            for (int i = 0; i < items.size(); ++i) {
                final RESTPropertyCategoryInPropertyTagCollectionItemV1 child1 = items.get(i);
                final RESTPropertyCategoryInPropertyTagV1 childItem1 = child1.getItem();

                // New Entity so ignore it
                if (childItem1.getId() == null) continue;

				/* at this point we know that either add1 or remove1 will be true, but not both */
                final boolean add1 = child1.getState().equals(ADD_STATE);
                final boolean remove1 = child1.getState().equals(REMOVE_STATE);
                final boolean update1 = child1.getState().equals(UPDATE_STATE);
				
				/* Loop a second time, looking for duplicates */
                for (int j = i + 1; j < items.size(); ++j) {
                    final RESTPropertyCategoryInPropertyTagCollectionItemV1 child2 = items.get(j);
                    final RESTPropertyCategoryInPropertyTagV1 childItem2 = child2.getItem();

                    // New Entity so ignore it
                    if (childItem2.getId() == null) continue;
					
					/* Do some checks on values that could be null */
                    final boolean relationshipIdEqual = childItem1.getRelationshipId() == null && childItem2.getRelationshipId() == null
                            || childItem1.getRelationshipId() != null && childItem1.getRelationshipId().equals(
                            childItem2.getRelationshipId());
					
					/* Check the PropertyTags for uniqueness and their value as well as their IDs */
                    if (childItem1.getId().equals(childItem2.getId()) && relationshipIdEqual) {
                        final boolean add2 = child2.getState().equals(ADD_STATE);
                        final boolean remove2 = child2.getState().equals(REMOVE_STATE);
                        final boolean update2 = child2.getState().equals(UPDATE_STATE);

                        final boolean relationshipSortEqual = childItem1.getRelationshipSort() == null && childItem2.getRelationshipSort
                                () == null || childItem1.getRelationshipSort() != null && childItem1.getRelationshipSort().equals(
                                childItem2.getRelationshipSort());
						
						/* check for double add, double remove, double update, and remove one instance */
                        if ((add1 && add2) || (remove1 && remove2) || (update1 && update2)) {
                            if (relationshipSortEqual) {
                                getItems().remove(child1);
                            } else {
                                getItems().remove(child1);
                                getItems().remove(child2);
                            }
                        }
						
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
}
