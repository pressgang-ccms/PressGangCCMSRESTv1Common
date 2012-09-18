package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTTagCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.ITagToCategoryV1;

public class RESTTagCategoryV1 extends RESTBaseTagV1<RESTTagCategoryV1, RESTTagCategoryCollectionV1, RESTTagCategoryCollectionItemV1> implements ITagToCategoryV1
{
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static final String RELATIONSHIP_SORT_NAME = "tagCategorySort";
    
    private Integer relationshipId = null;
    private Integer relationshipSort = null;
    
    /** A list of the Envers revision numbers */
    private RESTTagCategoryCollectionV1 revisions = null;
    
    public RESTTagCategoryV1()
    {
        
    }
    
    public RESTTagCategoryV1(final RESTTagV1 tag)
    {
        tag.cloneInto(this, false);
    }
    
    @Override
    public RESTTagCategoryCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTTagCategoryCollectionV1 revisions)
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
    public RESTTagCategoryV1 clone(final boolean deepCopy)
    {
        final RESTTagCategoryV1 retValue = new RESTTagCategoryV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTTagCategoryV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);
        
        clone.relationshipId = this.relationshipId;
        clone.relationshipSort = this.relationshipSort;
        
        if (deepCopy)
        {
            if (this.getRevisions() != null)
            {
                clone.revisions = new RESTTagCategoryCollectionV1();
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
        if (!(other instanceof RESTTagCategoryV1))
            return false;
        
        if (!super.equals(other))
            return false;
        
        final RESTTagCategoryV1 otherCasted = (RESTTagCategoryV1)other;
        
        if (this.relationshipSort == null && otherCasted.relationshipSort == null)
            return true;
        
        if (this.relationshipSort == null || otherCasted.relationshipSort == null)
            return false;
        
        return this.relationshipSort.equals(otherCasted.relationshipSort);
    }
}
