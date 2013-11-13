package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public abstract class RESTBaseEntityCollectionItemV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseCollectionItemV1<T, V> {

    @Override
    public abstract T getItem();

    @Override
    public boolean equals(final Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof RESTBaseEntityCollectionItemV1<?, ?, ?>)) return false;

        return true;
    }
}
