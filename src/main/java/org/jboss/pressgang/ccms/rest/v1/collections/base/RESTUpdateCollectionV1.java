package org.jboss.pressgang.ccms.rest.v1.collections.base;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementV1;

public interface RESTUpdateCollectionV1<T extends RESTBaseElementV1<T>, V extends RESTBaseCollectionItemV1<T,
        V>> extends RESTCollectionV1<T, V> {
    /**
     * @return A collection of updated items
     */
    List<T> returnUpdatedItems();

    /**
     * @return A collection of existing, added and updated items
     */
    List<V> returnExistingAddedAndUpdatedCollectionItems();

    /**
     * @return A collection of added, deleted and updated items (i.e. all those that would trigger a change in the db)
     */
    List<V> returnDeletedAddedAndUpdatedCollectionItems();

    /**
     * @return A collection of updated items
     */
    List<V> returnUpdatedCollectionItems();

    void addUpdateItem(final T item);
}
