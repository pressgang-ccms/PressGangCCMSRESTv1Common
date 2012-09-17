package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTTranslatedTopicStringCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTranslatedTopicStringV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTranslatedTopicStringCollectionV1 extends RESTBaseUpdateCollectionV1<RESTTranslatedTopicStringV1, RESTTranslatedTopicStringCollectionV1, RESTTranslatedTopicStringCollectionItemV1>
{
	private Set<RESTTranslatedTopicStringCollectionItemV1> items;
	
	@Override
	public Set<RESTTranslatedTopicStringCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTTranslatedTopicStringCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTTranslatedTopicStringV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTTranslatedTopicStringCollectionItemV1>();
        }
        
        items.add(new RESTTranslatedTopicStringCollectionItemV1(item, state));
    }
}
