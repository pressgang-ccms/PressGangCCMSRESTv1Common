package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTStringConstantCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTStringConstantCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

/**
 * A REST representation of the StringConstants database entity
 */
public class RESTStringConstantV1 extends RESTBasePrimaryEntityV1<RESTStringConstantV1, RESTStringConstantCollectionV1,
        RESTStringConstantCollectionItemV1> {
    public static final String ID_NAME = "id";
    public static final String NAME_NAME = "name";
    public static final String VALUE_NAME = "value";

    private String name = null;
    private String value = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTStringConstantCollectionV1 revisions = null;

    @Override
    public RESTStringConstantCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTStringConstantCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTStringConstantV1 clone(boolean deepCopy) {
        final RESTStringConstantV1 retValue = new RESTStringConstantV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTStringConstantV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = this.name;
        clone.value = value;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTStringConstantCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void explicitSetName(final String name) {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void explicitSetValue(final String value) {
        this.value = value;
        this.setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTStringConstantV1)) return false;

        return super.equals(other);
    }
}
