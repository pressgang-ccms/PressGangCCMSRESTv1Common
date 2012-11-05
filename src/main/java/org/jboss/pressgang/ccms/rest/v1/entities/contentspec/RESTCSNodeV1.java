package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.join.RESTCSRelatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base.RESTBaseCSNodeV1;
import org.jboss.pressgang.ccms.rest.v1.entities.contentspec.enums.RESTCSNodeTypeV1;

public class RESTCSNodeV1 extends RESTBaseCSNodeV1<RESTCSNodeV1, RESTCSNodeCollectionV1, RESTCSNodeCollectionItemV1> {
    
    private RESTCSNodeCollectionV1 revisions = null;
    
    @Override
    public RESTCSNodeCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(RESTCSNodeCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSNodeV1 clone(boolean deepCopy) {
        final RESTCSNodeV1 retValue = new RESTCSNodeV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTCSNodeV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);
        
        if (deepCopy) {
            if (this.revisions != null) {
                clone.revisions = new RESTCSNodeCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }
        }
        else
        {
            clone.revisions = this.revisions;
        }
    }

    public void explicitSetTitle(final String title) {
        this.title = title;
        this.setParameterToConfigured(TITLE_NAME);
    }
    
    public void explicitSetContentSpec(final RESTContentSpecV1 contentSpec) {
        this.contentSpec = contentSpec;
        this.setParameterToConfigured(CONTENT_SPEC_NAME);
    }
    
    public void explicitSetParent(final RESTCSNodeV1 parent) {
        this.parent = parent;
        this.setParameterToConfigured(PARENT_NAME);
    }

    public void explicitSetNodeType(final RESTCSNodeTypeV1 nodeType) {
        this.nodeType = nodeType;
        this.setParameterToConfigured(NODE_TYPE_NAME);
    }
    
    public void explicitSetTopicId(final Integer topicId) {
        this.topicId = topicId;
        this.setParameterToConfigured(TOPIC_ID_NAME);
    }
    
    public void explicitSetTopicRevision(final Integer topicRevision) {
        this.topicRevision = topicRevision;
        this.setParameterToConfigured(TOPIC_REVISION_NAME);
    }
    
    public void explicitSetFlag(final Integer flag) {
        this.flag = flag;
        this.setParameterToConfigured(FLAG_NAME);
    }

    public void explicitSetCondition(final String condition) {
        this.condition = condition;
        this.setParameterToConfigured(CONDITION_NAME);
    }
    
    public void explicitSetRelatedToNodes(final RESTCSRelatedNodeCollectionV1 relatedToNodes) {
        this.relatedToNodes = relatedToNodes;
        this.setParameterToConfigured(RELATED_TO_NAME);
    }

    public void explicitSetRelatedFromNodes(final RESTCSRelatedNodeCollectionV1 relatedFromNodes) {
        this.relatedFromNodes = relatedFromNodes;
        this.setParameterToConfigured(RELATED_FROM_NAME);
    }
    
    public void explicitSetNextNodeId(final Integer nextNodeId) {
        this.nextNodeId = nextNodeId;
        this.setParameterToConfigured(NEXT_NODE_NAME);
    }

    public void explicitSetPreviousNodeId(final Integer previousNodeId) {
        this.previousNodeId = previousNodeId;
        this.setParameterToConfigured(PREVIOUS_NODE_NAME);
    }
    
    public void explicitSetChildren_OTM(final RESTCSNodeCollectionV1 children) {
        this.children = children;
        this.setParameterToConfigured(CHILDREN_NAME);
    }
    
    public void explicitSetTranslatedStrings_OTM(final RESTCSTranslatedStringCollectionV1 translatedStrings) {
        this.translatedStrings = translatedStrings;
        this.setParameterToConfigured(TRANSLATED_STRINGS_NAME);
    }
    
    public void explicitSetProperties(final RESTAssignedPropertyTagCollectionV1 properties)
    {
        this.properties = properties;
        this.setParameterToConfigured(PROPERTIES_NAME);
    }
}
