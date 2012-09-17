package org.jboss.pressgangccms.rest.v1.entities.join;

import org.jboss.pressgangccms.rest.v1.collections.items.RESTAssignedPropertyTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.collections.join.RESTAssignedPropertyTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTPropertyTagV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBasePropertyTagV1;
import org.jboss.pressgangccms.rest.v1.entities.join.base.IJoinPropertyTagV1;

public class RESTAssignedPropertyTagV1 extends RESTBasePropertyTagV1<RESTAssignedPropertyTagV1, RESTAssignedPropertyTagCollectionV1, RESTAssignedPropertyTagCollectionItemV1> implements IJoinPropertyTagV1
{
    public static final String RELATIONSHIP_ID_NAME = "relationshipId";
    public static String VALUE_NAME = "value";
    
    private Integer relationshipId = null;
    private String value = null;
    private boolean valid;
    
    /** A list of the Envers revision numbers */
    private RESTAssignedPropertyTagCollectionV1 revisions = null;
    
    public RESTAssignedPropertyTagV1()
    {
        
    }
    
    public RESTAssignedPropertyTagV1(final RESTPropertyTagV1 propertyTag)
    {
        propertyTag.cloneInto(this, false);
    }
    
    @Override
    public RESTAssignedPropertyTagCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTAssignedPropertyTagCollectionV1 revisions)
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
    public String getValue()
    {
        return value;
    }

    @Override
    public void setValue(final String value)
    {
        this.value = value;
    }
    
    public void explicitSetValue(final String value)
    {
        this.value = value;
        this.setParameterToConfigured(VALUE_NAME);
    }

    @Override
    public boolean getValid()
    {
        return valid;
    }

    @Override
    public void setValid(final boolean valid)
    {
        this.valid = valid;
    }
    
    @Override
    public RESTAssignedPropertyTagV1 clone(final boolean deepCopy)
    {
        final RESTAssignedPropertyTagV1 retValue = new RESTAssignedPropertyTagV1();

        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTAssignedPropertyTagV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);
        
        clone.relationshipId = this.relationshipId;
        clone.value = this.value;
        clone.valid = this.valid;
        
        if (deepCopy)
        {
            if (this.getRevisions() != null)
            {
                clone.revisions = new RESTAssignedPropertyTagCollectionV1();
                this.revisions.cloneInto(clone.revisions, deepCopy);
            }           
        }
        else
        {
            clone.revisions = this.revisions;
        }
    }

}
