package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTPropertyTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTPropertyTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTPropertyTagCollectionV1 extends RESTBaseCollectionV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1, RESTPropertyTagCollectionItemV1>
{
	private Set<RESTPropertyTagCollectionItemV1> items;
	
	@Override
	public Set<RESTPropertyTagCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTPropertyTagCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTPropertyTagV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTPropertyTagCollectionItemV1>();
        }
        
        items.add(new RESTPropertyTagCollectionItemV1(item, state));
    }
}
