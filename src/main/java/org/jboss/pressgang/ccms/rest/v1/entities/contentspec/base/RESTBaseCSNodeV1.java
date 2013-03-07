package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityWithPropertiesV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.RESTContentSpecV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeTypeV1;

public abstract class RESTBaseCSNodeV1<T extends RESTBaseEntityWithPropertiesV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBaseEntityWithPropertiesV1<T, U, V> {
    public static final String TITLE_NAME = "title";
    public static final String TARGET_ID_NAME = "targetId";
    public static final String NEXT_NODE_NAME = "nextNode";
    public static final String PREVIOUS_NODE_NAME = "previousNode";
    public static final String ENTITY_ID_NAME = "entityId";
    public static final String ENTITY_REVISION_NAME = "entityRevision";
    public static final String CONDITION_NAME = "condition";
    public static final String PARENT_NAME = "parent";
    public static final String RELATED_TO_NAME = "relatedTo";
    public static final String RELATED_FROM_NAME = "relatedFrom";
    public static final String CHILDREN_NAME = "children";
    public static final String NODE_TYPE_NAME = "nodeType";
    public static final String CONTENT_SPEC_NAME = "contentSpec";
    public static final String ADDITIONAL_TEXT_NAME = "additionalText";

    protected Integer nextNodeId = null;
    protected Integer previousNodeId = null;
    protected String title = null;
    protected String targetId = null;
    protected Integer entityId = null;
    protected Integer entityRevision = null;
    protected String condition = null;
    protected String additionalText = null;
    protected RESTContentSpecV1 contentSpec = null;
    protected RESTCSNodeV1 parent = null;
    protected RESTCSNodeTypeV1 nodeType = null;

    public void cloneInto(final RESTBaseCSNodeV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.title = this.title;
        clone.targetId = this.targetId;
        clone.entityId = this.entityId;
        clone.entityRevision = this.entityRevision;
        clone.condition = this.condition;
        clone.nextNodeId = this.nextNodeId;
        clone.previousNodeId = this.previousNodeId;
        clone.additionalText = this.additionalText;
        clone.nodeType = this.nodeType;

        if (deepCopy) {
            if (this.parent != null) {
                clone.parent = this.parent.clone(deepCopy);
            }

            if (this.contentSpec != null) {
                clone.contentSpec = this.contentSpec.clone(deepCopy);
            }
        } else {
            clone.parent = this.parent;
            clone.contentSpec = this.contentSpec;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(final String targetId) {
        this.targetId = targetId;
    }

    public String getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(final String additionalText) {
        this.additionalText = additionalText;
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

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(final Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getEntityRevision() {
        return entityRevision;
    }

    public void setEntityRevision(final Integer entityRevision) {
        this.entityRevision = entityRevision;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
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
}
