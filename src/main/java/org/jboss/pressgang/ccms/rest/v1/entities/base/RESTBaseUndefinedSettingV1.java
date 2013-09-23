package org.jboss.pressgang.ccms.rest.v1.entities.base;

public abstract class RESTBaseUndefinedSettingV1<T extends RESTBaseUndefinedSettingV1<T, U>, U> {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public abstract U getValue();

    public abstract void setValue(U value);

    public abstract T clone(boolean deepCopy);

    public void cloneInto(final RESTBaseUndefinedSettingV1<?, ?> clone, final boolean deepCopy) {
        clone.key = key;
    }
}
