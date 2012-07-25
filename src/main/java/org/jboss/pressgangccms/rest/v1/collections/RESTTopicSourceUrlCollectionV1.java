package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTTopicSourceUrlV1;


/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTTopicSourceUrlCollectionV1 extends BaseRestCollectionV1<RESTTopicSourceUrlV1, RESTTopicSourceUrlCollectionV1>
{
	private List<RESTTopicSourceUrlV1> items;
	
	@Override
	public List<RESTTopicSourceUrlV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTTopicSourceUrlV1> items)
	{
		this.items = items;
	}
}