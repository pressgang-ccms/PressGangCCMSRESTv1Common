package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTCategoryCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTCategoryCollectionV1 extends RESTBaseCollectionV1<RESTCategoryV1, RESTCategoryCollectionV1, RESTCategoryCollectionItemV1>
{
	private Set<RESTCategoryCollectionItemV1> items;
	
	@Override
	public Set<RESTCategoryCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTCategoryCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTCategoryV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTCategoryCollectionItemV1>();
        }
        
        items.add(new RESTCategoryCollectionItemV1(item, state));
    }
}
