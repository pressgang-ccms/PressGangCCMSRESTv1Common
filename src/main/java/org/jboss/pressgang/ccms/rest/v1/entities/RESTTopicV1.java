package org.jboss.pressgang.ccms.rest.v1.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTBugzillaBugCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTMinHashCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTopicSourceUrlCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTTranslatedTopicCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTopicCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.enums.RESTXMLDoctype;

public class RESTTopicV1 extends RESTBaseTopicV1<RESTTopicV1, RESTTopicCollectionV1, RESTTopicCollectionItemV1> {
    public static final String DESCRIPTION_NAME = "description";
    public static final String BUGZILLABUGS_NAME = "bugzillaBugs_OTM";
    public static final String TRANSLATEDTOPICS_NAME = "translatedTopics_OTM";
    public static final String CONTENTSPECS_NAME = "contentSpecs_OTM";
    public static final String KEYWORDS_NAME = "keywords";
    public static final String MINHASHES_NAME = "minhashes";

    protected String description = null;
    protected Date created = null;
    protected Date lastModified = null;
    protected RESTBugzillaBugCollectionV1 bugzillaBugs_OTM = null;
    protected RESTTranslatedTopicCollectionV1 translatedTopics_OTM = null;
    protected RESTTopicCollectionV1 outgoingRelationships = null;
    protected RESTTopicCollectionV1 incomingRelationships = null;
    protected RESTContentSpecCollectionV1 contentSpecs_OTM = null;
    protected List<String> keywords = null;
    protected RESTMinHashCollectionV1 minHashes = null;
    protected char[] contentHash = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTTopicCollectionV1 revisions = null;

    @Override
    public RESTTopicCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTopicCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTTopicV1 clone(final boolean deepCopy) {
        final RESTTopicV1 retValue = new RESTTopicV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTTopicV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.description = this.description;
        clone.created = this.created == null ? null : (Date) this.created.clone();
        clone.lastModified = this.lastModified == null ? null : (Date) lastModified.clone();

        if (deepCopy) {
            if (this.bugzillaBugs_OTM != null) {
                clone.bugzillaBugs_OTM = new RESTBugzillaBugCollectionV1();
                this.bugzillaBugs_OTM.cloneInto(clone.bugzillaBugs_OTM, deepCopy);
            } else {
                clone.bugzillaBugs_OTM = null;
            }

            if (this.translatedTopics_OTM != null) {
                clone.translatedTopics_OTM = new RESTTranslatedTopicCollectionV1();
                this.translatedTopics_OTM.cloneInto(clone.translatedTopics_OTM, deepCopy);
            } else {
                clone.translatedTopics_OTM = null;
            }

            if (this.outgoingRelationships != null) {
                clone.outgoingRelationships = new RESTTopicCollectionV1();
                this.outgoingRelationships.cloneInto(clone.outgoingRelationships, deepCopy);
            }  else {
                clone.outgoingRelationships = null;
            }

            if (this.incomingRelationships != null) {
                clone.incomingRelationships = new RESTTopicCollectionV1();
                this.incomingRelationships.cloneInto(clone.incomingRelationships, deepCopy);
            } else {
                clone.incomingRelationships = null;
            }

            if (this.revisions != null) {
                clone.revisions = new RESTTopicCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = null;
            }

            if (this.contentSpecs_OTM != null) {
                clone.contentSpecs_OTM = new RESTContentSpecCollectionV1();
                this.contentSpecs_OTM.cloneInto(clone.contentSpecs_OTM, deepCopy);
            } else {
                clone.contentSpecs_OTM = null;
            }

            if (this.keywords != null) {
                clone.keywords = new ArrayList<String>();
                clone.keywords.addAll(this.keywords);
            } else {
                clone.keywords = null;
            }

            if (this.minHashes != null) {
                clone.minHashes = new RESTMinHashCollectionV1();
                this.minHashes.cloneInto(clone.minHashes, deepCopy);
            } else {
                clone.minHashes = null;
            }
        } else {
            clone.bugzillaBugs_OTM = this.bugzillaBugs_OTM;
            clone.translatedTopics_OTM = this.translatedTopics_OTM;
            clone.outgoingRelationships = this.outgoingRelationships;
            clone.incomingRelationships = this.incomingRelationships;
            clone.revisions = this.revisions;
            clone.contentSpecs_OTM = this.contentSpecs_OTM;
            clone.keywords = this.keywords;
            clone.minHashes = this.minHashes;
        }
    }

    public void explicitSetTitle(final String title) {
        setTitle(title);
        setParameterToConfigured(TITLE_NAME);
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        setTags(tags);
        setParameterToConfigured(TAGS_NAME);
    }

    public void explicitSetSourceUrls_OTM(final RESTTopicSourceUrlCollectionV1 sourceUrls) {
        setSourceUrls_OTM(sourceUrls);
        setParameterToConfigured(SOURCE_URLS_NAME);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void explicitSetDescription(final String description) {
        setDescription(description);
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void explicitSetXml(final String xml) {
        setXml(xml);
        setParameterToConfigured(XML_NAME);
    }

    public void explicitSetLocale(final String locale) {
        setLocale(locale);
        setParameterToConfigured(LOCALE_NAME);
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    public RESTBugzillaBugCollectionV1 getBugzillaBugs_OTM() {
        return bugzillaBugs_OTM;
    }

    public void setBugzillaBugs_OTM(final RESTBugzillaBugCollectionV1 bugzillaBugs) {
        this.bugzillaBugs_OTM = bugzillaBugs;
    }

    public void explicitSetBugzillaBugs_OTM(final RESTBugzillaBugCollectionV1 bugzillaBugs) {
        setBugzillaBugs_OTM(bugzillaBugs);
        setParameterToConfigured(BUGZILLABUGS_NAME);
    }

    public void setLocaleExplicit(final String locale) {
        setLocale(locale);
        setParameterToConfigured(LOCALE_NAME);
    }

    public void explicitSetXmlErrors(final String xmlErrors) {
        setXmlErrors(xmlErrors);
        setParameterToConfigured(XML_ERRORS_NAME);
    }

    public RESTTranslatedTopicCollectionV1 getTranslatedTopics_OTM() {
        return translatedTopics_OTM;
    }

    public void setTranslatedTopics_OTM(final RESTTranslatedTopicCollectionV1 translatedTopics) {
        this.translatedTopics_OTM = translatedTopics;
    }

    public void explicitSetTranslatedTopics_OTM(final RESTTranslatedTopicCollectionV1 translatedTopics) {
        this.translatedTopics_OTM = translatedTopics;
        setParameterToConfigured(TRANSLATEDTOPICS_NAME);
    }

    @Override
    public RESTTopicCollectionV1 getOutgoingRelationships() {
        return outgoingRelationships;
    }

    @Override
    public void setOutgoingRelationships(final RESTTopicCollectionV1 outgoingRelationships) {
        this.outgoingRelationships = outgoingRelationships;
    }

    public void explicitSetOutgoingRelationships(final RESTTopicCollectionV1 outgoingRelationships) {
        setOutgoingRelationships(outgoingRelationships);
        setParameterToConfigured(OUTGOING_NAME);
    }

    @Override
    public RESTTopicCollectionV1 getIncomingRelationships() {
        return incomingRelationships;
    }

    @Override
    public void setIncomingRelationships(final RESTTopicCollectionV1 incomingRelationships) {
        this.incomingRelationships = incomingRelationships;
    }

    public void explicitSetIncomingRelationships(final RESTTopicCollectionV1 incomingRelationships) {
        setIncomingRelationships(incomingRelationships);
        setParameterToConfigured(INCOMING_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        this.setParameterToConfigured(PROPERTIES_NAME);
    }

    public void explicitSetXmlDoctype(final RESTXMLDoctype doctype) {
        this.xmlDoctype = doctype;
        this.setParameterToConfigured(DOCTYPE_NAME);
    }

    public RESTContentSpecCollectionV1 getContentSpecs_OTM() {
        return contentSpecs_OTM;
    }

    public void setContentSpecs_OTM(final RESTContentSpecCollectionV1 contentSpecs_OTM) {
        this.contentSpecs_OTM = contentSpecs_OTM;
    }

    public void explicitSetContentSpecs_OTM(final RESTContentSpecCollectionV1 contentSpecs_OTM) {
        this.contentSpecs_OTM = contentSpecs_OTM;
        this.setParameterToConfigured(CONTENTSPECS_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTopicV1)) return false;

        return super.equals(other);
    }

    /**
     * Keywords are provided by the server. They can not be saved by a client.
     * @return A list of important keywords for this topic
     */
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * This is used by the server to populate the list of keywords sent to the client. It can not be
     * used by the client to persist keywords to the server.
     * @param keywords A list of important keywords for this topic
     */
    public void setKeywords(final List<String> keywords) {
        this.keywords = keywords;
    }

    public RESTMinHashCollectionV1 getMinHashes() {
        return minHashes;
    }

    public void setMinHashes(final RESTMinHashCollectionV1 minHashes) {
        this.minHashes = minHashes;
    }

    public char[] getContentHash() {
        return contentHash;
    }

    public void setContentHash(char[] contentHash) {
        this.contentHash = contentHash;
    }
}
