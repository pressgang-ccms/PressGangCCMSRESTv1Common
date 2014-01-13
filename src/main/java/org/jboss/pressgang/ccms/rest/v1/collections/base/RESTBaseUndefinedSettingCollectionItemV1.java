package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseUndefinedSettingV1;

public abstract class RESTBaseUndefinedSettingCollectionItemV1<T extends RESTBaseUndefinedSettingV1<T, U>, U,
        V extends RESTBaseUndefinedSettingCollectionItemV1<T, U, V>>
    extends RESTBaseCollectionItemV1<T,
                V> implements RESTUpdateCollectionItemV1<T, V> {
    public static final Integer UPDATE_STATE = 3;

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
