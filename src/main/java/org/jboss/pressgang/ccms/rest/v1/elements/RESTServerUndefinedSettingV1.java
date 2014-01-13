package org.jboss.pressgang.ccms.rest.v1.elements;

import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseUndefinedSettingV1;

public class RESTServerUndefinedSettingV1 extends RESTBaseUndefinedSettingV1<RESTServerUndefinedSettingV1, String> {
    public static final String VALUE_NAME = "value";

    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(final String value) {
        this.value = value;
    }

    public void explicitSetValue(final String value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public RESTServerUndefinedSettingV1 clone(boolean deepCopy) {
        final RESTServerUndefinedSettingV1 clone = new RESTServerUndefinedSettingV1();

        cloneInto(clone, deepCopy);

        return clone;
    }

    public void cloneInto(final RESTServerUndefinedSettingV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.value = value;
    }
}
