package org.jboss.pressgangccms.rest.v1.collections;

import java.util.HashSet;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTBugzillaBugCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTBugzillaBugV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTBugzillaBugCollectionV1 extends RESTBaseUpdateCollectionV1<RESTBugzillaBugV1, RESTBugzillaBugCollectionV1, RESTBugzillaBugCollectionItemV1>
{
	private Set<RESTBugzillaBugCollectionItemV1> items;
	
	@Override
	public Set<RESTBugzillaBugCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTBugzillaBugCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTBugzillaBugV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTBugzillaBugCollectionItemV1>();
        }
        
        items.add(new RESTBugzillaBugCollectionItemV1(item, state));
    }
}
