package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUndefinedSettingCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTServerUndefinedEntityV1;

public class RESTApplicationUndefinedEntityCollectionItemV1 extends RESTBaseUndefinedSettingCollectionItemV1<RESTServerUndefinedEntityV1,
        Integer, RESTApplicationUndefinedEntityCollectionItemV1> {
    private RESTServerUndefinedEntityV1 item;

    public RESTApplicationUndefinedEntityCollectionItemV1() {

    }

    public RESTApplicationUndefinedEntityCollectionItemV1(final RESTServerUndefinedEntityV1 item) {
        setItem(item);
        setState(RESTBaseEntityCollectionItemV1.UNCHANGED_STATE);
    }

    public RESTApplicationUndefinedEntityCollectionItemV1(final RESTServerUndefinedEntityV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTServerUndefinedEntityV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTServerUndefinedEntityV1 item) {
        this.item = item;
    }

    @Override
    public RESTApplicationUndefinedEntityCollectionItemV1 clone(boolean deepCopy) {
        final RESTApplicationUndefinedEntityCollectionItemV1 retValue = new RESTApplicationUndefinedEntityCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }
}
