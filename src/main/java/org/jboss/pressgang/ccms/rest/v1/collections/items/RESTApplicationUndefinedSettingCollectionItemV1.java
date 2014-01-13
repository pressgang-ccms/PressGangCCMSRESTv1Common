package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTServerUndefinedSettingV1;

public class RESTApplicationUndefinedSettingCollectionItemV1 extends
        RESTBaseUndefinedSettingCollectionItemV1<RESTServerUndefinedSettingV1, String,
                RESTApplicationUndefinedSettingCollectionItemV1> {
    private RESTServerUndefinedSettingV1 item;

    public RESTApplicationUndefinedSettingCollectionItemV1() {

    }

    public RESTApplicationUndefinedSettingCollectionItemV1(final RESTServerUndefinedSettingV1 item) {
        setItem(item);
        setState(RESTBaseEntityCollectionItemV1.UNCHANGED_STATE);
    }

    public RESTApplicationUndefinedSettingCollectionItemV1(final RESTServerUndefinedSettingV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTServerUndefinedSettingV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTServerUndefinedSettingV1 item) {
        this.item = item;
    }

    @Override
    public RESTApplicationUndefinedSettingCollectionItemV1 clone(boolean deepCopy) {
        final RESTApplicationUndefinedSettingCollectionItemV1 retValue = new RESTApplicationUndefinedSettingCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }
}
