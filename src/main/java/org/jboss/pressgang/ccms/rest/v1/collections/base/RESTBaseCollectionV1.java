package org.jboss.pressgang.ccms.rest.v1.collections.base;

import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.ADD_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.REMOVE_STATE;
import static org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1.UNCHANGED_STATE;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectV1;

public abstract class RESTBaseCollectionV1<T extends RESTBaseObjectV1<T>, V extends RESTBaseCollectionItemV1<T,
        V>> implements RESTCollectionV1<T, V> {
    private Integer size = null;

    protected abstract void addItem(final T item, final Integer state);

    /**
     * Get a collection of REST entities wrapped as collection items that have a particular state
     *
     * @param states Defines the list of states that an entity can be in to be returned
     * @return A collection that holds all the REST entities included in the states collection
     */
    @Override
    public List<V> returnCollectionItemsWithState(final List<Integer> states) {
        if (states == null) throw new IllegalArgumentException("states cannot be null");

        final List<V> retValue = new ArrayList<V>();

        for (final V item : getItems()) {
            if (states.contains(item.getState())) retValue.add(item);
        }

        return retValue;
    }

    /**
     * @return A collection of deleted items
     */
    @Override
    public List<V> returnDeletedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(REMOVE_STATE);
            }
        });
    }

    /**
     * @return A collection of added items
     */
    @Override
    public List<V> returnAddedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(ADD_STATE);
            }
        });
    }

    /**
     * @return A collection of existing items
     */
    @Override
    public List<V> returnExistingCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(UNCHANGED_STATE);
            }
        });
    }

    /**
     * @return A collection of existing and added items
     */
    @Override
    public List<V> returnExistingAndAddedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(UNCHANGED_STATE);
                add(ADD_STATE);
            }
        });
    }

    /**
     * @return A collection of added and deleted items
     */
    @Override
    public List<V> returnDeletedAndAddedCollectionItems() {
        return returnCollectionItemsWithState(new ArrayList<Integer>() {
            {
                add(REMOVE_STATE);
                add(ADD_STATE);
            }
        });
    }

    /**
     * Get a collection of REST entities that have a particular state
     *
     * @param states Defines the list of states that an entity can be in to be returned
     * @return A collection that holds all the REST entities included in the states collection
     */
    @Override
    public List<T> returnItemsWithState(final List<Integer> states) {
        if (states == null) throw new IllegalArgumentException("states cannot be null");

        final List<T> retValue = new ArrayList<T>();

        for (final V item : getItems()) {
            if (states.contains(item.getState())) retValue.add(item.getItem());
        }

        return retValue;
    }

    /**
     * @return A collection of deleted items
     */
    @Override
    public List<T> returnDeletedItems() {
        return returnItemsWithState(new ArrayList<Integer>() {
            {
                add(REMOVE_STATE);
            }
        });
    }

    /**
     * @return A collection of added items
     */
    @Override
    public List<T> returnAddedItems() {
        return returnItemsWithState(new ArrayList<Integer>() {
            {
                add(ADD_STATE);
            }
        });
    }

    /**
     * @return A collection of existing items
     */
    @Override
    public List<T> returnExistingItems() {
        return returnItemsWithState(new ArrayList<Integer>() {
            {
                add(UNCHANGED_STATE);
            }
        });
    }

    /**
     * Get any items that were added or unchanged. This is commonly used when
     * getting items that should be displayed to the end user.
     *
     * @return A collection of added and existing items
     */
    @Override
    public List<T> returnExistingAndAddedItems() {
        return returnItemsWithState(new ArrayList<Integer>() {
            {
                add(UNCHANGED_STATE);
                add(ADD_STATE);
            }
        });
    }

    /**
     * Get any items that were added or deleted. This is commonly used when
     * getting items that will change the database.
     *
     * @return A collection of added and existing items
     */
    @Override
    public List<T> returnDeletedAndAddedItems() {
        return returnItemsWithState(new ArrayList<Integer>() {
            {
                add(REMOVE_STATE);
                add(ADD_STATE);
            }
        });
    }

    @Override
    public List<T> returnItems() {
        final List<T> items = new ArrayList<T>();

        if (getItems() != null) {
            for (final V item : getItems()) {
                final T entity = item.getItem();

                if (entity != null) {
                    items.add(entity);
                }
            }
        }

        return items;
    }

    /**
     * It is possible that a client has sent up a collection that asks to add and remove the same child item in a collection.
     * This method, combined with the ignoreDuplicatedAddRemoveItemRequests() method, will weed out any duplicated requests.
     */
    @Override
    public void removeInvalidChangeItemRequests() {
        /* ignore attempts to add/remove/update null items and items with invalid states */
        if (getItems() != null) {
            final List<V> items = new ArrayList<V>(getItems());

            for (final V item : items) {
                if (item.getItem() == null) {
                    getItems().remove(item);
                } else if (item.getState() != null && item.getState().equals(UNCHANGED_STATE)) {
                    getItems().remove(item);
                } else if (item.getState() != null && !item.validState(item.getState())) {
                    getItems().remove(item);
                }
            }

            ignoreDuplicatedChangeItemRequests();
        }
    }

    /**
     * This method will clear out any child items that are marked for both add and remove, or duplicated add and remove
     * requests. Override this method to deal with collections where the children are not uniquely identified by only their id.
     * <p/>
     * This shouldn't occur when using the REST API through Java but may occur if a request is sent through a generic browser.
     */
    protected abstract void ignoreDuplicatedChangeItemRequests();

    @Override
    public void cloneInto(final RESTCollectionV1<T, V> dest, final boolean deepCopy) {
        dest.setSize(size);

        if (getItems() != null) {
            dest.setItems(new ArrayList<V>());
            if (deepCopy) {
                for (final V item : getItems())
                    dest.getItems().add(item.clone(deepCopy));
            } else {
                dest.getItems().addAll(getItems());
            }
        }
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void setSize(final Integer size) {
        this.size = size;
    }

    @Override
    public void addItem(final T item) {
        addItem(item, UNCHANGED_STATE);
    }

    @Override
    public void addNewItem(final T item) {
        addItem(item, ADD_STATE);
    }

    @Override
    public void addRemoveItem(final T item) {
        addItem(item, REMOVE_STATE);
    }
}
