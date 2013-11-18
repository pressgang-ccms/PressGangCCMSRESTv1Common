package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseUndefinedSettingV1;

public class RESTServerUndefinedEntityV1 extends RESTBaseUndefinedSettingV1<RESTServerUndefinedEntityV1, Integer> {
    public static final String VALUE_NAME = "value";

    private Integer value;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(final Integer value) {
        this.value = value;
    }

    public void explicitSetValue(final Integer value) {
        this.value = value;
        setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public RESTServerUndefinedEntityV1 clone(boolean deepCopy) {
        final RESTServerUndefinedEntityV1 clone = new RESTServerUndefinedEntityV1();

        cloneInto(clone, deepCopy);

        return clone;
    }

    public void cloneInto(final RESTServerUndefinedEntityV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.value = value;
    }
}
