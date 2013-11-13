package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectV1;

public interface RESTCollectionItemV1<T extends RESTBaseObjectV1<T>, V extends RESTCollectionItemV1<T, V>> {
    T getItem();
    void setItem(final T item);

    V clone(boolean deepCopy);

    Integer getState();
    void setState(final Integer state);

    void cloneInto(final RESTCollectionItemV1<T, V> clone, boolean deepCopy);

    boolean returnIsRemoveItem();
    boolean returnIsAddItem();
}
