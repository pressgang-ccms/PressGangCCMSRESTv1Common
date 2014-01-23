package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTLanguageImageCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLanguageImageCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTLanguageImageV1 extends RESTBaseEntityV1<RESTLanguageImageV1, RESTLanguageImageCollectionV1,
        RESTLanguageImageCollectionItemV1> {
    public static final String IMAGEDATA_NAME = "imageData";
    public static final String IMAGEDATABASE64_NAME = "imageDataBase64";
    public static final String THUMBNAIL_NAME = "thumbnail";
    public static final String LOCALE_NAME = "locale";
    public static final String IMAGE_NAME = "image";
    public static final String FILENAME_NAME = "filename";

    private RESTImageV1 image = null;
    private byte[] imageData = null;
    private byte[] thumbnail = null;
    private byte[] imageDataBase64 = null;
    private String locale = null;
    private String filename = null;
    private char[] contentHash = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTLanguageImageCollectionV1 revisions = null;

    @Override
    public RESTLanguageImageCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTLanguageImageCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTLanguageImageV1 clone(boolean deepCopy) {
        final RESTLanguageImageV1 retValue = new RESTLanguageImageV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTLanguageImageV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.image = image;
        clone.filename = filename;
        clone.locale = locale;

        if (deepCopy) {
            /* use arraycopy as a GWT compatible alternative to clone() */

            if (imageData != null) {
                clone.imageData = new byte[imageData.length];
                System.arraycopy(imageData, 0, clone.imageData, 0, imageData.length);
            } else {
                clone.imageData = null;
            }

            if (thumbnail != null) {
                clone.thumbnail = new byte[thumbnail.length];
                System.arraycopy(thumbnail, 0, clone.thumbnail, 0, thumbnail.length);
            } else {
                clone.thumbnail = null;
            }

            if (imageDataBase64 != null) {
                clone.imageDataBase64 = new byte[imageDataBase64.length];
                System.arraycopy(imageDataBase64, 0, clone.imageDataBase64, 0, imageDataBase64.length);
            } else {
                clone.imageDataBase64 = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTLanguageImageCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }
        } else {
            clone.imageData = imageData;
            clone.thumbnail = thumbnail;
            clone.imageDataBase64 = imageDataBase64;
            clone.revisions = revisions;
        }
    }

    public RESTImageV1 getImage() {
        return image;
    }

    public void setImage(RESTImageV1 image) {
        this.image = image;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(final byte[] imageData) {
        this.imageData = imageData;
    }

    public void explicitSetImageData(final byte[] imageData) {
        this.imageData = imageData;
        setParameterToConfigured(IMAGEDATA_NAME);
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(final byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public byte[] getImageDataBase64() {
        return imageDataBase64;
    }

    public void setImageDataBase64(final byte[] imageDataBase64) {
        this.imageDataBase64 = imageDataBase64;
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
        if (!(other instanceof RESTLanguageImageV1)) return false;

        return super.equals(other);
    }

    public char[] getContentHash() {
        return contentHash;
    }

    public void setContentHash(char[] contentHash) {
        this.contentHash = contentHash;
    }
}
