package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTTopicSourceUrlCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTopicSourceUrlV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTopicSourceUrlCollectionV1 extends RESTBaseUpdateCollectionV1<RESTTopicSourceUrlV1, RESTTopicSourceUrlCollectionV1, RESTTopicSourceUrlCollectionItemV1>
{
	private Set<RESTTopicSourceUrlCollectionItemV1> items;
	
	@Override
	public Set<RESTTopicSourceUrlCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTTopicSourceUrlCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTTopicSourceUrlV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTTopicSourceUrlCollectionItemV1>();
        }
        
        items.add(new RESTTopicSourceUrlCollectionItemV1(item, state));
    }
}
