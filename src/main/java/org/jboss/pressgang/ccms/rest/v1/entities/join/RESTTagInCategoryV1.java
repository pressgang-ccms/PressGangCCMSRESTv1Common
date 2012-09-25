package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTTagInCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagInCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.ITagToCategoryV1;

public class RESTTagInCategoryV1 extends RESTBaseTagV1<RESTTagInCategoryV1, RESTTagInCategoryCollectionV1, RESTTagInCategoryCollectionItemV1> implements ITagToCategoryV1
{
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static final String RELATIONSHIP_SORT_NAME = "tagCategorySort";
    
    private Integer relationshipId = null;
    private Integer relationshipSort = null;
    
    /** A list of the Envers revision numbers */
    private RESTTagInCategoryCollectionV1 revisions = null;
    
    public RESTTagInCategoryV1()
    {
        
    }
    
    public RESTTagInCategoryV1(final RESTTagV1 tag)
    {
        tag.cloneInto(this, false);
    }
    
    @Override
    public RESTTagInCategoryCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTagInCategoryCollectionV1 revisions)
    {
        this.revisions = revisions;
    }
    
    @Override
    public Integer getRelationshipId()
    {
        return relationshipId;
    }

    @Override
    public void setRelationshipId(final Integer relationshipId)
    {
        this.relationshipId = relationshipId;
    }
    
    public void explicitSetRelationshipId(final Integer relationshipId)
    {
        this.relationshipId = relationshipId;
        this.setParameterToConfigured(RELATIONSHIP_ID_NAME);
    }

    @Override
    public Integer getRelationshipSort()
    {
        return relationshipSort;
    }

    @Override
    public void setRelationshipSort(final Integer relationshipSort)
    {
        this.relationshipSort = relationshipSort;
    }
    
    public void explicitSetRelationshipSort(final Integer relationshipSort)
    {
        this.relationshipSort = relationshipSort;
        this.setParameterToConfigured(RELATIONSHIP_SORT_NAME);
    }
    
    @Override
    public RESTTagInCategoryV1 clone(final boolean deepCopy)
    {
        final RESTTagInCategoryV1 retValue = new RESTTagInCategoryV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTTagInCategoryV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);
        
        clone.relationshipId = this.relationshipId;
        clone.relationshipSort = this.relationshipSort;
        
        if (deepCopy)
        {
            if (this.getRevisions() != null)
            {
                clone.revisions = new RESTTagInCategoryCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }           
        }
        else
        {
            clone.revisions = this.revisions;
        }
    }

    @Override
    public boolean equals(final Object other)
    {
        if (other == null)
            return false;
        if (this == other)
            return true;
        if (!(other instanceof RESTTagInCategoryV1))
            return false;
        
        if (!super.equals(other))
            return false;
        
        final RESTTagInCategoryV1 otherCasted = (RESTTagInCategoryV1)other;
        
        if (this.relationshipId == null && otherCasted.relationshipId == null)
            return true;
        
        if ((this.relationshipId == null || otherCasted.relationshipId == null))
            return false;
        
        return this.relationshipId.equals(otherCasted.relationshipId);
    }
}
