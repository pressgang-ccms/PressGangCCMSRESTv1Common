package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTApplicationUndefinedSettingV1;

public class RESTApplicationUndefinedSettingCollectionItemV1 extends
        RESTBaseUndefinedSettingCollectionItemV1<RESTApplicationUndefinedSettingV1, String,
                RESTApplicationUndefinedSettingCollectionItemV1> {
    private RESTApplicationUndefinedSettingV1 item;

    public RESTApplicationUndefinedSettingCollectionItemV1() {

    }

    public RESTApplicationUndefinedSettingCollectionItemV1(final RESTApplicationUndefinedSettingV1 item) {
        setItem(item);
        setState(RESTBaseEntityCollectionItemV1.UNCHANGED_STATE);
    }

    public RESTApplicationUndefinedSettingCollectionItemV1(final RESTApplicationUndefinedSettingV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTApplicationUndefinedSettingV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTApplicationUndefinedSettingV1 item) {
        this.item = item;
    }

    @Override
    public RESTApplicationUndefinedSettingCollectionItemV1 clone(boolean deepCopy) {
        final RESTApplicationUndefinedSettingCollectionItemV1 retValue = new RESTApplicationUndefinedSettingCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }
}
