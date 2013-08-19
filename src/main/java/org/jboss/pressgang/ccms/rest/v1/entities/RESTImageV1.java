package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTImageCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTImageV1 extends RESTBasePrimaryEntityV1<RESTImageV1, RESTImageCollectionV1, RESTImageCollectionItemV1> {
    public static final String DESCRIPTION_NAME = "description";
    public static final String LANGUAGEIMAGES_NAME = "languageImages";

    private String description = null;
    private RESTLanguageImageCollectionV1 languageImages_OTM = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTImageCollectionV1 revisions = null;

    @Override
    public RESTImageCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTImageCollectionV1 revisions) {
        this.revisions = revisions;
    }


    @Override
    public RESTImageV1 clone(boolean deepCopy) {
        final RESTImageV1 retValue = new RESTImageV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTImageV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.description = description;

        if (deepCopy) {
            if (languageImages_OTM != null) {
                clone.languageImages_OTM = new RESTLanguageImageCollectionV1();
                languageImages_OTM.cloneInto(clone.languageImages_OTM, deepCopy);
            } else {
                clone.languageImages_OTM = null;
            }

            if (getRevisions() != null) {
                clone.revisions = new RESTImageCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.languageImages_OTM = languageImages_OTM;
            clone.revisions = revisions;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public RESTLanguageImageCollectionV1 getLanguageImages_OTM() {
        return languageImages_OTM;
    }

    public void setLanguageImages_OTM(RESTLanguageImageCollectionV1 languageImages_OTM) {
        this.languageImages_OTM = languageImages_OTM;
    }

    public void explicitSetLanguageImages_OTM(RESTLanguageImageCollectionV1 languageImages_OTM) {
        this.languageImages_OTM = languageImages_OTM;
        setParameterToConfigured(LANGUAGEIMAGES_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTImageV1)) return false;

        return super.equals(other);
    }
}
