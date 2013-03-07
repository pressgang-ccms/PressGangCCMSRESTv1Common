package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.base;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedNodeStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.IBaseJoinEntityV1;

public interface IContentSpecToCSMetaDataV1 extends IBaseJoinEntityV1 {

    public String getValue();

    public void setValue(final String value);

    public RESTCSTranslatedNodeStringCollectionV1 getTranslatedStrings_OTM();

    public void setTranslatedStrings_OTM(final RESTCSTranslatedNodeStringCollectionV1 translatedStrings);
}
