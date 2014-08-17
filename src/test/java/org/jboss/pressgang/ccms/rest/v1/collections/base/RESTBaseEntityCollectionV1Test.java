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

import static org.junit.Assert.*;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseAuditedEntityV1;
import org.junit.Before;
import org.junit.Test;

/**
 * A class to test the functionality provided by the RESTBaseEntityCollectionV1 class.
 * 
 * @author lnewson
 */
public class RESTBaseEntityCollectionV1Test
{
    private RESTBaseTestCollectionV1 collection;
    
    @Before
    public void init()
    {
        collection = new RESTBaseTestCollectionV1();
    }

    @Test
    public void testRemoveInvalidRequests()
    {
        final List<RESTBaseTestCollectionItemV1> items = new ArrayList<RESTBaseTestCollectionItemV1>();
        
        items.add(createCollectionItem(1, 4));
        items.add(createCollectionItem(2, 4));
        items.add(createNullCollectionItem(REMOVE_STATE));
        items.add(createCollectionItem(3, REMOVE_STATE));
        
        collection.setItems(items);

        collection.removeInvalidChangeItemRequests();
        
        assertEquals("Failed to remove Invalid Items", 1, collection.getItems().size());
    }
    
    @Test
    public void testRemoveDuplicatedItemRequests()
    {
        final List<RESTBaseTestCollectionItemV1> items = new ArrayList<RESTBaseTestCollectionItemV1>();
        
        items.add(createCollectionItem(1, REMOVE_STATE));
        items.add(createCollectionItem(1, ADD_STATE));
        
        items.add(createCollectionItem(2, REMOVE_STATE));
        items.add(createCollectionItem(2, REMOVE_STATE));
        
        items.add(createCollectionItem(3, ADD_STATE));

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

class RESTBaseTestEntityV1 extends RESTBaseAuditedEntityV1<RESTBaseTestEntityV1, RESTBaseTestCollectionV1, RESTBaseTestCollectionItemV1>
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

        cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
}

class RESTBaseTestCollectionV1 extends RESTBaseEntityCollectionV1<RESTBaseTestEntityV1, RESTBaseTestCollectionV1, RESTBaseTestCollectionItemV1>
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
        if (getItems() == null)
            items = new ArrayList<RESTBaseTestCollectionItemV1>();
        
        items.add(new RESTBaseTestCollectionItemV1(item, state));
    }
    
}

class RESTBaseTestCollectionItemV1 extends RESTBaseEntityCollectionItemV1<RESTBaseTestEntityV1, RESTBaseTestCollectionV1, RESTBaseTestCollectionItemV1>
{
    private RESTBaseTestEntityV1 item;
    
    RESTBaseTestCollectionItemV1()
    {
    }
    
    RESTBaseTestCollectionItemV1(final RESTBaseTestEntityV1 item)
    {
        setItem(item);
        setState(UNCHANGED_STATE);
    }
    
    RESTBaseTestCollectionItemV1(final RESTBaseTestEntityV1 item, final Integer state)
    {
        setItem(item);
        setState(state);
    }
    
    @Override
    public RESTBaseTestCollectionItemV1 clone(boolean deepCopy)
    {
        final RESTBaseTestCollectionItemV1 retValue = new RESTBaseTestCollectionItemV1();

        cloneInto(retValue, deepCopy);
        
        return retValue;
    }

    @Override
    public RESTBaseTestEntityV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTBaseTestEntityV1 item) {
        this.item = item;
    }
    
}