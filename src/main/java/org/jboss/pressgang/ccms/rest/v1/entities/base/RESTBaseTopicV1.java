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

package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.enums.RESTXMLFormat;

public abstract class RESTBaseTopicV1<T extends RESTBaseTopicV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {
    public static final String TITLE_NAME = "title";
    public static final String XML_NAME = "xml";
    public static final String XML_ERRORS_NAME = "xmlErrors";
    public static final String TAGS_NAME = "tags";
    public static final String OUTGOING_NAME = "outgoingRelationships";
    public static final String INCOMING_NAME = "incomingRelationships";
    public static final String LOCALE_NAME = "locale";
    public static final String SOURCE_URLS_NAME = "sourceUrls_OTM";
    public static final String FORMAT_NAME = "format";

    protected String title = null;
    protected String xml = null;
    protected String xmlErrors = null;
    protected String locale = null;
    protected RESTXMLFormat xmlFormat = null;
    protected RESTTagCollectionV1 tags = null;
    protected RESTTopicSourceUrlCollectionV1 sourceUrls_OTM = null;

    abstract public U getIncomingRelationships();

    abstract public void setIncomingRelationships(final U incomingRelationships);

    abstract public U getOutgoingRelationships();

    abstract public void setOutgoingRelationships(final U outgoingRelationships);

    public void cloneInto(final RESTBaseTopicV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.title = this.title;
        clone.xml = this.xml;
        clone.xmlErrors = this.xmlErrors;
        clone.locale = this.locale;
        clone.xmlFormat = this.xmlFormat;

        if (deepCopy) {
            if (this.tags != null) {
                clone.tags = new RESTTagCollectionV1();
                this.tags.cloneInto(clone.tags, deepCopy);
            } else {
                clone.tags = null;
            }

            if (this.sourceUrls_OTM != null) {
                clone.sourceUrls_OTM = new RESTTopicSourceUrlCollectionV1();
                this.sourceUrls_OTM.cloneInto(clone.sourceUrls_OTM, deepCopy);
            } else {
                clone.sourceUrls_OTM = null;
            }
        } else {
            clone.tags = this.tags;
            clone.sourceUrls_OTM = this.sourceUrls_OTM;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(final String xml) {
        this.xml = xml;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public String getXmlErrors() {
        return xmlErrors;
    }

    public void setXmlErrors(final String xmlErrors) {
        this.xmlErrors = xmlErrors;
    }

    public RESTTagCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
    }

    public void addTag(final RESTTagV1 tag) {
        if (this.tags == null) this.tags = new RESTTagCollectionV1();

        this.tags.addItem(tag);
    }

    public RESTTopicSourceUrlCollectionV1 getSourceUrls_OTM() {
        return sourceUrls_OTM;
    }

    public void setSourceUrls_OTM(final RESTTopicSourceUrlCollectionV1 sourceUrls) {
        this.sourceUrls_OTM = sourceUrls;
    }

    public RESTXMLFormat getXmlFormat() {
        return xmlFormat;
    }

    public void setXmlFormat(final RESTXMLFormat doctype) {
        this.xmlFormat = doctype;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseTopicV1)) return false;

        return super.equals(other);
    }
}
