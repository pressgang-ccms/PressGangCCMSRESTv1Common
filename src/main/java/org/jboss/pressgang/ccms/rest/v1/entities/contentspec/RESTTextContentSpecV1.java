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

package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTTextContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTTextContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLocaleV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseContentSpecV1;

public class RESTTextContentSpecV1 extends RESTBaseContentSpecV1<RESTTextContentSpecV1, RESTTextContentSpecCollectionV1,
        RESTTextContentSpecCollectionItemV1> {
    public static final String TEXT_NAME = "text";

    private String title = null;
    private String product = null;
    private String version = null;
    private String text = null;
    private RESTTextCSProcessingOptionsV1 processingOptions = null;
    private RESTTextContentSpecCollectionV1 revisions = null;

    @Override
    public RESTTextContentSpecCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTextContentSpecCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTextContentSpecV1 clone(final boolean deepCopy) {
        final RESTTextContentSpecV1 retValue = new RESTTextContentSpecV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTextContentSpecV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.title = title;
        clone.product = product;
        clone.version = version;
        clone.text = text;

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTTextContentSpecCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }

            if (processingOptions != null) {
                clone.processingOptions = processingOptions.clone(deepCopy);
            } else {
                clone.processingOptions = null;
            }
        } else {
            clone.revisions = revisions;
            clone.processingOptions = processingOptions;
        }
    }

    public void explicitSetLocale(final RESTLocaleV1 locale) {
        this.locale = locale;
        setParameterToConfigured(LOCALE_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        setParameterToConfigured(PROPERTIES_NAME);
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
        setParameterToConfigured(TAGS_NAME);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void explicitSetText(String text) {
        this.text = text;
        setParameterToConfigured(TEXT_NAME);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void explicitSetTranslationDetails(RESTCSTranslationDetailV1 translationDetails) {
        this.translationDetails = translationDetails;
        setParameterToConfigured(TRANSLATION_DETAILS_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTextContentSpecV1)) return false;

        return super.equals(other);
    }

    public RESTTextCSProcessingOptionsV1 getProcessingOptions() {
        return processingOptions;
    }

    public void setProcessingOptions(RESTTextCSProcessingOptionsV1 processingOptions) {
        this.processingOptions = processingOptions;
    }
}
