package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTProjectCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTProjectCollectionV1 extends RESTBaseCollectionV1<RESTProjectV1, RESTProjectCollectionV1, RESTProjectCollectionItemV1>
{
	private List<RESTProjectCollectionItemV1> items;
	
	@Override
	public List<RESTProjectCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTProjectCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTProjectV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new ArrayList<RESTProjectCollectionItemV1>();
        }
        
        items.add(new RESTProjectCollectionItemV1(item, state));
    }
}
