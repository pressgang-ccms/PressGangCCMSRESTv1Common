package org.jboss.pressgangccms.rest.v1.collections.join;

import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jboss.pressgangccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTCategoryTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.join.RESTCategoryTagV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTCategoryTagCollectionV1 extends RESTBaseUpdateCollectionV1<RESTCategoryTagV1, RESTCategoryTagCollectionV1, RESTCategoryTagCollectionItemV1>
{
	private Set<RESTCategoryTagCollectionItemV1> items;
	
	@Override
	public Set<RESTCategoryTagCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final Set<RESTCategoryTagCollectionItemV1> items)
	{
		this.items = items;
	}
	
	public void addUpdateItem(final RESTCategoryTagV1 item)
    {
        addItem(item, UPDATE_STATE);
    }

    @Override
    protected void addItem(final RESTCategoryTagV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new HashSet<RESTCategoryTagCollectionItemV1>();
        }
        
        items.add(new RESTCategoryTagCollectionItemV1(item, state));
    }
	
	/**
     * CategoryTags are only duplicated when they have the same ID and the same value.
     */
    @Override
    protected void ignoreDuplicatedAddRemoveItemRequests()
    {
        if (this.getItems() != null)
        {
            final List<RESTCategoryTagCollectionItemV1> removeChildren = new ArrayList<RESTCategoryTagCollectionItemV1>();
            final List<RESTCategoryTagCollectionItemV1> items = new ArrayList<RESTCategoryTagCollectionItemV1>(this.getItems());
        
            /* on the second loop, remove any items that are marked for both add and remove is separate items */
            for (int i = 0; i < items.size(); ++i)
            {
                final RESTCategoryTagCollectionItemV1 child1 = items.get(i);
                final RESTCategoryTagV1 childItem1 = child1.getItem();
                
                /* at this point we know that either add1 or remove1 will be true, but not both */
                final boolean add1 = child1.getState() == ADD_STATE;
                final boolean remove1 = child1.getState() == REMOVE_STATE;
                final boolean update1 = child1.getState() == UPDATE_STATE;
                
                /* Loop a second time, looking for duplicates */
                for (int j = i + 1; j < items.size(); ++j)
                {
                    final RESTCategoryTagCollectionItemV1 child2 = items.get(j);
                    final RESTCategoryTagV1 childItem2 = child2.getItem();
                    
                    /* Check the PropertyTags for uniqueness and their value as well as their IDs */
                    if (childItem1.getId().equals(childItem2.getId()) && childItem1.getRelationshipSort().equals(childItem2.getRelationshipSort()))
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
            
            for (final RESTCategoryTagCollectionItemV1 removeChild : removeChildren)
            {               
                this.getItems().remove(removeChild);
            }
        }
    }
}
