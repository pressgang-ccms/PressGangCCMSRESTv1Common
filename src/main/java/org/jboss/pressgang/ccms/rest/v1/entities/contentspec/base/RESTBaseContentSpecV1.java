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

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTProcessInformationCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTranslatedContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTContentSpecTypeV1;

public abstract class RESTBaseContentSpecV1<T extends RESTBaseEntityWithPropertiesV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {

    public static final String LAST_PUBLISHED_NAME = "lastPublished";
    public static final String LOCALE_NAME = "locale";
    public static final String TYPE_NAME = "type";
    public static final String TAGS_NAME = "tags";
    public static final String TRANSLATED_CONTENT_SPECS_NAME = "translatedContentSpecs";
    public static final String PROCESSES_NAME = "processes";

    protected String locale = null;
    protected Date lastPublished = null;
    protected Date lastModified = null;
    protected String errors = null;
    protected String failedContentSpec = null;
    protected RESTContentSpecTypeV1 type = null;
    protected RESTTagCollectionV1 tags = null;
    protected RESTTranslatedContentSpecCollectionV1 translatedContentSpecs = null;
    protected RESTProcessInformationCollectionV1 processes = null;

    public void cloneInto(final RESTBaseContentSpecV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.locale = locale;
        clone.lastPublished = lastPublished == null ? null : (Date) lastPublished.clone();
        clone.lastModified = lastModified == null ? null : (Date) lastModified.clone();
        clone.errors = errors;
        clone.failedContentSpec = failedContentSpec;

        if (deepCopy) {
            if (tags != null) {
                clone.tags = new RESTTagCollectionV1();
                tags.cloneInto(clone.tags, deepCopy);
            } else {
                clone.tags = null;
            }

            if (processes != null) {
                clone.processes = new RESTProcessInformationCollectionV1();
                processes.cloneInto(clone.processes, deepCopy);
            } else {
                clone.translatedContentSpecs = null;
            }

            if (translatedContentSpecs != null) {
                clone.translatedContentSpecs = new RESTTranslatedContentSpecCollectionV1();
                translatedContentSpecs.cloneInto(clone.translatedContentSpecs, deepCopy);
            } else {
                clone.processes = null;
            }
        } else {
            clone.tags = tags;
            clone.translatedContentSpecs = translatedContentSpecs;
            clone.processes = processes;
        }
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public Date getLastPublished() {
        return lastPublished;
    }

    public void setLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    public RESTContentSpecTypeV1 getType() {
        return type;
    }

    public void setType(final RESTContentSpecTypeV1 type) {
        this.type = type;
    }

    public RESTTagCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
    }

    public RESTTranslatedContentSpecCollectionV1 getTranslatedContentSpecs() {
        return translatedContentSpecs;
    }

    public void setTranslatedContentSpecs(final RESTTranslatedContentSpecCollectionV1 translatedContentSpecs) {
        this.translatedContentSpecs = translatedContentSpecs;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(final String errors) {
        this.errors = errors;
    }

    public String getFailedContentSpec() {
        return failedContentSpec;
    }

    public void setFailedContentSpec(final String failedContentSpec) {
        this.failedContentSpec = failedContentSpec;
    }

    public RESTProcessInformationCollectionV1 getProcesses() {
        return processes;
    }

    public void setProcesses(final RESTProcessInformationCollectionV1 processes) {
        this.processes = processes;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseContentSpecV1)) return false;

        return super.equals(other);
    }
}
