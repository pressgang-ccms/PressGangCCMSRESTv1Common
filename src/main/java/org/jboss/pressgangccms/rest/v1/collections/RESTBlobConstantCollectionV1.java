package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTBlobConstantCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTBlobConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTBlobConstantCollectionV1 extends RESTBaseCollectionV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1, RESTBlobConstantCollectionItemV1>
{
	private Set<RESTBlobConstantCollectionItemV1> items;
	
	@Override
	public Set<RESTBlobConstantCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTBlobConstantCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTBlobConstantV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTBlobConstantCollectionItemV1>();
        }
        
        items.add(new RESTBlobConstantCollectionItemV1(item, state));
    }
}
