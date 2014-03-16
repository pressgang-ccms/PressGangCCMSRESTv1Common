package org.jboss.pressgang.ccms.rest.v1.collections.items;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTUpdateCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.elements.RESTZanataServerSettingsV1;

public class RESTZanataServerSettingsCollectionItemV1 extends RESTBaseCollectionItemV1<RESTZanataServerSettingsV1,
        RESTZanataServerSettingsCollectionItemV1> implements RESTUpdateCollectionItemV1<RESTZanataServerSettingsV1,
        RESTZanataServerSettingsCollectionItemV1> {
    private static final Integer MAX_UPDATE_STATE = 3;
    private RESTZanataServerSettingsV1 item;

    public RESTZanataServerSettingsCollectionItemV1() {

    }

    public RESTZanataServerSettingsCollectionItemV1(final RESTZanataServerSettingsV1 item) {
        setItem(item);
        setState(RESTBaseEntityCollectionItemV1.UNCHANGED_STATE);
    }

    public RESTZanataServerSettingsCollectionItemV1(final RESTZanataServerSettingsV1 item, final Integer state) {
        setItem(item);
        setState(state);
    }

    @Override
    public RESTZanataServerSettingsV1 getItem() {
        return item;
    }

    @Override
    public void setItem(final RESTZanataServerSettingsV1 item) {
        this.item = item;
    }

    @Override
    public RESTZanataServerSettingsCollectionItemV1 clone(boolean deepCopy) {
        final RESTZanataServerSettingsCollectionItemV1 retValue = new RESTZanataServerSettingsCollectionItemV1();

        super.cloneInto(retValue, deepCopy);

        return retValue;
    }

    @Override
    protected boolean validState(final Integer state) {
        return state != null && state >= MIN_STATE && state <= MAX_UPDATE_STATE;
    }

    @Override
    public boolean returnIsUpdateItem() {
        return getState().equals(UPDATE_STATE);
    }
}