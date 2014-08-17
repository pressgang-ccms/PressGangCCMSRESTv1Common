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

package org.jboss.pressgang.ccms.rest.v1.sort;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseAuditedEntityV1;
import org.junit.Test;

public class RESTTitleComparatorTest
{
    @Test
    public void testTopicTitleComparator()
    {
        final RESTTopicTitleComparatorTest test = new RESTTopicTitleComparatorTest();
        
        test.testSort(new BaseTopicV1TitleComparator<RESTTopicV1>());
    }
    
    @Test
    public void testProjectNameComparator()
    {
        final RESTProjectNameComparatorTest test = new RESTProjectNameComparatorTest();
        
        test.testSort(new ProjectV1NameComparator());
    }
    
    @Test
    public void testTagNameComparator()
    {
        final RESTTagNameComparatorTest test = new RESTTagNameComparatorTest();
        
        test.testSort(new TagV1NameComparator());
    }
}

class RESTTopicTitleComparatorTest extends RESTBaseTitleComparatorTest<RESTTopicV1>
{
    @Override
    protected RESTTopicV1 createEntity(final String title)
    {
        final RESTTopicV1 entity = new RESTTopicV1();
        
        entity.setTitle(title);
        
        return entity;
    }
}

class RESTProjectNameComparatorTest extends RESTBaseTitleComparatorTest<RESTProjectV1>
{
    @Override
    protected RESTProjectV1 createEntity(final String title)
    {
        final RESTProjectV1 entity = new RESTProjectV1();
        
        entity.setName(title);
        
        return entity;
    }
}

class RESTTagNameComparatorTest extends RESTBaseTitleComparatorTest<RESTTagV1>
{
    @Override
    protected RESTTagV1 createEntity(final String title)
    {
        final RESTTagV1 entity = new RESTTagV1();
        
        entity.setName(title);
        
        return entity;
    }
}

/**
 * Base class to handle populating a List of REST Entities with some names and then a method to
 * validate that a comparator sorts the titles/names into alphabetical order.
 * 
 * @author lnewson
 *
 * @param <RESTBaseEntityV1> The REST Entity to be sorted into alphabetical order by title.
 */
abstract class RESTBaseTitleComparatorTest<T extends RESTBaseAuditedEntityV1<?, ?, ?>>
{
    private T entity1;
    private T entity2;
    private T entity3;
    private T entity4;
    private T entity5;
    private T entity6;

    protected RESTBaseTitleComparatorTest()
    {
        entity1 = createEntity("Cat");
        entity2 = createEntity("Dog");
        entity3 = createEntity("Donkey");
        entity4 = createEntity("Horse");
        entity5 = createEntity("Pig");
        entity6 = createEntity(null);
    }
    
    public void testSort(final Comparator<T> comparator)
    {
        final List<T> topics = new ArrayList<T>();
        
        topics.add(entity5);
        topics.add(entity6);
        topics.add(entity2);
        topics.add(entity4);
        topics.add(entity1);
        topics.add(entity3);
        
        Collections.sort(topics, comparator);
        
        assertSame(topics.get(0), entity6);
        assertSame(topics.get(1), entity1);
        assertSame(topics.get(2), entity2);
        assertSame(topics.get(3), entity3);
        assertSame(topics.get(4), entity4);
        assertSame(topics.get(5), entity5);
    }
    
    protected abstract T createEntity(final String title);
}
