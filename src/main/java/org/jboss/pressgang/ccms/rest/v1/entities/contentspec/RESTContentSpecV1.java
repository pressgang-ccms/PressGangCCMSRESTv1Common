package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import java.util.Date;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTContentSpecCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTContentSpecCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTAssignedCSMetaDataCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTContentSpecTypeV1;

public class RESTContentSpecV1 extends RESTBaseEntityWithPropertiesV1<RESTContentSpecV1, RESTContentSpecCollectionV1,
        RESTContentSpecCollectionItemV1> {

    public static final String TITLE_NAME = "title";
    public static final String PRODUCT_NAME = "product";
    public static final String VERSION_NAME = "version";
    public static final String LAST_PUBLISHED_NAME = "lastPublished";
    public static final String META_DATA_NAME = "metaData";
    public static final String LOCALE_NAME = "locale";
    public static final String NODES_NAME = "nodes_OTM";
    public static final String TYPE_NAME = "type";
    public static final String TAGS_NAME = "tags";

    private String title = null;
    private String product = null;
    private String version = null;
    private String locale = null;
    private Date lastPublished = null;
    private Date lastModified = null;
    private RESTContentSpecTypeV1 type = null;
    private RESTContentSpecCollectionV1 revisions = null;
    private RESTAssignedCSMetaDataCollectionV1 metaData = null;
    private RESTCSNodeCollectionV1 nodes = null;
    private RESTTagCollectionV1 tags = null;

    @Override
    public RESTContentSpecCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTContentSpecCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTContentSpecV1 clone(boolean deepCopy) {
        final RESTContentSpecV1 retValue = new RESTContentSpecV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTContentSpecV1 clone, boolean deepCopy) {
        this.cloneInto(clone, deepCopy);

        clone.locale = this.locale;
        clone.title = this.title;
        clone.product = this.product;
        clone.version = this.version;
        clone.lastPublished = this.lastPublished == null ? null : (Date) lastPublished.clone();
        clone.lastModified = this.lastModified == null ? null : (Date) lastModified.clone();

        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTContentSpecCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }

            if (this.metaData != null) {
                clone.metaData = new RESTAssignedCSMetaDataCollectionV1();
                this.metaData.cloneInto(clone.metaData, deepCopy);
            }

            if (this.nodes != null) {
                clone.nodes = new RESTCSNodeCollectionV1();
                this.nodes.cloneInto(clone.nodes, deepCopy);
            }

            if (this.tags != null) {
                clone.tags = new RESTTagCollectionV1();
                this.tags.cloneInto(clone.tags, deepCopy);
            }
        } else {
            clone.revisions = this.revisions;
            clone.metaData = this.metaData;
            clone.nodes = this.nodes;
            clone.tags = this.tags;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void explicitSetTitle(final String title) {
        this.title = title;
        this.setParameterToConfigured(TITLE_NAME);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(final String product) {
        this.product = product;
    }

    public void explicitSetProduct(final String product) {
        this.product = product;
        this.setParameterToConfigured(PRODUCT_NAME);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public void explicitSetVersion(final String version) {
        this.version = version;
        this.setParameterToConfigured(VERSION_NAME);
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

    public RESTAssignedCSMetaDataCollectionV1 getMetaData() {
        return metaData;
    }

    public void setMetaData(final RESTAssignedCSMetaDataCollectionV1 metaData) {
        this.metaData = metaData;
    }

    public void explicitSetMetaData(final RESTAssignedCSMetaDataCollectionV1 metaData) {
        this.metaData = metaData;
        this.setParameterToConfigured(META_DATA_NAME);
    }

    public Date getLastPublished() {
        return lastPublished;
    }

    public void setLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
    }

    public void explicitSetLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
        this.setParameterToConfigured(LAST_PUBLISHED_NAME);
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

    public void explicitSetType(final RESTContentSpecTypeV1 type) {
        this.type = type;
        this.setParameterToConfigured(TYPE_NAME);
    }

    public RESTCSNodeCollectionV1 getChildren_OTM() {
        return nodes;
    }

    public void setChildren_OTM(final RESTCSNodeCollectionV1 children) {
        this.nodes = children;
    }

    public void explicitSetChildren_OTM(final RESTCSNodeCollectionV1 children) {
        this.nodes = children;
        this.setParameterToConfigured(NODES_NAME);
    }

    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties) {
        this.properties = properties;
        this.setParameterToConfigured(PROPERTIES_NAME);
    }

    public RESTTagCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
    }

    public void explicitSetTags(final RESTTagCollectionV1 tags) {
        this.tags = tags;
        this.setParameterToConfigured(TAGS_NAME);
    }
}
