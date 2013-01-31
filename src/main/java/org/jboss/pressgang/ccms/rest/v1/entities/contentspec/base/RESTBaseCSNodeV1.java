package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeTypeV1;

public abstract class RESTBaseCSNodeV1<T extends RESTBaseEntityWithPropertiesV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {
    public static final String TITLE_NAME = "title";
    public static final String NEXT_NODE_NAME = "nextNode";
    public static final String PREVIOUS_NODE_NAME = "previousNode";
    public static final String TOPIC_ID_NAME = "topicId";
    public static final String TOPIC_REVISION_NAME = "topicRevision";
    public static final String FLAG_NAME = "flag";
    public static final String CONDITION_NAME = "condition";
    public static final String PARENT_NAME = "parent";
    public static final String RELATED_TO_NAME = "relatedTo";
    public static final String RELATED_FROM_NAME = "relatedFrom";
    public static final String CHILDREN_NAME = "children";
    public static final String NODE_TYPE_NAME = "nodeType";
    public static final String TRANSLATED_STRINGS_NAME = "translatedStrings";
    public static final String CONTENT_SPEC_NAME = "contentSpec";
    public static final String ALTERNATE_TITLE_NAME = "alternateTitle";

    protected Integer nextNodeId = null;
    protected Integer previousNodeId = null;
    protected String title = null;
    protected Integer topicId = null;
    protected Integer topicRevision = null;
    protected Integer flag = null;
    protected String condition = null;
    protected String alternateTitle = null;
    protected RESTContentSpecV1 contentSpec = null;
    protected RESTCSNodeV1 parent = null;
    protected RESTCSNodeTypeV1 nodeType = null;
    protected RESTCSRelatedNodeCollectionV1 relatedToNodes = null;
    protected RESTCSRelatedNodeCollectionV1 relatedFromNodes = null;
    protected RESTCSNodeCollectionV1 children = null;
    protected RESTCSTranslatedStringCollectionV1 translatedStrings = null;

    public void cloneInto(final RESTBaseCSNodeV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.title = this.title;
        clone.topicId = this.topicId;
        clone.topicRevision = this.topicRevision;
        clone.flag = this.flag;
        clone.condition = this.condition;
        clone.nextNodeId = this.nextNodeId;
        clone.previousNodeId = this.previousNodeId;
        clone.alternateTitle = this.alternateTitle;

        if (deepCopy) {
            if (this.parent != null) {
                clone.parent = this.parent.clone(deepCopy);
            }

            if (this.contentSpec != null) {
                clone.contentSpec = this.contentSpec.clone(deepCopy);
            }

            if (this.translatedStrings != null) {
                clone.translatedStrings = new RESTCSTranslatedStringCollectionV1();
                this.translatedStrings.cloneInto(clone.translatedStrings, deepCopy);
            }
        } else {
            clone.parent = this.parent;
            clone.contentSpec = this.contentSpec;
            clone.translatedStrings = this.translatedStrings;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getAlternateTitle() {
        return alternateTitle;
    }

    public void setAlternateTitle(final String alternateTitle) {
        this.alternateTitle = alternateTitle;
    }

    public RESTContentSpecV1 getContentSpec() {
        return contentSpec;
    }

    public void setContentSpec(final RESTContentSpecV1 contentSpec) {
        this.contentSpec = contentSpec;
    }

    public RESTCSNodeV1 getParent() {
        return parent;
    }

    public void setParent(final RESTCSNodeV1 parent) {
        this.parent = parent;
    }

    public RESTCSNodeTypeV1 getNodeType() {
        return nodeType;
    }

    public void setNodeType(final RESTCSNodeTypeV1 nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(final Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getTopicRevision() {
        return topicRevision;
    }

    public void setTopicRevision(final Integer topicRevision) {
        this.topicRevision = topicRevision;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    public RESTCSRelatedNodeCollectionV1 getRelatedToNodes() {
        return relatedToNodes;
    }

    public void setRelatedToNodes(final RESTCSRelatedNodeCollectionV1 relatedToNodes) {
        this.relatedToNodes = relatedToNodes;
    }

    public RESTCSRelatedNodeCollectionV1 getRelatedFromNodes() {
        return relatedFromNodes;
    }

    public void setRelatedFromNodes(final RESTCSRelatedNodeCollectionV1 relatedFromNodes) {
        this.relatedFromNodes = relatedFromNodes;
    }

    public Integer getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(final Integer nextNodeId) {
        this.nextNodeId = nextNodeId;
    }

    public Integer getPreviousNodeId() {
        return previousNodeId;
    }

    public void setPreviousNodeId(final Integer previousNodeId) {
        this.previousNodeId = previousNodeId;
    }

    public RESTCSNodeCollectionV1 getChildren_OTM() {
        return children;
    }

    public void setChildren_OTM(final RESTCSNodeCollectionV1 children) {
        this.children = children;
    }

    public RESTCSTranslatedStringCollectionV1 getTranslatedStrings_OTM() {
        return translatedStrings;
    }

    public void setTranslatedStrings_OTM(final RESTCSTranslatedStringCollectionV1 translatedStrings) {
        this.translatedStrings = translatedStrings;
    }
}
