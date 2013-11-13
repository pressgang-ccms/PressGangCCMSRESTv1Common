package org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;

public class RESTCSNodeCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTCSNodeV1, RESTCSNodeCollectionV1,
        RESTCSNodeCollectionItemV1> {
    private RESTCSNodeV1 item;

    public RESTCSNodeCollectionItemV1() {

    }

    public RESTCSNodeCollectionItemV1(final RESTCSNodeV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTCSNodeCollectionItemV1(final RESTCSNodeV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTCSNodeCollectionItemV1 clone(boolean deepCopy) {
        final RESTCSNodeCollectionItemV1 retValue = new RESTCSNodeCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTCSNodeV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTCSNodeV1 item) {
        this.item = item;
    }
}
