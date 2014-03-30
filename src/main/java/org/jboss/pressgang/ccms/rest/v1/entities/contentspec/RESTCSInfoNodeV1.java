package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSInfoNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSInfoNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTCSInfoNodeV1 extends RESTBaseEntityV1<RESTCSInfoNodeV1, RESTCSInfoNodeCollectionV1, RESTCSInfoNodeCollectionItemV1> {
    public static final String TOPIC_ID_NAME = "topicId";
    public static final String TOPIC_REVISION_NAME = "topicRevision";
    public static final String CONDITION_NAME = "condition";
    public static final String INHERITED_CONDITION_NAME = "inheritedCondition";
    public static final String NODE_NAME = "csNode";
    public static final String TOPIC_NAME = "topic";

    protected Integer topicId = null;
    protected Integer topicRevision = null;
    protected String condition = null;
    protected String inheritedCondition = null;
    protected RESTCSNodeV1 csNode = null;
    protected RESTTopicV1 topic = null;
    protected RESTCSInfoNodeCollectionV1 revisions = null;

    @Override
    public RESTCSInfoNodeV1 clone(boolean deepCopy) {
        final RESTCSInfoNodeV1 retValue = new RESTCSInfoNodeV1();
        cloneInto(retValue);
        return retValue;
    }

    public void cloneInto(final RESTCSInfoNodeV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.topicId = topicId;
        clone.topicRevision = topicRevision;
        clone.condition = condition;
        clone.inheritedCondition = inheritedCondition;

        if (deepCopy) {
            if (csNode != null) {
                clone.csNode = csNode.clone(deepCopy);
            } else {
                clone.csNode = null;
            }

            if (topic != null) {
                clone.topic = topic.clone(deepCopy);
            } else {
                clone.topic = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTCSInfoNodeCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            } else {
                clone.revisions = revisions;
            }
        } else {
            clone.csNode = csNode;
            clone.topic = topic;
            clone.revisions = revisions;
        }
    }

    public RESTCSNodeV1 getCSNode() {
        return csNode;
    }

    public void setCSNode(final RESTCSNodeV1 csNode) {
        this.csNode = csNode;
    }

    public RESTTopicV1 getTopic() {
        return topic;
    }

    public void setTopic(final RESTTopicV1 topic) {
        this.topic = topic;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(final Integer topicId) {
        this.topicId = topicId;
    }

    public void explicitSetTopicId(final Integer topicId) {
        this.topicId = topicId;
        setParameterToConfigured(TOPIC_ID_NAME);
    }

    public Integer getTopicRevision() {
        return topicRevision;
    }

    public void setTopicRevision(final Integer topicRevision) {
        this.topicRevision = topicRevision;
    }

    public void explicitSetTopicRevision(final Integer topicRevision) {
        this.topicRevision = topicRevision;
        setParameterToConfigured(TOPIC_REVISION_NAME);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    public void explicitSetCondition(final String condition) {
        this.condition = condition;
        setParameterToConfigured(CONDITION_NAME);
    }

    public String getInheritedCondition() {
        return inheritedCondition;
    }

    public void setInheritedCondition(String inheritedCondition) {
        this.inheritedCondition = inheritedCondition;
    }

    @Override
    public RESTCSInfoNodeCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTCSInfoNodeCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCSInfoNodeV1)) return false;

        return super.equals(other);
    }
}
