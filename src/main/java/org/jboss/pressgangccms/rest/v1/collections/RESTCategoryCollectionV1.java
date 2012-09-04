package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTCategoryV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTCategoryCollectionV1 extends BaseRestCollectionV1<RESTCategoryV1, RESTCategoryCollectionV1>
{
	private List<RESTCategoryV1> items;
	
	@Override
	public List<RESTCategoryV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTCategoryV1> items)
	{
		this.items = items;
	}
}
