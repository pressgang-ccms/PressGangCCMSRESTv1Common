package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementV1;

public interface RESTUpdateCollectionItemV1<T extends RESTBaseElementV1<T>, V extends RESTUpdateCollectionItemV1<T,
        V>> extends RESTCollectionItemV1<T, V> {
    public static final Integer UPDATE_STATE = 3;

    boolean returnIsUpdateItem();
}
