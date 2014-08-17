package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslationServerV1;

public class RESTTranslationServerV1 extends RESTBaseTranslationServerV1<RESTTranslationServerV1> {

    public void explicitSetName(String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    public void explicitSetUrl(String url) {
        this.url = url;
        setParameterToConfigured(URL_NAME);
    }

    @Override
    public RESTTranslationServerV1 clone(boolean deepCopy) {
        final RESTTranslationServerV1 retValue = new RESTTranslationServerV1();
        cloneInto(retValue, deepCopy);
        return retValue;
    }

    public void cloneInto(final RESTTranslationServerV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTranslationServerV1)) return false;

        return super.equals(other);
    }
}
