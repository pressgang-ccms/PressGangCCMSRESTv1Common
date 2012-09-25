package org.jboss.pressgang.ccms.rest.v1.collections.join;

import static org.junit.Assert.assertEquals;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTCategoryInTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;
import org.junit.Before;
import org.junit.Test;

public class RESTCategoryInTagCollectionV1Test
{
    private static final Integer SORT = 10;
    private static final Integer DIFFERENT_SORT = 20;
    
    private RESTCategoryInTagCollectionV1 collection;
    
    @Before
    public void init()
    {
        collection = new RESTCategoryInTagCollectionV1();
    }
    
    @Test
    public void testRemoveInvalidRequests()
    {
        final List<RESTCategoryInTagCollectionItemV1> items = new ArrayList<RESTCategoryInTagCollectionItemV1>();
        
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
        final List<RESTCategoryInTagCollectionItemV1> items = spy(new ArrayList<RESTCategoryInTagCollectionItemV1>());
        
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
        final List<RESTCategoryInTagCollectionItemV1> items = spy(new ArrayList<RESTCategoryInTagCollectionItemV1>());
        
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
        final List<RESTCategoryInTagCollectionItemV1> items = new ArrayList<RESTCategoryInTagCollectionItemV1>();
        
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
    
    private RESTCategoryInTagCollectionItemV1 createCollectionItem(final Integer id, final Integer relationshipId, final Integer sort, final Integer state)
    {
        final RESTCategoryInTagCollectionItemV1 entity = new RESTCategoryInTagCollectionItemV1();
        
        entity.setItem(createEntity(id, relationshipId, sort));
        entity.setState(state);
        
        return entity;
    }
    
    private RESTCategoryInTagCollectionItemV1 createNullCollectionItem(final Integer state)
    {
        final RESTCategoryInTagCollectionItemV1 entity = new RESTCategoryInTagCollectionItemV1();
        
        entity.setItem(null);
        entity.setState(state);
        
        return entity;
    }
    
    private RESTCategoryInTagV1 createEntity(final Integer id, final Integer relationshipId, final Integer sort)
    {
        final RESTCategoryInTagV1 entity = new RESTCategoryInTagV1();
        entity.setId(id);
        entity.setRelationshipSort(sort);
        entity.setRelationshipId(relationshipId);
        
        return entity;
    }
}
