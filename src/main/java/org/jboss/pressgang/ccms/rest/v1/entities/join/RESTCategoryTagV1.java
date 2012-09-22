package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTCategoryTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTCategoryTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseCategoryV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.ITagToCategoryV1;

public class RESTCategoryTagV1 extends RESTBaseCategoryV1<RESTCategoryTagV1, RESTCategoryTagCollectionV1, RESTCategoryTagCollectionItemV1> implements ITagToCategoryV1
{
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static final String RELATIONSHIP_SORT_NAME = "tagCategorySort";
    
    private Integer relationshipId = null;
    private Integer relationshipSort = null;
    
    /** A list of the Envers revision numbers */
    private RESTCategoryTagCollectionV1 revisions = null;

    public RESTCategoryTagV1()
    {
        
    }
    
    public RESTCategoryTagV1(final RESTCategoryV1 category)
    {
        category.cloneInto(this, false);
    }
    
    @Override
    public RESTCategoryTagCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTCategoryTagCollectionV1 revisions)
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
    public RESTCategoryTagV1 clone(final boolean deepCopy)
    {
        final RESTCategoryTagV1 retValue = new RESTCategoryTagV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTCategoryTagV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);

        clone.relationshipId = this.relationshipId;
        clone.relationshipSort = this.relationshipSort;
        
        if (deepCopy)
        {
            if (this.getRevisions() != null)
            {
                clone.revisions = new RESTCategoryTagCollectionV1();
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
        if (!(other instanceof RESTCategoryTagV1))
            return false;
        
        if (!super.equals(other))
            return false;
        
        final RESTCategoryTagV1 otherCasted = (RESTCategoryTagV1)other;
        
        if (this.relationshipId == null && otherCasted.relationshipId == null)
            return true;
        
        if ((this.relationshipId == null || otherCasted.relationshipId == null))
            return false;
        
        return this.relationshipId.equals(otherCasted.relationshipId);
    }

}
