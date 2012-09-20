package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTUserCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTUserV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTUserCollectionV1 extends RESTBaseCollectionV1<RESTUserV1, RESTUserCollectionV1, RESTUserCollectionItemV1>
{
	private List<RESTUserCollectionItemV1> items = new ArrayList<RESTUserCollectionItemV1>();
	
	@Override
	public List<RESTUserCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTUserCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTUserV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new ArrayList<RESTUserCollectionItemV1>();
        }
        
        items.add(new RESTUserCollectionItemV1(item, state));
    }
}
