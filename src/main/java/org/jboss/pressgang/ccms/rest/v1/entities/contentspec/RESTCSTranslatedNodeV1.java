package org.jboss.pressgang.ccms.rest.v1.entities.contentspec;

import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedNodeCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.RESTCSTranslatedNodeStringCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.contentspec.items.RESTCSTranslatedNodeCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public class RESTCSTranslatedNodeV1 extends RESTBasePrimaryEntityV1<RESTCSTranslatedNodeV1, RESTCSTranslatedNodeCollectionV1,
        RESTCSTranslatedNodeCollectionItemV1> {
    public static final String NODE_ID_NAME = "nodeId";
    public static final String NODE_REVISION_NAME = "nodeRevision";
    public static final String NODE_NAME = "node";
    public static final String TRANSLATED_STRING_NAME = "translatedNodeStrings_OTM";

    private Integer nodeId = null;
    private Integer nodeRevision = null;
    private RESTCSNodeV1 node = null;
    private RESTCSTranslatedNodeCollectionV1 children = null;
    private RESTCSTranslatedNodeStringCollectionV1 translatedNodeStrings_OTM;
    /**
     * A list of the Envers revision numbers
     */
    private RESTCSTranslatedNodeCollectionV1 revisions = null;

    @Override
    public RESTCSTranslatedNodeCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTCSTranslatedNodeCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTCSTranslatedNodeV1 clone(final boolean deepCopy) {
        final RESTCSTranslatedNodeV1 retValue = new RESTCSTranslatedNodeV1();

        this.cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTCSTranslatedNodeV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.nodeId = nodeId;
        clone.nodeRevision = nodeRevision;

        if (deepCopy) {
            if (children != null) {
                clone.children = new RESTCSTranslatedNodeCollectionV1();
                children.cloneInto(clone.children, deepCopy);
            }

            if (translatedNodeStrings_OTM != null) {
                clone.translatedNodeStrings_OTM = new RESTCSTranslatedNodeStringCollectionV1();
                translatedNodeStrings_OTM.cloneInto(clone.translatedNodeStrings_OTM, deepCopy);
            }

            if (node != null) {
                clone.node = node.clone(deepCopy);
            }

            if (revisions != null) {
                clone.revisions = new RESTCSTranslatedNodeCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.children = children;
            clone.translatedNodeStrings_OTM = translatedNodeStrings_OTM;
            clone.node = node;
            clone.revisions = revisions;
        }
    }

    public RESTCSTranslatedNodeStringCollectionV1 getTranslatedNodeStrings_OTM() {
        return translatedNodeStrings_OTM;
    }

    public void setTranslatedNodeStrings_OTM(final RESTCSTranslatedNodeStringCollectionV1 translatedNodeStrings) {
        this.translatedNodeStrings_OTM = translatedNodeStrings;
    }

    public void explicitSetTranslatedNodeString_OTM(final RESTCSTranslatedNodeStringCollectionV1 translatedNodeStrings) {
        this.translatedNodeStrings_OTM = translatedNodeStrings;
        this.setParameterToConfigured(TRANSLATED_STRING_NAME);
    }

    public RESTCSTranslatedNodeCollectionV1 getChildren_OTM() {
        return children;
    }

    public void setChildren_OTM(final RESTCSTranslatedNodeCollectionV1 children) {
        this.children = children;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(final Integer nodeId) {
        this.nodeId = nodeId;
    }

    public void explicitSetNodeId(final Integer nodeId) {
        this.nodeId = nodeId;
        this.setParameterToConfigured(NODE_ID_NAME);
    }

    public Integer getNodeRevision() {
        return nodeRevision;
    }

    public void setNodeRevision(final Integer nodeRevision) {
        this.nodeRevision = nodeRevision;
    }

    public void explicitSetNodeRevision(final Integer nodeRevision) {
        this.nodeRevision = nodeRevision;
        this.setParameterToConfigured(NODE_REVISION_NAME);
    }

    public RESTCSNodeV1 getNode() {
        return node;
    }

    public void setNode(final RESTCSNodeV1 node) {
        this.node = node;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTCSTranslatedNodeV1)) return false;

        return super.equals(other);
    }

}
