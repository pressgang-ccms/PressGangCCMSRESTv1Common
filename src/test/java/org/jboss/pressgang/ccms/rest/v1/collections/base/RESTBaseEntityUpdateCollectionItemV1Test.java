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

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RESTBaseEntityUpdateCollectionItemV1Test
{
    @Mock(answer = Answers.CALLS_REAL_METHODS)
    private RESTBaseEntityUpdateCollectionItemV1 item;
    
    @Before
    public void initMocks()
    {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testValidState()
    {
        // Invalid state
        assertFalse("A state greater than 3 is valid", item.validState(4));
        assertFalse("A state less than 0 is valid", item.validState(-1));
        
        // Valid state
        assertTrue("The Unchanged State is not valid", item.validState(UNCHANGED_STATE));
        assertTrue("The Add State is not valid", item.validState(ADD_STATE));
        assertTrue("The Remove State is not valid", item.validState(REMOVE_STATE));
        assertTrue("The Update State is not valid", item.validState(UPDATE_STATE));
    }
    
    @Test
    public void testReturnStates()
    {
        /* Test the remove state */
        item.setState(REMOVE_STATE);
        assertTrue("The returnIsRemoveItem() method returns the wrong value, when the State is REMOVE", item.returnIsRemoveItem());
        assertFalse("The returnIsAddItem() method returns the wrong value, when the state is REMOVE", item.returnIsAddItem());
        assertFalse("The returnIsUpdateItem() method returns the wrong value, when the state is REMOVE", item.returnIsUpdateItem());
        
        /* Test the add state */
        item.setState(ADD_STATE);
        assertFalse("The returnIsRemoveItem() method returns the wrong value, when the State is ADD", item.returnIsRemoveItem());
        assertTrue("The returnIsAddItem() method returns the wrong value, when the state is ADD", item.returnIsAddItem());
        assertFalse("The returnIsUpdateItem() method returns the wrong value, when the state is ADD", item.returnIsUpdateItem());
        
        /* Test the update state */
        item.setState(UPDATE_STATE);
        assertFalse("The returnIsRemoveItem() method returns the wrong value, when the State is REMOVE", item.returnIsRemoveItem());
        assertFalse("The returnIsAddItem() method returns the wrong value, when the state is REMOVE", item.returnIsAddItem());
        assertTrue("The returnIsUpdateItem() method returns the wrong value, when the state is REMOVE", item.returnIsUpdateItem());
    }
}
