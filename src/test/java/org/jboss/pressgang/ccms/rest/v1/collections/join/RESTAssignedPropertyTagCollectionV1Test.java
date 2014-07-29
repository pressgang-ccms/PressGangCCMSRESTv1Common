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

package org.jboss.pressgang.ccms.rest.v1.collections.join;

import static org.junit.Assert.assertEquals;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTAssignedPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;
import org.junit.Before;
import org.junit.Test;

public class RESTAssignedPropertyTagCollectionV1Test
{
    private RESTAssignedPropertyTagCollectionV1 collection;
    
    @Before
    public void init()
    {
        collection = new RESTAssignedPropertyTagCollectionV1();
    }
    
    @Test
    public void testRemoveInvalidRequests()
    {
        final List<RESTAssignedPropertyTagCollectionItemV1> items = new ArrayList<RESTAssignedPropertyTagCollectionItemV1>();
        
        /* Invalid Entities */
        items.add(createCollectionItem(1, null, "Test", true, 4));
        items.add(createCollectionItem(2, null, "Test", true, 4));
        items.add(createNullCollectionItem(UPDATE_STATE));
        
        /* Valid Entity */
        items.add(createCollectionItem(3, null, "Test", true, UPDATE_STATE));
        
        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove Invalid Items", 1, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequests()
    {
        final List<RESTAssignedPropertyTagCollectionItemV1> items = spy(new ArrayList<RESTAssignedPropertyTagCollectionItemV1>());
        
        // Different states (All should be removed)
        items.add(createCollectionItem(1, null, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(1, null, "Test", true, ADD_STATE));
        
        // Same State (One should be removed)
        items.add(createCollectionItem(2, null, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(2, null, "Test", true, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(3, null, "Test", true, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove duplicated items", 2, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequestsWithRelationshipId()
    {
        final List<RESTAssignedPropertyTagCollectionItemV1> items = spy(new ArrayList<RESTAssignedPropertyTagCollectionItemV1>());
        
        // Different states, Same Id (Both should be removed)
        items.add(createCollectionItem(1, 1, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(1, 1, "Test", true, UPDATE_STATE));
        
        // Different states, Different Ids (None should be removed)
        items.add(createCollectionItem(2, 1, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(2, 2, "Test", true, UPDATE_STATE));
        
        // Same State, Same Id (One should be removed)
        items.add(createCollectionItem(3, 2, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(3, 2, "Test", true, REMOVE_STATE));
        
        // Same State, Different Ids (None should be removed)
        items.add(createCollectionItem(4, 2, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(4, 3, "Test", true, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(5, null, "Test", true, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove duplicated items", 6, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequestsWithValues()
    {
        final List<RESTAssignedPropertyTagCollectionItemV1> items = new ArrayList<RESTAssignedPropertyTagCollectionItemV1>();
        
        // Different State, Different Values, Not Unique (None should be removed)
        items.add(createCollectionItem(1, null, "Test", false, REMOVE_STATE));
        items.add(createCollectionItem(1, null, "Different", false, UPDATE_STATE));
        
        // Different State, Different Values, Unique (None should be removed)
        items.add(createCollectionItem(2, null, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(2, null, "Different", true, UPDATE_STATE));
        
        // Same State, Different Values, Not Unique (None should be removed)
        items.add(createCollectionItem(3, null, "Test", false, REMOVE_STATE));
        items.add(createCollectionItem(3, null, "Different", false, REMOVE_STATE));
        
        // Same State, Different Values, Unique (None should be removed)
        items.add(createCollectionItem(4, null, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(4, null, "Different", true, REMOVE_STATE));
        
        // Different State, Same Values, Not Unique (Both should be removed)
        items.add(createCollectionItem(5, null, "Test", false, REMOVE_STATE));
        items.add(createCollectionItem(5, null, "Test", false, UPDATE_STATE));
        
        // Different State, Same Values, Unique (Both should be removed)
        items.add(createCollectionItem(6, null, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(6, null, "Test", true, UPDATE_STATE));
        
        // Same State, Same Values, Not Unique (One should be removed)
        items.add(createCollectionItem(7, null, "Test", false, REMOVE_STATE));
        items.add(createCollectionItem(7, null, "Test", false, REMOVE_STATE));
        
        // Same State, Same Values, Unique (One should be removed)
        items.add(createCollectionItem(8, null, "Test", true, REMOVE_STATE));
        items.add(createCollectionItem(8, null, "Test", true, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(9, null, "Test", true, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();

        assertEquals("Failed to remove duplicated items", 11, collection.getItems().size());
    }
    
    private RESTAssignedPropertyTagCollectionItemV1 createCollectionItem(final Integer id, final Integer relationshipId, final String value, final boolean isUnique, final Integer state)
    {
        final RESTAssignedPropertyTagCollectionItemV1 entity = new RESTAssignedPropertyTagCollectionItemV1();
        
        entity.setItem(createEntity(id, relationshipId, value, isUnique));
        entity.setState(state);
        
        return entity;
    }
    
    private RESTAssignedPropertyTagCollectionItemV1 createNullCollectionItem(final Integer state)
    {
        final RESTAssignedPropertyTagCollectionItemV1 entity = new RESTAssignedPropertyTagCollectionItemV1();
        
        entity.setItem(null);
        entity.setState(state);
        
        return entity;
    }
    
    private RESTAssignedPropertyTagV1 createEntity(final Integer id, final Integer relationshipId, final String value, final boolean isUnique)
    {
        final RESTAssignedPropertyTagV1 entity = new RESTAssignedPropertyTagV1();
        entity.setId(id);
        entity.setValue(value);
        entity.setRelationshipId(relationshipId);
        entity.setIsUnique(isUnique);
        
        return entity;
    }
}
