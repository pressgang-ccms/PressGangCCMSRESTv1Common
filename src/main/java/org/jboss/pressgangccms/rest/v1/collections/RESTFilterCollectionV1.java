package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTFilterCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterCollectionV1 extends RESTBaseCollectionV1<RESTFilterV1, RESTFilterCollectionV1, RESTFilterCollectionItemV1>
{
	private Set<RESTFilterCollectionItemV1> items;
	
	@Override
	public Set<RESTFilterCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTFilterCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTFilterV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTFilterCollectionItemV1>();
        }
        
        items.add(new RESTFilterCollectionItemV1(item, state));
    }
}
