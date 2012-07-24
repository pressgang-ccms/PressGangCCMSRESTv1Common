package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTagCollectionV1 extends BaseRestCollectionV1<RESTTagV1, RESTTagCollectionV1>
{
	private List<RESTTagV1> items;
	
	@Override
	public List<RESTTagV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTTagV1> items)
	{
		this.items = items;
	}
}
