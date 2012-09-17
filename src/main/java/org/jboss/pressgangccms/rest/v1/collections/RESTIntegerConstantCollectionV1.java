package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTIntegerConstantCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTIntegerConstantV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTIntegerConstantCollectionV1 extends RESTBaseCollectionV1<RESTIntegerConstantV1, RESTIntegerConstantCollectionV1, RESTIntegerConstantCollectionItemV1>
{
	private Set<RESTIntegerConstantCollectionItemV1> items;
	
	@Override
	public Set<RESTIntegerConstantCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTIntegerConstantCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTIntegerConstantV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTIntegerConstantCollectionItemV1>();
        }
        
        items.add(new RESTIntegerConstantCollectionItemV1(item, state));
    }
}
