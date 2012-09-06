package org.jboss.pressgangccms.rest.v1.sort;

import java.util.Comparator;

import org.jboss.pressgangccms.rest.v1.entities.RESTProjectV1;

public class ProjectV1NameComparator implements Comparator<RESTProjectV1>
{
	public int compare(final RESTProjectV1 o1, final RESTProjectV1 o2) 
	{
		if (o1 == null && o2 == null)
			return 0;
		if (o1 == null)
			return -1;
		if (o2 == null)
			return 1;
		
		if (o1.getName() == null && o2.getName() == null)
			return 0;
		if (o1.getName() == null)
			return -1;
		if (o2.getName() == null)
			return 1;
		
		return o1.getName().compareTo(o2.getName());
	}

}
