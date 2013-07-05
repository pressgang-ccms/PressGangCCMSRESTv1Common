package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

public class RESTTextCSProcessingOptionsV1 {
    private Boolean permissive = null;

    public RESTTextCSProcessingOptionsV1 clone(final boolean deepCopy) {
        final RESTTextCSProcessingOptionsV1 retValue = new RESTTextCSProcessingOptionsV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTextCSProcessingOptionsV1 clone, final boolean deepCopy) {
        clone.permissive = permissive == null ? null : new Boolean(permissive);
    }

    public Boolean getPermissive() {
        return permissive;
    }

    public void setPermissive(Boolean permissive) {
        this.permissive = permissive;
    }
}
