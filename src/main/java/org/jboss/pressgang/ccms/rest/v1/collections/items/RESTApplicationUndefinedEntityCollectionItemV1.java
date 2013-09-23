package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTApplicationUndefinedEntityV1;

public class RESTApplicationUndefinedEntityCollectionItemV1 extends RESTBaseUndefinedSettingCollectionItemV1<RESTApplicationUndefinedEntityV1, RESTApplicationUndefinedEntityCollectionItemV1> {
    private RESTApplicationUndefinedEntityV1 item;

    public RESTApplicationUndefinedEntityCollectionItemV1() {

    }

    public RESTApplicationUndefinedEntityCollectionItemV1(final RESTApplicationUndefinedEntityV1 item) {
        setItem(item);
        setState(RESTBaseCollectionItemV1.UNCHANGED_STATE);
    }

    public RESTApplicationUndefinedEntityCollectionItemV1(final RESTApplicationUndefinedEntityV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTApplicationUndefinedEntityV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTApplicationUndefinedEntityV1 item) {
        this.item = item;
    }

    @Override
    public RESTApplicationUndefinedEntityCollectionItemV1 clone(boolean deepCopy) {
        final RESTApplicationUndefinedEntityCollectionItemV1 retValue = new RESTApplicationUndefinedEntityCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }
}
