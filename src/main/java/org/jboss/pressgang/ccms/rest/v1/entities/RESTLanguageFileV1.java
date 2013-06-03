package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageFileCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLanguageFileCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTLanguageFileV1 extends RESTBaseEntityV1<RESTLanguageFileV1, RESTLanguageFileCollectionV1,
        RESTLanguageFileCollectionItemV1> {
    public static final String FILE_DATA_NAME = "fileData";
    public static final String LOCALE_NAME = "locale";
    public static final String FILE_NAME = "file";

    private RESTFileV1 file = null;
    private byte[] fileData = null;
    private String locale = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTLanguageFileCollectionV1 revisions = null;

    @Override
    public RESTLanguageFileCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTLanguageFileCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTLanguageFileV1 clone(boolean deepCopy) {
        final RESTLanguageFileV1 retValue = new RESTLanguageFileV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTLanguageFileV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.file = this.file;
        clone.locale = this.locale;

        if (deepCopy) {
            /* use arraycopy as a GWT compatible alternative to clone() */

            if (fileData != null) {
                clone.fileData = new byte[this.fileData.length];
                System.arraycopy(this.fileData, 0, clone.fileData, 0, this.fileData.length);
            } else {
                clone.fileData = null;
            }

            if (this.revisions != null) {
                clone.revisions = new RESTLanguageFileCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.fileData = this.fileData;
            clone.revisions = this.revisions;
        }
    }

    public RESTFileV1 getFile() {
        return file;
    }

    public void setFile(RESTFileV1 file) {
        this.file = file;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(final byte[] fileData) {
        this.fileData = fileData;
    }

    public void explicitSetFileData(final byte[] fileData) {
        this.fileData = fileData;
        this.setParameterToConfigured(FILE_DATA_NAME);
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void explicitSetLocale(final String locale) {
        this.locale = locale;
        this.setParameterToConfigured(LOCALE_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTLanguageFileV1)) return false;

        return super.equals(other);
    }
}
