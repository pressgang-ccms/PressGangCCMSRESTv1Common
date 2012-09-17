package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTFilterTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterTagV1, RESTFilterTagCollectionV1, RESTFilterTagCollectionItemV1>
{
	private Set<RESTFilterTagCollectionItemV1> items;
	
	@Override
	public Set<RESTFilterTagCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTFilterTagCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTFilterTagV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTFilterTagCollectionItemV1>();
        }
        
        items.add(new RESTFilterTagCollectionItemV1(item, state));
    }
}
