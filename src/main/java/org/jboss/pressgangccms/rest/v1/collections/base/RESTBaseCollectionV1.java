package org.jboss.pressgangccms.rest.v1.collections.base;

import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

/**
 * @author Matthew Casperson
 * 
 * @param <T>
 *            The REST entity type
 * @param <U>
 *            The REST Collection type
 */
abstract public class RESTBaseCollectionV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>>
{
	private Integer size = 0;
	private String expand = null;
	private Integer startExpandIndex = null;
	private Integer endExpandIndex = null;

	abstract public Set<V> getItems();
	
	abstract public void setItems(final Set<V> items);
	
	abstract protected void addItem(final T item, final Integer state);

    public List<T> returnItems()
    {
        final List<T> items = new ArrayList<T>();
        
        if (this.getItems() != null)
        {
            for (final V item : this.getItems())
            {
                final T entity = item.getItem();
                
                if (entity != null)
                {
                    items.add(entity);
                }
            }
        }
        
        return items;
    }
	
	/**
	 * It is possible that a client has sent up a collection that asks to add and remove the same
	 * child item in a collection. This method, combined with the ignoreDuplicatedAddRemoveItemRequests() method,
	 * will weed out any duplicated requests.
	 */
	public void removeInvalidAddRemoveItemRequests()
	{
		/* ignore attempts to remove and add the same tag */
		if (this.getItems() != null)
		{
		    final List<V> removeChildren = new ArrayList<V>();
		    
		    for (final V item : this.getItems())
		    {
		        if (item.getItem() == null)
		        {
		            removeChildren.add(item);
		        }
		    }
		    
		    for (final V removeChild : removeChildren)
            {
                this.getItems().remove(removeChild);
            }
		    
		    ignoreDuplicatedAddRemoveItemRequests();
		}
	}
	
	/**
     * This method will clear out any child items that are marked for both add and remove, or duplicated add and remove requests.
     * Override this method to deal with collections where the children are not uniquely identified by only their id.
     */
    protected void ignoreDuplicatedAddRemoveItemRequests()
    {
        if (this.getItems() != null)
        {
            final List<V> removeChildren = new ArrayList<V>();
            final List<V> items = new ArrayList<V>(this.getItems());
        
            /* on the second loop, remove any items that are marked for both add and remove is separate items */
            for (int i = 0; i < items.size(); ++i)
            {
                final V child1 = items.get(i);
                final T childItem1 = child1.getItem();
                
                /* at this point we know that either add1, remove1 or update1 will be true, but only one can be set */
                final boolean add1 = child1.getState() == ADD_STATE;
                final boolean remove1 = child1.getState() == REMOVE_STATE;
                final boolean update1 = child1.getState() == UPDATE_STATE;
                
                /* Loop a second time, looking for duplicates */
                for (int j = i + 1; j < items.size(); ++j)
                {
                    final V child2 = items.get(j);
                    final T childItem2 = child2.getItem();
                    
                    if (childItem1.getId() != null && childItem2.getId() != null
                            && childItem1.getId().equals(childItem2.getId()))
                    {
                        final boolean add2 = child2.getState() == ADD_STATE;
                        final boolean remove2 = child2.getState() == REMOVE_STATE;
                        final boolean update2 = child2.getState() == UPDATE_STATE;
                        
                        /* check for double add, double remove, double update, and remove one instance */
                        if ((add1 && add2) || (remove1 && remove2) || (update1 && update2))                     
                            if (!removeChildren.contains(child1) && !removeChildren.contains(child2))
                                removeChildren.add(child1);
                        
                        /* check for add and remove, remove and add, remove and update, update and remove and remove both instances */
                        if ((add1 && remove2) || (remove1 && add2)
                                || (update1 && remove2) || (update2 && remove1)
                                || (update1 && add2) || (update2 && add1))
                        {
                            //System.out.println("Removed redundant pair of add/remove or update/remove children with ID " + childItem1.getId());
                            
                            if (!removeChildren.contains(child1))
                                removeChildren.add(child1);
                            if (!removeChildren.contains(child2))
                                removeChildren.add(child2);
                        }
                    }
                }
            }
            
            for (final V removeChild : removeChildren)
            {
                this.getItems().remove(removeChild);
            }
        }
    }

	public void cloneInto(final RESTBaseCollectionV1<T, U, V> dest, final boolean deepCopy)
	{
		dest.size = this.size;
		dest.expand = this.expand;
		dest.startExpandIndex = this.startExpandIndex;
		dest.endExpandIndex = this.endExpandIndex;

		if (this.getItems() != null)
		{
			dest.setItems(new HashSet<V>());
			if (deepCopy)
			{
				for (final V item : this.getItems())
					dest.getItems().add(item.clone(deepCopy));
			}
			else
			{
				dest.getItems().addAll(this.getItems());
			}
		}
	}

	public Integer getSize()
	{
		return size;
	}

	public void setSize(final Integer size)
	{
		this.size = size;
	}

	public String getExpand()
	{
		return expand;
	}

	public void setExpand(final String expand)
	{
		this.expand = expand;
	}

	public Integer getStartExpandIndex()
	{
		return startExpandIndex;
	}

	public void setStartExpandIndex(final Integer startExpandIndex)
	{
		this.startExpandIndex = startExpandIndex;
	}

	public Integer getEndExpandIndex()
	{
		return endExpandIndex;
	}

	public void setEndExpandIndex(final Integer endExpandIndex)
	{
		this.endExpandIndex = endExpandIndex;
	}
	
	public void addItem(final T item)
    {
        addItem(item, UNCHANGED_STATE);
    }
	
	public void addNewItem(final T item)
    {
        addItem(item, ADD_STATE);
    }
    
    public void addRemoveItem(final T item)
    {
        addItem(item, REMOVE_STATE);
    }
}
