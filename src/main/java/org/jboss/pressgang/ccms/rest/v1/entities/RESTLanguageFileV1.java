package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageFileCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLanguageFileCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTLanguageFileV1 extends RESTBaseEntityV1<RESTLanguageFileV1, RESTLanguageFileCollectionV1,
        RESTLanguageFileCollectionItemV1> {
    public static final String FILE_DATA_NAME = "fileData";
    public static final String LOCALE_NAME = "locale";
    public static final String FILE_NAME = "file";
    public static final String FILENAME_NAME = "filename";

    private RESTFileV1 file = null;
    private byte[] fileData = null;
    private String locale = null;
    private String filename = null;
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

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTLanguageFileV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.file = file;
        clone.locale = locale;
        clone.filename = filename;

        if (deepCopy) {
            /* use arraycopy as a GWT compatible alternative to clone() */

            if (fileData != null) {
                clone.fileData = new byte[fileData.length];
                System.arraycopy(fileData, 0, clone.fileData, 0, fileData.length);
            } else {
                clone.fileData = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTLanguageFileCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }  else {
                clone.revisions = null;
            }
        } else {
            clone.fileData = fileData;
            clone.revisions = revisions;
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
        setParameterToConfigured(FILE_DATA_NAME);
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void explicitSetLocale(final String locale) {
        this.locale = locale;
        setParameterToConfigured(LOCALE_NAME);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(final String filename) {
        this.filename = filename;
    }

    public void explicitSetFilename(final String filename) {
        this.filename = filename;
        setParameterToConfigured(FILENAME_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTLanguageFileV1)) return false;

        return super.equals(other);
    }
}
