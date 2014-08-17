package org.jboss.pressgang.ccms.rest.v1.entities.base;

public interface RESTPrimaryEntityV1 {
    void setLinks(final String baseUrl, final String restBasePath, final String dataType, final Object id);
    String getSelfLink();
    void setSelfLink(final String selfLink);
    String getEditLink();
    void setEditLink(final String editLink);
    String getDeleteLink();
    void setDeleteLink(final String deleteLink);
    String getAddLink();
    void setAddLink(final String addLink);
}
