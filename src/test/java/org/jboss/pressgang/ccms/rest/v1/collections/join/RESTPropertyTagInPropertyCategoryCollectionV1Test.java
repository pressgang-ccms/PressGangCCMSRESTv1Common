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

package org.jboss.pressgang.ccms.rest.v1.collections.join;

import static org.junit.Assert.assertEquals;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyTagInPropertyCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagInPropertyCategoryV1;
import org.junit.Before;
import org.junit.Test;

public class RESTPropertyTagInPropertyCategoryCollectionV1Test
{
    private static final Integer SORT = 10;
    private static final Integer DIFFERENT_SORT = 20;
    
    private RESTPropertyTagInPropertyCategoryCollectionV1 collection;
    
    @Before
    public void init()
    {
        collection = new RESTPropertyTagInPropertyCategoryCollectionV1();
    }
    
    @Test
    public void testRemoveInvalidRequests()
    {
        final List<RESTPropertyTagInPropertyCategoryCollectionItemV1> items = new ArrayList<RESTPropertyTagInPropertyCategoryCollectionItemV1>();
        
        /* Invalid Entities */
        items.add(createCollectionItem(1, null, SORT, 4));
        items.add(createCollectionItem(2, null, SORT, 4));
        items.add(createNullCollectionItem(UPDATE_STATE));
        
        /* Valid Entity */
        items.add(createCollectionItem(3, null, SORT, UPDATE_STATE));
        
        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove Invalid Items", 1, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequests()
    {
        final List<RESTPropertyTagInPropertyCategoryCollectionItemV1> items = spy(new ArrayList<RESTPropertyTagInPropertyCategoryCollectionItemV1>());
        
        // Different states (All should be removed)
        items.add(createCollectionItem(1, null, SORT, REMOVE_STATE));
        items.add(createCollectionItem(1, null, SORT, ADD_STATE));
        
        // Same State (One should be removed)
        items.add(createCollectionItem(2, null, SORT, REMOVE_STATE));
        items.add(createCollectionItem(2, null, SORT, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(3, null, SORT, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove duplicated items", 2, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequestsWithRelationshipId()
    {
        final List<RESTPropertyTagInPropertyCategoryCollectionItemV1> items = spy(new ArrayList<RESTPropertyTagInPropertyCategoryCollectionItemV1>());
        
        // Different states, Same Id (All should be removed)
        items.add(createCollectionItem(1, 1, SORT, REMOVE_STATE));
        items.add(createCollectionItem(1, 1, SORT, UPDATE_STATE));
        
        // Different states, Different Ids (None should be removed)
        items.add(createCollectionItem(2, 1, SORT, REMOVE_STATE));
        items.add(createCollectionItem(2, 2, SORT, UPDATE_STATE));
        
        // Same State, Same Id (One should be removed)
        items.add(createCollectionItem(3, 2, SORT, REMOVE_STATE));
        items.add(createCollectionItem(3, 2, SORT, REMOVE_STATE));
        
        // Same State, Different Ids (None should be removed)
        items.add(createCollectionItem(4, 2, SORT, REMOVE_STATE));
        items.add(createCollectionItem(4, 3, SORT, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(5, null, SORT, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove duplicated items", 6, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequestsWithValues()
    {
        final List<RESTPropertyTagInPropertyCategoryCollectionItemV1> items = new ArrayList<RESTPropertyTagInPropertyCategoryCollectionItemV1>();
        
        // Different State, Different Values (Both should be removed)
        items.add(createCollectionItem(1, null, SORT, REMOVE_STATE));
        items.add(createCollectionItem(1, null, DIFFERENT_SORT, UPDATE_STATE));
        
        // Same State, Different Values (Both should be removed)
        items.add(createCollectionItem(2, null, SORT, REMOVE_STATE));
        items.add(createCollectionItem(2, null, DIFFERENT_SORT, REMOVE_STATE));
        
        // Different State, Same Values (Both should be removed)
        items.add(createCollectionItem(3, null, SORT, REMOVE_STATE));
        items.add(createCollectionItem(3, null, SORT, UPDATE_STATE));
        
        // Same State, Same Values (One should be removed)
        items.add(createCollectionItem(4, null, SORT, REMOVE_STATE));
        items.add(createCollectionItem(4, null, SORT, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(5, null, SORT, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();

        assertEquals("Failed to remove duplicated items", 2, collection.getItems().size());
    }
    
    private RESTPropertyTagInPropertyCategoryCollectionItemV1 createCollectionItem(final Integer id, final Integer relationshipId, final Integer sort, final Integer state)
    {
        final RESTPropertyTagInPropertyCategoryCollectionItemV1 entity = new RESTPropertyTagInPropertyCategoryCollectionItemV1();
        
        entity.setItem(createEntity(id, relationshipId, sort));
        entity.setState(state);
        
        return entity;
    }
    
    private RESTPropertyTagInPropertyCategoryCollectionItemV1 createNullCollectionItem(final Integer state)
    {
        final RESTPropertyTagInPropertyCategoryCollectionItemV1 entity = new RESTPropertyTagInPropertyCategoryCollectionItemV1();
        
        entity.setItem(null);
        entity.setState(state);
        
        return entity;
    }
    
    private RESTPropertyTagInPropertyCategoryV1 createEntity(final Integer id, final Integer relationshipId, final Integer sort)
    {
        final RESTPropertyTagInPropertyCategoryV1 entity = new RESTPropertyTagInPropertyCategoryV1();
        entity.setId(id);
        entity.setRelationshipSort(sort);
        entity.setRelationshipId(relationshipId);
        
        return entity;
    }
}
