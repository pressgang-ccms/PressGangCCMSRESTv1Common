package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join;

import static org.junit.Assert.assertEquals;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join.RESTAssignedCSMetaDataCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.RESTAssignedCSMetaDataV1;
import org.junit.Before;
import org.junit.Test;

public class RESTAssignedCSMetaDataCollectionV1Test
{
    private static final String VALUE = "Test";
    private static final String DIFFERENT_VALUE = "Another Test";
    
    private RESTAssignedCSMetaDataCollectionV1 collection;
    
    @Before
    public void init()
    {
        collection = new RESTAssignedCSMetaDataCollectionV1();
    }
    
    @Test
    public void testRemoveInvalidRequests()
    {
        final List<RESTAssignedCSMetaDataCollectionItemV1> items = new ArrayList<RESTAssignedCSMetaDataCollectionItemV1>();
        
        /* Invalid Entities */
        items.add(createCollectionItem(1, null, VALUE, 4));
        items.add(createCollectionItem(2, null, VALUE, 4));
        items.add(createNullCollectionItem(UPDATE_STATE));
        
        /* Valid Entity */
        items.add(createCollectionItem(3, null, VALUE, UPDATE_STATE));
        
        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove Invalid Items", 1, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequests()
    {
        final List<RESTAssignedCSMetaDataCollectionItemV1> items = new ArrayList<RESTAssignedCSMetaDataCollectionItemV1>();
        
        // Different states (All should be removed)
        items.add(createCollectionItem(1, null, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(1, null, VALUE, ADD_STATE));
        
        // Same State (One should be removed)
        items.add(createCollectionItem(2, null, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(2, null, VALUE, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(3, null, VALUE, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove duplicated items", 2, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequestsWithRelationshipId()
    {
        final List<RESTAssignedCSMetaDataCollectionItemV1> items = new ArrayList<RESTAssignedCSMetaDataCollectionItemV1>();
        
        // Different states, Same Id (All should be removed)
        items.add(createCollectionItem(1, 1, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(1, 1, VALUE, UPDATE_STATE));
        
        // Different states, Different Ids (None should be removed)
        items.add(createCollectionItem(2, 1, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(2, 2, VALUE, UPDATE_STATE));
        
        // Same State, Same Id (One should be removed)
        items.add(createCollectionItem(3, 2, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(3, 2, VALUE, REMOVE_STATE));
        
        // Same State, Different Ids (None should be removed)
        items.add(createCollectionItem(4, 2, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(4, 3, VALUE, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(5, null, VALUE, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove duplicated items", 6, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequestsWithValues()
    {
        final List<RESTAssignedCSMetaDataCollectionItemV1> items = new ArrayList<RESTAssignedCSMetaDataCollectionItemV1>();
        
        // Different State, Different Values (Both should be removed)
        items.add(createCollectionItem(1, null, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(1, null, DIFFERENT_VALUE, UPDATE_STATE));
        
        // Same State, Different Values (Both should be removed)
        items.add(createCollectionItem(2, null, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(2, null, DIFFERENT_VALUE, REMOVE_STATE));
        
        // Different State, Same Values (Both should be removed)
        items.add(createCollectionItem(3, null, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(3, null, VALUE, UPDATE_STATE));
        
        // Same State, Same Values (One should be removed)
        items.add(createCollectionItem(4, null, VALUE, REMOVE_STATE));
        items.add(createCollectionItem(4, null, VALUE, REMOVE_STATE));
        
        // Valid Item
        items.add(createCollectionItem(5, null, VALUE, UPDATE_STATE));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();

        assertEquals("Failed to remove duplicated items", 2, collection.getItems().size());
    }
    
    private RESTAssignedCSMetaDataCollectionItemV1 createCollectionItem(final Integer id, final Integer relationshipId, final String value, final Integer state)
    {
        final RESTAssignedCSMetaDataCollectionItemV1 entity = new RESTAssignedCSMetaDataCollectionItemV1();
        
        entity.setItem(createEntity(id, relationshipId, value));
        entity.setState(state);
        
        return entity;
    }
    
    private RESTAssignedCSMetaDataCollectionItemV1 createNullCollectionItem(final Integer state)
    {
        final RESTAssignedCSMetaDataCollectionItemV1 entity = new RESTAssignedCSMetaDataCollectionItemV1();
        
        entity.setItem(null);
        entity.setState(state);
        
        return entity;
    }
    
    private RESTAssignedCSMetaDataV1 createEntity(final Integer id, final Integer relationshipId, final String value)
    {
        final RESTAssignedCSMetaDataV1 entity = new RESTAssignedCSMetaDataV1();
        entity.setId(id);
        entity.setValue(value);
        entity.setRelationshipId(relationshipId);
        
        return entity;
    }
}
