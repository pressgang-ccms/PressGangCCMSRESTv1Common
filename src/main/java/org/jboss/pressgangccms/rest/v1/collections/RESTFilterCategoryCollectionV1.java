package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTFilterCategoryCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTFilterCategoryCollectionV1 extends RESTBaseUpdateCollectionV1<RESTFilterCategoryV1, RESTFilterCategoryCollectionV1, RESTFilterCategoryCollectionItemV1>
{
	private Set<RESTFilterCategoryCollectionItemV1> items;
	
	@Override
	public Set<RESTFilterCategoryCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTFilterCategoryCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTFilterCategoryV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTFilterCategoryCollectionItemV1>();
        }
        
        items.add(new RESTFilterCategoryCollectionItemV1(item, state));
    }
}
