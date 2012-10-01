package org.jboss.pressgang.ccms.rest.v1.sort;

import java.util.Comparator;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;

/**
 * A comparator that compares the titles between two topics. It can be used to sort a Collection into alphabetical
 * order.
 * 
 * @author mcasperson
 *
 * @param <T> The Topic Entity Class
 * @param <U> The Topic Collection Class
 * @param <V> The Topic Collection Item Class
 */
public class BaseTopicV1TitleComparator implements Comparator<RESTBaseTopicV1>
{
	public int compare(final RESTBaseTopicV1 o1, final RESTBaseTopicV1 o2)
	{
		if (o1 == null && o2 == null)
			return 0;
		if (o1 == null)
			return -1;
		if (o2 == null)
			return 1;
		
		if (o1.getTitle() == null && o2.getTitle() == null)
			return 0;
		if (o1.getTitle() == null)
			return -1;
		if (o2.getTitle() == null)
			return 1;
		
		return o1.getTitle().compareTo(o2.getTitle());
	}
}