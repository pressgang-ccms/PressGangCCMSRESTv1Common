package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.enums.RESTXMLDoctype;

public abstract class RESTBaseTopicV1<T extends RESTBaseTopicV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {
    public static final String TITLE_NAME = "title";
    public static final String XML_NAME = "xml";
    public static final String XML_ERRORS_NAME = "xmlErrors";
    public static final String HTML_NAME = "html";
    public static final String TAGS_NAME = "tags";
    public static final String OUTGOING_NAME = "outgoingRelationships";
    public static final String INCOMING_NAME = "incomingRelationships";
    public static final String LOCALE_NAME = "locale";
    public static final String SOURCE_URLS_NAME = "sourceUrls_OTM";
    public static final String DOCTYPE_NAME = "doctype";

    protected String title = null;
    protected String xml = null;
    protected String xmlErrors = null;
    protected String html = null;
    protected String locale = null;
    protected RESTXMLDoctype xmlDoctype = null;
    protected RESTTagCollectionV1 tags = null;
    protected RESTTopicSourceUrlCollectionV1 sourceUrls_OTM = null;

    public abstract U getIncomingRelationships();

    public abstract void setIncomingRelationships(final U incomingRelationships);

    public abstract U getOutgoingRelationships();

    public abstract void setOutgoingRelationships(final U outgoingRelationships);

    public void cloneInto(final RESTBaseTopicV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.title = title;
        clone.xml = xml;
        clone.xmlErrors = xmlErrors;
        clone.html = html;
        clone.locale = locale;
        clone.xmlDoctype = xmlDoctype;

        if (deepCopy) {
            if (tags != null) {
                clone.tags = new RESTTagCollectionV1();
                tags.cloneInto(clone.tags, deepCopy);
            }

            if (sourceUrls_OTM != null) {
                clone.sourceUrls_OTM = new RESTTopicSourceUrlCollectionV1();
                sourceUrls_OTM.cloneInto(clone.sourceUrls_OTM, deepCopy);
            }
        } else {
            clone.tags = tags;
            clone.sourceUrls_OTM = sourceUrls_OTM;
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

    public String getHtml() {
        return html;
    }

    public void setHtml(final String html) {
        this.html = html;
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
        if (tags == null) tags = new RESTTagCollectionV1();

        tags.addItem(tag);
    }

    public RESTTopicSourceUrlCollectionV1 getSourceUrls_OTM() {
        return sourceUrls_OTM;
    }

    public void setSourceUrls_OTM(final RESTTopicSourceUrlCollectionV1 sourceUrls) {
        sourceUrls_OTM = sourceUrls;
    }

    public RESTXMLDoctype getXmlDoctype() {
        return xmlDoctype;
    }

    public void setXmlDoctype(final RESTXMLDoctype doctype) {
        xmlDoctype = doctype;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseTopicV1)) return false;

        return super.equals(other);
    }
}
