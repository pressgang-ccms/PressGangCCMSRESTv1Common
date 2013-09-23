package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseUndefinedSettingV1;

public class RESTApplicationUndefinedSettingV1 extends RESTBaseUndefinedSettingV1<RESTApplicationUndefinedSettingV1, String> {
    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public RESTApplicationUndefinedSettingV1 clone(boolean deepCopy) {
        final RESTApplicationUndefinedSettingV1 clone = new RESTApplicationUndefinedSettingV1();

        cloneInto(clone, deepCopy);

        return clone;
    }

    public void cloneInto(final RESTApplicationUndefinedSettingV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.value = value;
    }
}
