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

package org.jboss.pressgang.ccms.rest.v1.entities.join;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RESTAssignedPropertyTagV1Test
{
    @Test
    public void testEqualsSame()
    {
        final RESTAssignedPropertyTagV1 item1 = createEntity(1, null, "Test", true);
        final RESTAssignedPropertyTagV1 item3 = createEntity(1, 1, "Test", true);        
        final RESTAssignedPropertyTagV1 item5 = createEntity(2, null, "Test", true);
        
        // Duplicate Values
        final RESTAssignedPropertyTagV1 item2 = createEntity(1, null, "Test", true);
        final RESTAssignedPropertyTagV1 item4 = createEntity(1, 1, "Test", true);
        
        // Test Item 1
        assertEquals(item1, item2);
        assertFalse(item1.equals(item3));
        assertFalse(item1.equals(item5));
        
        // Test Item 3 (Different Relationship ID)
        assertEquals(item3, item4);
        assertFalse(item3.equals(item1));
        assertFalse(item3.equals(item5));
        
        // Test Item 6 (Different Id)
        assertFalse(item5.equals(item1));
        assertFalse(item5.equals(item3));
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
