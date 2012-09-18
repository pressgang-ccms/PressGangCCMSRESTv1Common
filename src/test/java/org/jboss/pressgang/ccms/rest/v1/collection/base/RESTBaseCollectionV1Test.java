package org.jboss.pressgang.ccms.rest.v1.collection.base;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class RESTBaseCollectionV1Test
{
    @Spy
    private RESTBaseTestCollectionV1 collection;
    
    @Before
    public void initMocks()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRemoveInvalidRequests()
    {
        final List<RESTBaseTestCollectionItemV1> items = new ArrayList<RESTBaseTestCollectionItemV1>();
        
        items.add(createCollectionItem(1, 4));
        items.add(createCollectionItem(2, 4));
        items.add(createNullCollectionItem(2));
        items.add(createCollectionItem(3, 2));
        
        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove Invalid Items", 1, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequests()
    {
        final List<RESTBaseTestCollectionItemV1> items = new ArrayList<RESTBaseTestCollectionItemV1>();
        
        items.add(createCollectionItem(1, 2));
        items.add(createCollectionItem(1, 1));
        
        items.add(createCollectionItem(2, 2));
        items.add(createCollectionItem(2, 2));
        
        items.add(createCollectionItem(3, 2));

        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();

        assertEquals("Failed to remove duplicated items", 2, collection.getItems().size());
    }
    
    private RESTBaseTestCollectionItemV1 createCollectionItem(final Integer id, final Integer state)
    {
        final RESTBaseTestCollectionItemV1 entity = new RESTBaseTestCollectionItemV1();;
        
        entity.setItem(createEntity(id));
        entity.setState(state);
        
        return entity;
    }
    
    private RESTBaseTestCollectionItemV1 createNullCollectionItem(final Integer state)
    {
        final RESTBaseTestCollectionItemV1 entity = new RESTBaseTestCollectionItemV1();;
        
        entity.setItem(null);
        entity.setState(state);
        
        return entity;
    }
    
    private RESTBaseTestEntityV1 createEntity(final Integer id)
    {
        final RESTBaseTestEntityV1 entity = new RESTBaseTestEntityV1();
        entity.setId(id);
        
        return entity;
    }
}

class RESTBaseTestEntityV1 extends RESTBaseEntityV1<RESTBaseTestEntityV1, RESTBaseTestCollectionV1, RESTBaseTestCollectionItemV1>
{
    private RESTBaseTestCollectionV1 revisions = null;
    
    @Override
    public RESTBaseTestCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTBaseTestCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTBaseTestEntityV1 clone(boolean deepCopy) {
        final RESTBaseTestEntityV1 retValue = new RESTBaseTestEntityV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
}

class RESTBaseTestCollectionV1 extends RESTBaseCollectionV1<RESTBaseTestEntityV1, RESTBaseTestCollectionV1, RESTBaseTestCollectionItemV1>
{
    private List<RESTBaseTestCollectionItemV1> items;
    
    @Override
    public List<RESTBaseTestCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(List<RESTBaseTestCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(RESTBaseTestEntityV1 item, Integer state) {
        if (items == null)
            items = new ArrayList<RESTBaseTestCollectionItemV1>();
        
        items.add(new RESTBaseTestCollectionItemV1(item, state));
    }
    
}

class RESTBaseTestCollectionItemV1 extends RESTBaseCollectionItemV1<RESTBaseTestEntityV1, RESTBaseTestCollectionV1, RESTBaseTestCollectionItemV1>
{

    public RESTBaseTestCollectionItemV1()
    {
    }
    
    public RESTBaseTestCollectionItemV1(final RESTBaseTestEntityV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    public RESTBaseTestCollectionItemV1(final RESTBaseTestEntityV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }
    
    @Override
    public RESTBaseTestCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTBaseTestCollectionItemV1 retValue = new RESTBaseTestCollectionItemV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
}