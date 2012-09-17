package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTFilterFieldCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterFieldV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterFieldCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1, RESTFilterFieldCollectionItemV1>
{
	private Set<RESTFilterFieldCollectionItemV1> items;
	
	@Override
	public Set<RESTFilterFieldCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTFilterFieldCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTFilterFieldV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTFilterFieldCollectionItemV1>();
        }
        
        items.add(new RESTFilterFieldCollectionItemV1(item, state));
    }
}
