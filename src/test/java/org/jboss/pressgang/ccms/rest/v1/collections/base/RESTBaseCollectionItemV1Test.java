package org.jboss.pressgang.ccms.rest.v1.collections.base;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@SuppressWarnings("rawtypes")
public class RESTBaseCollectionItemV1Test
{
    @Mock(answer = Answers.CALLS_REAL_METHODS)
    private RESTBaseCollectionItemV1 item;
    
    @Before
    public void initMocks()
    {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testValidState()
    {
        // Invalid state
        assertFalse("A state greater than 2 is valid", item.validState(UPDATE_STATE));
        assertFalse("A state less than 0 is valid", item.validState(-1));
        
        // Valid state
        assertTrue("The Unchanged State is not valid", item.validState(UNCHANGED_STATE));
        assertTrue("The Add State is not valid", item.validState(ADD_STATE));
        assertTrue("The Remove State is not valid", item.validState(REMOVE_STATE));
    }
    
    @Test
    public void testReturnStates()
    {
        /* Test the remove state */
        item.setState(REMOVE_STATE);
        assertTrue("The returnIsRemoveItem() method returns the wrong value, when the State is REMOVE", item.returnIsRemoveItem());
        assertFalse("The returnIsAddItem() method returns the wrong value, when the state is REMOVE", item.returnIsAddItem());
        
        /* Test the add state */
        item.setState(ADD_STATE);
        assertFalse("The returnIsRemoveItem() method returns the wrong value, when the State is ADD", item.returnIsRemoveItem());
        assertTrue("The returnIsAddItem() method returns the wrong value, when the state is ADD", item.returnIsAddItem());
    }
}
