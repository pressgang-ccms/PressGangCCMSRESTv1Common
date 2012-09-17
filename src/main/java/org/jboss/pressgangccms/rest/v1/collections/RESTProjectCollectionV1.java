package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTProjectV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTProjectCollectionV1 extends RESTBaseCollectionV1<RESTProjectV1, RESTProjectCollectionV1, RESTProjectCollectionItemV1>
{
	private Set<RESTProjectCollectionItemV1> items;
	
	@Override
	public Set<RESTProjectCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTProjectCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTProjectV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTProjectCollectionItemV1>();
        }
        
        items.add(new RESTProjectCollectionItemV1(item, state));
    }
}
