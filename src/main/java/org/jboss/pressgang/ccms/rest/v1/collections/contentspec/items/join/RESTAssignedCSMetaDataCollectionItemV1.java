package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTAssignedCSMetaDataCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.RESTAssignedCSMetaDataV1;

public class RESTAssignedCSMetaDataCollectionItemV1
        extends
        RESTBaseUpdateCollectionItemV1<RESTAssignedCSMetaDataV1, RESTAssignedCSMetaDataCollectionV1, RESTAssignedCSMetaDataCollectionItemV1> {
    private RESTAssignedCSMetaDataV1 item;

    public RESTAssignedCSMetaDataCollectionItemV1() {

    }

    public RESTAssignedCSMetaDataCollectionItemV1(final RESTAssignedCSMetaDataV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTAssignedCSMetaDataCollectionItemV1(final RESTAssignedCSMetaDataV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTAssignedCSMetaDataCollectionItemV1 clone(boolean deepCopy) {
        final RESTAssignedCSMetaDataCollectionItemV1 retValue = new RESTAssignedCSMetaDataCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTAssignedCSMetaDataV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTAssignedCSMetaDataV1 item) {
        this.item = item;
    }
}
