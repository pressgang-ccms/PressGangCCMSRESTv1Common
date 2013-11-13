package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTMinHashCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTProjectCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTMinHashV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTProjectV1;

public class RESTMinHashCollectionItemV1 extends RESTBaseCollectionItemV1<RESTMinHashV1, RESTMinHashCollectionV1, RESTMinHashCollectionItemV1> {
    private RESTMinHashV1 item;

    public RESTMinHashCollectionItemV1() {

    }

    public RESTMinHashCollectionItemV1(final RESTMinHashV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTMinHashCollectionItemV1(final RESTMinHashV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTMinHashCollectionItemV1 clone(boolean deepCopy) {
        final RESTMinHashCollectionItemV1 retValue = new RESTMinHashCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTMinHashV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTMinHashV1 item) {
        this.item = item;
    }
}