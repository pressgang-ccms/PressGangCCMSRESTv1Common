package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageImageV1;

public class RESTLanguageImageCollectionItemV1 extends RESTBaseUpdateCollectionItemV1<RESTLanguageImageV1, RESTLanguageImageCollectionV1,
        RESTLanguageImageCollectionItemV1> {
    private RESTLanguageImageV1 item;

    public RESTLanguageImageCollectionItemV1() {

    }

    public RESTLanguageImageCollectionItemV1(final RESTLanguageImageV1 item) {
        setItem(item);
        setState(UNCHANGED_STATE);
    }

    public RESTLanguageImageCollectionItemV1(final RESTLanguageImageV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTLanguageImageCollectionItemV1 clone(boolean deepCopy) {
        final RESTLanguageImageCollectionItemV1 retValue = new RESTLanguageImageCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    public RESTLanguageImageV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTLanguageImageV1 item) {
        this.item = item;
    }
}