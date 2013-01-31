package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.join.RESTAssignedCSMetaDataCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTAssignedCSMetaDataCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSMetaDataV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSMetaDataV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.join.base.IContentSpecToCSMetaDataV1;

public class RESTAssignedCSMetaDataV1 extends RESTBaseCSMetaDataV1<RESTAssignedCSMetaDataV1, RESTAssignedCSMetaDataCollectionV1,
        RESTAssignedCSMetaDataCollectionItemV1> implements IContentSpecToCSMetaDataV1 {

    public static final String VALUE_NAME = "value";
    public static final String TRANSLATED_STRINGS_NAME = "translatedStrings";

    private Integer relationshipId = null;
    private String value = null;
    private RESTCSTranslatedStringCollectionV1 translatedStrings = null;
    private RESTAssignedCSMetaDataCollectionV1 revisions = null;

    public RESTAssignedCSMetaDataV1() {

    }

    public RESTAssignedCSMetaDataV1(final RESTCSMetaDataV1 metaData) {
        metaData.cloneInto(this, false);
    }

    @Override
    public RESTAssignedCSMetaDataCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTAssignedCSMetaDataCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTAssignedCSMetaDataV1 clone(boolean deepCopy) {
        final RESTAssignedCSMetaDataV1 retValue = new RESTAssignedCSMetaDataV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTAssignedCSMetaDataV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.relationshipId = this.relationshipId;
        clone.value = this.value;

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTAssignedCSMetaDataCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (this.translatedStrings != null) {
                clone.translatedStrings = new RESTCSTranslatedStringCollectionV1();
                this.translatedStrings.cloneInto(clone.translatedStrings, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
            clone.translatedStrings = this.translatedStrings;
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void explicitSetValue(final String value) {
        this.value = value;
        this.setParameterToConfigured(VALUE_NAME);
    }

    public RESTCSTranslatedStringCollectionV1 getTranslatedStrings_OTM() {
        return translatedStrings;
    }

    public void setTranslatedStrings_OTM(final RESTCSTranslatedStringCollectionV1 translatedStrings) {
        this.translatedStrings = translatedStrings;
    }

    public void explicitSetTranslatedStrings_OTM(final RESTCSTranslatedStringCollectionV1 translatedStrings) {
        this.translatedStrings = translatedStrings;
        this.setParameterToConfigured(TRANSLATED_STRINGS_NAME);
    }

    @Override
    public Integer getRelationshipId() {
        return relationshipId;
    }

    @Override
    public void setRelationshipId(final Integer relationshipId) {
        this.relationshipId = relationshipId;
    }
}
