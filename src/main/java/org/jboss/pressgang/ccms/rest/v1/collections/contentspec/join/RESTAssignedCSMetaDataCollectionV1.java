package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join.RESTAssignedCSMetaDataCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.RESTAssignedCSMetaDataV1;

public class RESTAssignedCSMetaDataCollectionV1 extends RESTBaseUpdateCollectionV1<RESTAssignedCSMetaDataV1, RESTAssignedCSMetaDataCollectionV1, RESTAssignedCSMetaDataCollectionItemV1> {

    private List<RESTAssignedCSMetaDataCollectionItemV1> items;
    
    @Override
    public List<RESTAssignedCSMetaDataCollectionItemV1> getItems() {
        return items;
    }

    @Override
    public void setItems(final List<RESTAssignedCSMetaDataCollectionItemV1> items) {
        this.items = items;
    }

    @Override
    protected void addItem(final RESTAssignedCSMetaDataV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new ArrayList<RESTAssignedCSMetaDataCollectionItemV1>();
        }
        
        items.add(new RESTAssignedCSMetaDataCollectionItemV1(item, state));
    }
    
    /**
     * This method will clear out any child items that are marked for both add and remove, or duplicated add and remove requests.
     * Override this method to deal with collections where the children are not uniquely identified by only their id.
     */
    @Override
    protected void ignoreDuplicatedChangeItemRequests()
    {
        if (this.getItems() != null)
        {
            final List<RESTAssignedCSMetaDataCollectionItemV1> items = new ArrayList<RESTAssignedCSMetaDataCollectionItemV1>(this.getItems());
        
            /* on the second loop, remove any items that are marked for both add and remove is separate items */
            for (int i = 0; i < items.size(); ++i)
            {
                final RESTAssignedCSMetaDataCollectionItemV1 child1 = items.get(i);
                final RESTAssignedCSMetaDataV1 childItem1 = child1.getItem();
                
                // New Entity so ignore it
                if (childItem1.getId() == null)
                    continue;
                
                /* at this point we know that either add1 or remove1 will be true, but not both */
                final boolean add1 = child1.getState() == ADD_STATE;
                final boolean remove1 = child1.getState() == REMOVE_STATE;
                final boolean update1 = child1.getState() == UPDATE_STATE;
                
                /* Loop a second time, looking for duplicates */
                for (int j = i + 1; j < items.size(); ++j)
                {
                    final RESTAssignedCSMetaDataCollectionItemV1 child2 = items.get(j);
                    final RESTAssignedCSMetaDataV1 childItem2 = child2.getItem();
                    
                    // New Entity so ignore it
                    if (childItem2.getId() == null)
                        continue;
                    
                    final boolean relationshipIdEqual = childItem1.getRelationshipId() == null && childItem2.getRelationshipId() == null 
                            || childItem1.getRelationshipId() != null && childItem1.getRelationshipId().equals(childItem2.getRelationshipId());
                    
                    /* Check the MetaData objects for their value as well as their IDs to ensure duplicates are removed*/
                    if (childItem1.getId().equals(childItem2.getId()) && relationshipIdEqual)
                    {
                        final boolean add2 = child2.getState() == ADD_STATE;
                        final boolean remove2 = child2.getState() == REMOVE_STATE;
                        final boolean update2 = child2.getState() == UPDATE_STATE;
                        
                        /* Do some checks on values that could be null */
                        final boolean valueEqual = childItem1.getValue() == null && childItem2.getValue() == null 
                                || childItem1.getValue() != null && childItem1.getValue().equals(childItem2.getValue());
                        
                        /* check for double add, double remove, double update, and remove one instance */
                        if ((add1 && add2) || (remove1 && remove2) || (update1 && update2))
                        {
                            /* 
                             * If the relationship values are equal then we only need to remove one item. If
                             * the are different then both should be removed. 
                             */
                            if (valueEqual)
                            {
                                this.getItems().remove(child1);
                            }
                            else
                            {
                                this.getItems().remove(child1);
                                this.getItems().remove(child2);
                            }
                        }
                        
                        /* check for double add, double remove, add and remove, remove and add */
                        if ((add1 && remove2) || (remove1 && add2)
                                || (update1 && remove2) || (update2 && remove1)
                                || (update1 && add2) || (update2 && add1))
                        {
                            this.getItems().remove(child1);
                            this.getItems().remove(child2);
                        }
                    }
                }
            }
        }
    }
}
