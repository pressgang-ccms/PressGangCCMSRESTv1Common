package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTImageCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTImageV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTImageCollectionV1 extends RESTBaseCollectionV1<RESTImageV1, RESTImageCollectionV1, RESTImageCollectionItemV1>
{
	private Set<RESTImageCollectionItemV1> items;
	
	@Override
	public Set<RESTImageCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTImageCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTImageV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTImageCollectionItemV1>();
        }
        
        items.add(new RESTImageCollectionItemV1(item, state));
    }
}
