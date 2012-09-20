package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTPropertyTagCollectionV1 extends RESTBaseCollectionV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1, RESTPropertyTagCollectionItemV1>
{
	private List<RESTPropertyTagCollectionItemV1> items = new ArrayList<RESTPropertyTagCollectionItemV1>();
	
	@Override
	public List<RESTPropertyTagCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTPropertyTagCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTPropertyTagV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new ArrayList<RESTPropertyTagCollectionItemV1>();
        }
        
        items.add(new RESTPropertyTagCollectionItemV1(item, state));
    }
}
