package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTTagV1, RESTTagCollectionV1, RESTTagCollectionItemV1>
{
	private Set<RESTTagCollectionItemV1> items;
	
	@Override
	public Set<RESTTagCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTTagCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTTagV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTTagCollectionItemV1>();
        }
        
        items.add(new RESTTagCollectionItemV1(item, state));
    }
}
