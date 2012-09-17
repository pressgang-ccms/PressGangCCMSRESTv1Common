package org.jboss.pressgangccms.rest.v1.entities.join;

import org.jboss.pressgangccms.rest.v1.collections.items.RESTCategoryTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.join.RESTCategoryTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTCategoryV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseCategoryV1;
import org.jboss.pressgangccms.rest.v1.entities.join.base.ITagToCategoryV1;

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
        
        retValue.relationshipId = this.relationshipId;
        retValue.relationshipSort = this.relationshipSort;
        
        if (deepCopy)
        {
            if (this.getRevisions() != null)
            {
                retValue.revisions = new RESTCategoryTagCollectionV1();
                this.revisions.cloneInto(retValue.revisions, deepCopy);
            }           
        }
        else
        {
            retValue.revisions = this.revisions;
        }
        
        return retValue;
    }

}
