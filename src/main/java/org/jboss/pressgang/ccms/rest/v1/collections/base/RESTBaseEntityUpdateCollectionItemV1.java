package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public abstract class RESTBaseEntityUpdateCollectionItemV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T,
        U, V>, V extends RESTBaseEntityUpdateCollectionItemV1<T, U, V>> extends RESTBaseEntityCollectionItemV1<T, U,
        V> implements RESTUpdateCollectionItemV1<T, V> {
    private static final Integer MAX_UPDATE_STATE = 3;

    @Override
    protected boolean validState(final Integer state) {
        return state != null && state >= MIN_STATE && state <= MAX_UPDATE_STATE;
    }

    @Override
    public boolean returnIsUpdateItem() {
        return getState().equals(UPDATE_STATE);
    }
}
