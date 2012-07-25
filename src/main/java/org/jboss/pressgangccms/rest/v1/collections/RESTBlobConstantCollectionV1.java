package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTBlobConstantV1;



/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTBlobConstantCollectionV1 extends BaseRestCollectionV1<RESTBlobConstantV1, RESTBlobConstantCollectionV1>
{
	private List<RESTBlobConstantV1> items;
	
	@Override
	public List<RESTBlobConstantV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTBlobConstantV1> items)
	{
		this.items = items;
	}


}