package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTTranslatedTopicCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTranslatedTopicV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTranslatedTopicCollectionV1 extends RESTBaseCollectionV1<RESTTranslatedTopicV1, RESTTranslatedTopicCollectionV1, RESTTranslatedTopicCollectionItemV1>
{
	private Set<RESTTranslatedTopicCollectionItemV1> items;
	
	@Override
	public Set<RESTTranslatedTopicCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTTranslatedTopicCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTTranslatedTopicV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTTranslatedTopicCollectionItemV1>();
        }
        
        items.add(new RESTTranslatedTopicCollectionItemV1(item, state));
    }
}
