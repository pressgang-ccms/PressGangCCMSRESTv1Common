package org.jboss.pressgang.ccms.rest.v1.entities.base;

public abstract class RESTBaseUndefinedSettingV1<T extends RESTBaseUndefinedSettingV1<T, U>,
        U> extends RESTBaseObjectWithConfiguredParametersV1<T> {
    public static final String KEY_NAME = "key";

    protected String key;

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
        super.cloneInto(clone);

        clone.key = key;
    }
}
