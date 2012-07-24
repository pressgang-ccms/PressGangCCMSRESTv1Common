package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTopicV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTopicCollectionV1 extends BaseRestCollectionV1<RESTTopicV1, RESTTopicCollectionV1>
{
	private List<RESTTopicV1> items;
	
	@Override
	public List<RESTTopicV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTTopicV1> items)
	{
		this.items = items;
	}
}
