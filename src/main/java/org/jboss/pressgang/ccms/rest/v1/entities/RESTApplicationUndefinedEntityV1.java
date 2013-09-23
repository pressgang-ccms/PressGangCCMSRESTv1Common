package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseUndefinedSettingV1;

public class RESTApplicationUndefinedEntityV1 extends RESTBaseUndefinedSettingV1<RESTApplicationUndefinedEntityV1, Integer> {
    private Integer value;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(final Integer value) {
        this.value = value;
    }

    @Override
    public RESTApplicationUndefinedEntityV1 clone(boolean deepCopy) {
        final RESTApplicationUndefinedEntityV1 clone = new RESTApplicationUndefinedEntityV1();

        cloneInto(clone, deepCopy);

        return clone;
    }

    public void cloneInto(final RESTApplicationUndefinedEntityV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.value = value;
    }
}
