package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTFilterLocaleCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterLocaleV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterLocaleCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1, RESTFilterLocaleCollectionItemV1>
{
	private Set<RESTFilterLocaleCollectionItemV1> items;
	
	@Override
	public Set<RESTFilterLocaleCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTFilterLocaleCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTFilterLocaleV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTFilterLocaleCollectionItemV1>();
        }
        
        items.add(new RESTFilterLocaleCollectionItemV1(item, state));
    }
}
