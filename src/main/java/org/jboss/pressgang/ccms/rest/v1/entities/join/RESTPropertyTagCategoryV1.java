package org.jboss.pressgang.ccms.rest.v1.entities.join;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTPropertyTagCategoryCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyTagCategoryCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.base.IPropertyTagToPropertyCategoryV1;

public class RESTPropertyTagCategoryV1 extends RESTBasePropertyTagV1<RESTPropertyTagCategoryV1, RESTPropertyTagCategoryCollectionV1, RESTPropertyTagCategoryCollectionItemV1> implements IPropertyTagToPropertyCategoryV1
{
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static final String RELATIONSHIP_SORT_NAME = "propertyTagSort";
    
    private Integer relationshipId = null;
    private Integer relationshipSort = null;
    
    /** A list of the Envers revision numbers */
    private RESTPropertyTagCategoryCollectionV1 revisions = null;

    public RESTPropertyTagCategoryV1()
    {
        
    }
    
    public RESTPropertyTagCategoryV1(final RESTPropertyTagV1 propertyTag)
    {
        propertyTag.cloneInto(this, false);
    }
    
    @Override
    public RESTPropertyTagCategoryCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTPropertyTagCategoryCollectionV1 revisions)
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
    public RESTPropertyTagCategoryV1 clone(final boolean deepCopy)
    {
        final RESTPropertyTagCategoryV1 retValue = new RESTPropertyTagCategoryV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTPropertyTagCategoryV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);

        clone.relationshipId = this.relationshipId;
        clone.relationshipSort = this.relationshipSort;
        
        if (deepCopy)
        {
            if (this.getRevisions() != null)
            {
                clone.revisions = new RESTPropertyTagCategoryCollectionV1();
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
        if (!(other instanceof RESTPropertyTagCategoryV1))
            return false;
        
        if (!super.equals(other))
            return false;
        
        final RESTPropertyTagCategoryV1 otherCasted = (RESTPropertyTagCategoryV1)other;
        
        if (this.relationshipId == null && otherCasted.relationshipId == null)
            return true;
        
        if ((this.relationshipId == null || otherCasted.relationshipId == null))
            return false;
        
        return this.relationshipId.equals(otherCasted.relationshipId);
    }

}