package org.jboss.pressgang.ccms.rest.v1.collections.base;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseObjectV1;

public abstract class RESTBaseCollectionItemV1<T extends RESTBaseObjectV1<T>, V extends RESTBaseCollectionItemV1<T,
        V>> implements RESTCollectionItemV1<T, V> {
    public static final Integer UNCHANGED_STATE = 0;
    public static final Integer ADD_STATE = 1;
    public static final Integer REMOVE_STATE = 2;

    protected static Integer MIN_STATE = 0;
    protected static Integer MAX_STATE = 2;

    private Integer state = 0;

    protected boolean validState(final Integer state) {
        return state != null && state >= MIN_STATE && state <= MAX_STATE;
    }

    @Override
    public Integer getState() {
        return state;
    }

    @Override
    public void setState(final Integer state) {
        if (!validState(state)) this.state = UNCHANGED_STATE;
        else this.state = state;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof RESTBaseCollectionItemV1<?, ?>)) return false;

        final RESTBaseCollectionItemV1<?, ?> item = (RESTBaseCollectionItemV1<?, ?>) o;

        if (getItem() == null && item.getItem() != null) return false;
        if (getItem() != null && item.getItem() == null) return false;
        if (getItem() != null && item.getItem() != null && !getItem().equals(item.getItem())) return false;

        if (state == null && item.getState() != null) return false;
        if (state != null && item.getState() == null) return false;
        if (state != null && item.getState() != null && !state.equals(item.getState())) return false;

        return true;
    }

    @Override
    public void cloneInto(final RESTCollectionItemV1<T, V> clone, boolean deepCopy) {
        clone.setState(state);

        if (deepCopy) {
            clone.setItem(getItem() == null ? null : getItem().clone(deepCopy));
        } else {
            clone.setItem(getItem());
        }
    }

    @Override
    public boolean returnIsRemoveItem() {
        return state.equals(RESTBaseEntityCollectionItemV1.REMOVE_STATE);
    }

    @Override
    public boolean returnIsAddItem() {
        return state.equals(RESTBaseEntityCollectionItemV1.ADD_STATE);
    }
}