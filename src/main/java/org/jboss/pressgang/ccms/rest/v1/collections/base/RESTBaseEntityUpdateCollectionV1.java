package org.jboss.pressgang.ccms.rest.v1.collections.base;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1.UNCHANGED_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1.UPDATE_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

/**
 * @param <T> The REST entity type
 * @param <U> The REST Collection type
 * @author Matthew Casperson
 */
public abstract class RESTBaseEntityUpdateCollectionV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseEntityUpdateCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityCollectionV1<T, U,
        V> implements RESTUpdateCollectionV1<T, V> {
    /**
     * @return A collection of updated items
     */
    @Override
    public List<V> returnUpdatedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(UPDATE_STATE);
            }
        });
    }

    /**
     * @return A collection of existing, added and updated items
     */
    @Override
    public List<V> returnExistingAddedAndUpdatedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(UNCHANGED_STATE);
                add(ADD_STATE);
                add(UPDATE_STATE);
            }
        });
    }

    /**
     * @return A collection of added, deleted and updated items (i.e. all those that would trigger a change in the db)
     */
    @Override
    public List<V> returnDeletedAddedAndUpdatedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(REMOVE_STATE);
                add(ADD_STATE);
                add(UPDATE_STATE);
            }
        });
    }

    /**
     * @return A collection of updated items
     */
    @Override
    public List<T> returnUpdatedItems() {
        return returnItemsWithState(new ArrayList<Integer>() {
            {
                add(UPDATE_STATE);
            }
        });
    }

    @Override
    public void addUpdateItem(final T item) {
        addItem(item, UPDATE_STATE);
    }
}