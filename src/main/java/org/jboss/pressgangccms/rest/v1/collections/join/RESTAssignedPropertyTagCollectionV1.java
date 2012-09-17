package org.jboss.pressgangccms.rest.v1.collections.join;

import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTAssignedPropertyTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTAssignedPropertyTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTAssignedPropertyTagV1, RESTAssignedPropertyTagCollectionV1, RESTAssignedPropertyTagCollectionItemV1>
{
	private Set<RESTAssignedPropertyTagCollectionItemV1> items;
	
	@Override
	public Set<RESTAssignedPropertyTagCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTAssignedPropertyTagCollectionItemV1> items)
	{
		this.items = items;
	}
	
	public void addUpdateItem(final RESTAssignedPropertyTagV1 item)
    {
        addItem(item, UPDATE_STATE);
    }

    @Override
    protected void addItem(final RESTAssignedPropertyTagV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTAssignedPropertyTagCollectionItemV1>();
        }
        
        items.add(new RESTAssignedPropertyTagCollectionItemV1(item, state));
    }
	
	/**
	 * PropertyTags are only duplicated when they are unique, have the same ID and the same value.
	 */
	@Override
	protected void ignoreDuplicatedAddRemoveItemRequests()
	{
		if (this.getItems() != null)
		{
			final List<RESTAssignedPropertyTagCollectionItemV1> removeChildren = new ArrayList<RESTAssignedPropertyTagCollectionItemV1>();
			final List<RESTAssignedPropertyTagCollectionItemV1> items = new ArrayList<RESTAssignedPropertyTagCollectionItemV1>(this.getItems());
		
			/* on the second loop, remove any items that are marked for both add and remove is separate items */
			for (int i = 0; i < items.size(); ++i)
			{
				final RESTAssignedPropertyTagCollectionItemV1 child1 = items.get(i);
				final RESTAssignedPropertyTagV1 childItem1 = child1.getItem();
				
				/* at this point we know that either add1 or remove1 will be true, but not both */
				final boolean add1 = child1.getState() == ADD_STATE;
				final boolean remove1 = child1.getState() == REMOVE_STATE;
				final boolean update1 = child1.getState() == UPDATE_STATE;
				
				/* Loop a second time, looking for duplicates */
				for (int j = i + 1; j < items.size(); ++j)
				{
					final RESTAssignedPropertyTagCollectionItemV1 child2 = items.get(j);
					final RESTAssignedPropertyTagV1 childItem2 = child2.getItem();
					
					/* Check the PropertyTags for uniqueness and their value as well as their IDs */
					if ((childItem1.getIsUnique()
					        && childItem2.getIsUnique())
					        && childItem1.getId().equals(childItem2.getId())
					        && childItem1.getValue().equals(childItem2.getValue()))
					{
						final boolean add2 = child2.getState() == ADD_STATE;
						final boolean remove2 = child2.getState() == REMOVE_STATE;
						final boolean update2 = child2.getState() == UPDATE_STATE;
						
						/* check for double add, double remove, double update, and remove one instance */
                        if ((add1 && add2) || (remove1 && remove2) || (update1 && update2))                     
                            if (!removeChildren.contains(child1) && !removeChildren.contains(child2))
                                removeChildren.add(child1);
						
						/* check for double add, double remove, add and remove, remove and add */
						if ((add1 && remove2) || (remove1 && add2)
						        || (update1 && remove2) || (update2 && remove2)
						        || (update1 && add2) || (update2 && add1))
							if (!removeChildren.contains(child1))
								removeChildren.add(child1);
					}
				}
			}
			
			for (final RESTAssignedPropertyTagCollectionItemV1 removeChild : removeChildren)
            {
                this.getItems().remove(removeChild);
            }
		}
	}
}
