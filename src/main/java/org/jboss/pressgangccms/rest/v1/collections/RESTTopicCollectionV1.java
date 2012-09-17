package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTTopicCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTopicV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTopicCollectionV1 extends RESTBaseCollectionV1<RESTTopicV1, RESTTopicCollectionV1, RESTTopicCollectionItemV1>
{
	private Set<RESTTopicCollectionItemV1> items;
	
	@Override
	public Set<RESTTopicCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTTopicCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTTopicV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTTopicCollectionItemV1>();
        }
        
        items.add(new RESTTopicCollectionItemV1(item, state));
    }
}
