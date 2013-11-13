package org.jboss.pressgang.ccms.rest.v1.collections.items.join;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagInCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTTagInCategoryV1;

public class RESTTagInCategoryCollectionItemV1 extends RESTBaseEntityUpdateCollectionItemV1<RESTTagInCategoryV1, RESTTagInCategoryCollectionV1,
        RESTTagInCategoryCollectionItemV1> {
    private RESTTagInCategoryV1 item;

    public RESTTagInCategoryCollectionItemV1() {

    }

    public RESTTagInCategoryCollectionItemV1(final RESTTagInCategoryV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTTagInCategoryCollectionItemV1(final RESTTagInCategoryV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTTagInCategoryCollectionItemV1 clone(boolean deepCopy) {
        final RESTTagInCategoryCollectionItemV1 retValue = new RESTTagInCategoryCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTTagInCategoryV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTTagInCategoryV1 item) {
        this.item = item;
    }
}