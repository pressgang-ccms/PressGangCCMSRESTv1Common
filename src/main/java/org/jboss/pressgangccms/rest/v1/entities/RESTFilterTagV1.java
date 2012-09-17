package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTFilterTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.items.RESTFilterTagCollectionItemV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterTagV1 extends RESTBaseEntityV1<RESTFilterTagV1, RESTFilterTagCollectionV1, RESTFilterTagCollectionItemV1>
{
    public static final String TAG_NAME = "tag";
    public static final String STATE_NAME = "state";
    public static final String FILTER_NAME = "filter";
    
    private RESTTagV1 tag = null;
    private Integer state = null;
    private RESTFilterV1 filter = null;
    
    private RESTFilterTagCollectionV1 revisions = null;
    
    @Override
    public RESTFilterTagCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterTagCollectionV1 revisions)
    {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterTagV1 clone(boolean deepCopy)
    {
        final RESTFilterTagV1 retValue = new RESTFilterTagV1();
        
        this.cloneInto(retValue, deepCopy);
        
        return retValue;
    }
    
    public void cloneInto(final RESTFilterTagV1 clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);

        clone.state = this.state;
        
        if (deepCopy)
        {
            if (this.revisions != null)
            {
                clone.revisions = new RESTFilterTagCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
            
            if (tag != null)
            {
                clone.tag = tag.clone(deepCopy);
            }
            
            if (this.filter != null)
            {
                clone.filter = this.filter.clone(deepCopy);
            }
        }
        else
        {
            clone.revisions = this.revisions;
            clone.tag = this.tag;
            clone.filter = this.filter;
        }
    }
    
    public RESTTagV1 getTag()
    {
        return tag;
    }

    public void setTag(final RESTTagV1 tag)
    {
        this.tag = tag;
    }
    
    public void explicitSetTag(final RESTTagV1 tag)
    {
        this.tag = tag;
        this.setParameterToConfigured(TAG_NAME);
    }

    public Integer getState()
    {
        return state;
    }

    public void setState(final Integer state)
    {
        this.state = state;
    }
    
    public void explicitSetState(final Integer state)
    {
        this.state = state;
        this.setParameterToConfigured(STATE_NAME);
    }
    
    public RESTFilterV1 getFilter()
    {
        return filter;
    }

    public void setFilter(final RESTFilterV1 filter)
    {
        this.filter = filter;
    }
}
