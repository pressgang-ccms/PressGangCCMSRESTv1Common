package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSMetaDataCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSMetaDataCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSMetaDataV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.RESTAssignedCSMetaDataV1;

public class RESTCSMetaDataV1 extends RESTBaseCSMetaDataV1<RESTCSMetaDataV1, RESTCSMetaDataCollectionV1, RESTCSMetaDataCollectionItemV1> {

    private RESTCSMetaDataCollectionV1 revisions = null;

    public RESTCSMetaDataV1() {

    }

    public RESTCSMetaDataV1(final RESTAssignedCSMetaDataV1 metaData) {
        metaData.cloneInto(this, false);
    }

    @Override
    public RESTCSMetaDataCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTCSMetaDataCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSMetaDataV1 clone(boolean deepCopy) {
        final RESTCSMetaDataV1 retValue = new RESTCSMetaDataV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSMetaDataV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTCSMetaDataCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
        }
    }

    public void explicitSetTitle(final String title) {
        this.title = title;
        setParameterToConfigured(TITLE_NAME);
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }
}
