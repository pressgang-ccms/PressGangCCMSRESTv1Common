package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTranslatedContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTTranslatedContentSpecV1 extends RESTBasePrimaryEntityV1<RESTTranslatedContentSpecV1,
        RESTTranslatedContentSpecCollectionV1, RESTTranslatedContentSpecCollectionItemV1> {
    public static final String CONTENT_SPEC_ID_NAME = "contentSpecId";
    public static final String CONTENT_SPEC_REV_NAME = "contentSpecRevision";
    public static final String CONTENT_SPEC_NAME = "contentSpec";
    public static final String TRANSLATED_NODES_NAME = "translatedNodes_OTM";

    private Integer contentSpecId = null;
    private Integer contentSpecRevision = null;
    private RESTContentSpecV1 contentSpec = null;
    private RESTTranslatedCSNodeCollectionV1 translatedNodes_OTM = null;
    private RESTTranslatedContentSpecCollectionV1 revisions = null;

    @Override
    public RESTTranslatedContentSpecCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTTranslatedContentSpecCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTranslatedContentSpecV1 clone(boolean deepCopy) {
        final RESTTranslatedContentSpecV1 retValue = new RESTTranslatedContentSpecV1();
        this.cloneInto(retValue, deepCopy);
        return retValue;
    }

    public void cloneInto(RESTTranslatedContentSpecV1 clone, boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.contentSpecId = contentSpecId;
        clone.contentSpecRevision = contentSpecRevision;

        if (deepCopy) {
            if (contentSpec != null) {
                clone.contentSpec = contentSpec.clone(deepCopy);
            }

            if (translatedNodes_OTM != null) {
                clone.translatedNodes_OTM = new RESTTranslatedCSNodeCollectionV1();
                translatedNodes_OTM.cloneInto(clone.translatedNodes_OTM, deepCopy);
            }

            if (revisions != null) {
                clone.revisions = new RESTTranslatedContentSpecCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.contentSpec = contentSpec;
            clone.translatedNodes_OTM = translatedNodes_OTM;
            clone.revisions = revisions;
        }
    }

    public Integer getContentSpecId() {
        return contentSpecId;
    }

    public void setContentSpecId(Integer contentSpecId) {
        this.contentSpecId = contentSpecId;
    }

    public void explicitSetContentSpecId(Integer contentSpecId) {
        this.contentSpecId = contentSpecId;
        setParameterToConfigured(CONTENT_SPEC_ID_NAME);
    }

    public Integer getContentSpecRevision() {
        return contentSpecRevision;
    }

    public void setContentSpecRevision(Integer contentSpecRevision) {
        this.contentSpecRevision = contentSpecRevision;
    }

    public void explicitSetContentSpecRevision(Integer contentSpecRevision) {
        this.contentSpecRevision = contentSpecRevision;
        setParameterToConfigured(CONTENT_SPEC_REV_NAME);
    }

    public RESTContentSpecV1 getContentSpec() {
        return contentSpec;
    }

    public void setContentSpec(RESTContentSpecV1 contentSpec) {
        this.contentSpec = contentSpec;
    }

    public RESTTranslatedCSNodeCollectionV1 getTranslatedNodes_OTM() {
        return translatedNodes_OTM;
    }

    public void setTranslatedNodes_OTM(RESTTranslatedCSNodeCollectionV1 translatedNodes) {
        this.translatedNodes_OTM = translatedNodes;
    }

    public void explicitSetTranslatedNodes_OTM(RESTTranslatedCSNodeCollectionV1 translatedNodes) {
        this.translatedNodes_OTM = translatedNodes;
        setParameterToConfigured(TRANSLATED_NODES_NAME);
    }
}
