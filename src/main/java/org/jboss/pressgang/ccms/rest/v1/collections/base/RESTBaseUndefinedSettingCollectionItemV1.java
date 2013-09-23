package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseUndefinedSettingV1;

public abstract class RESTBaseUndefinedSettingCollectionItemV1<T extends RESTBaseUndefinedSettingV1<T, ?>,
        V extends RESTBaseUndefinedSettingCollectionItemV1<T, V>> {
    private static Integer MIN_STATE = 0;
    private static Integer MAX_STATE = 3;

    private Integer state = 0;

    public abstract T getItem();

    public abstract void setItem(final T item);

    public abstract V clone(boolean deepCopy);

    protected boolean validState(final Integer state) {
        return state != null && state >= MIN_STATE && state <= MAX_STATE;
    }

    public Integer getState() {
        return state;
    }

    public void setState(final Integer state) {
        if (!validState(state)) this.state = RESTBaseCollectionItemV1.UNCHANGED_STATE;
        else this.state = state;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof RESTBaseUndefinedSettingCollectionItemV1<?, ?>)) return false;

        final RESTBaseUndefinedSettingCollectionItemV1<?, ?> item = (RESTBaseUndefinedSettingCollectionItemV1<?, ?>) o;

        if (getItem() == null && item.getItem() != null) return false;
        if (getItem() != null && item.getItem() == null) return false;
        if (getItem() != null && item.getItem() != null && !getItem().equals(item.getItem())) return false;

        if (state == null && item.getState() != null) return false;
        if (state != null && item.getState() == null) return false;
        if (state != null && item.getState() != null && !state.equals(item.getState())) return false;

        return true;
    }

    public void cloneInto(final RESTBaseUndefinedSettingCollectionItemV1<T, V> clone, boolean deepCopy) {
        clone.state = state;

        if (deepCopy) {
            clone.setItem(getItem() == null ? null : getItem().clone(deepCopy));
        } else {
            clone.setItem(getItem());
        }
    }

    public boolean returnIsRemoveItem() {
        return state.equals(RESTBaseCollectionItemV1.REMOVE_STATE);
    }

    public boolean returnIsAddItem() {
        return state.equals(RESTBaseCollectionItemV1.ADD_STATE);
    }

    public boolean returnIsUpdateItem() {
        return getState().equals(RESTBaseUpdateCollectionItemV1.UPDATE_STATE);
    }
}