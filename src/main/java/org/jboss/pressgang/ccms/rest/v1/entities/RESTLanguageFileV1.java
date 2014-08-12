/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

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
    private RESTLocaleV1 locale = null;
    private String filename = null;
    private char[] contentHash = null;
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
        clone.filename = filename;

        if (deepCopy) {
            if (locale != null) {
                clone.locale = locale.clone(deepCopy);
            } else {
                clone.locale = null;
            }

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
            clone.locale = locale;
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

    public RESTLocaleV1 getLocale() {
        return locale;
    }

    public void setLocale(final RESTLocaleV1 locale) {
        this.locale = locale;
    }

    public void explicitSetLocale(final RESTLocaleV1 locale) {
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

    public char[] getContentHash() {
        return contentHash;
    }

    public void setContentHash(char[] contentHash) {
        this.contentHash = contentHash;
    }
}
