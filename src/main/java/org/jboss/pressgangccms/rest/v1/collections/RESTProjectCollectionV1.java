package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTProjectV1;


/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTProjectCollectionV1 extends BaseRestCollectionV1<RESTProjectV1, RESTProjectCollectionV1>
{
	private List<RESTProjectV1> items;
	
	@Override
	public List<RESTProjectV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTProjectV1> items)
	{
		this.items = items;
	}
}
