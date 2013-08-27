package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

public class RESTTextCSProcessingOptionsV1 {
    private Boolean strictTitles = null;

    public RESTTextCSProcessingOptionsV1 clone(final boolean deepCopy) {
        final RESTTextCSProcessingOptionsV1 retValue = new RESTTextCSProcessingOptionsV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTextCSProcessingOptionsV1 clone, final boolean deepCopy) {
        clone.strictTitles = strictTitles == null ? null : strictTitles;
    }

    public Boolean getStrictTitles() {
        return strictTitles;
    }

    public void setStrictTitles(Boolean permissive) {
        this.strictTitles = permissive;
    }
}
