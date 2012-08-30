package org.jboss.pressgangccms.rest.v1.entities;

import org.jboss.pressgangccms.rest.v1.collections.RESTFilterCategoryCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTFilterCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTFilterFieldCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTFilterLocaleCollectionV1;
import org.jboss.pressgangccms.rest.v1.collections.RESTFilterTagCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.base.RESTBaseEntityV1;

public class RESTFilterV1 extends RESTBaseEntityV1<RESTFilterV1, RESTFilterCollectionV1>
{
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String FILTER_TAGS_NAME = "filterTags";
    public static final String FILTER_LOCALES_NAME = "filterLocales";
    public static final String FILTER_CATEGORIES_NAME = "filterCategories";
    public static final String FILTER_FIELDS_NAME = "filterFields";
    
    private String name = null;
    private String description = null;
    private RESTFilterTagCollectionV1 filterTags_OTM = null;
    private RESTFilterLocaleCollectionV1 filterLocales_OTM = null;
    private RESTFilterCategoryCollectionV1 filterCategories_OTM = null;
    private RESTFilterFieldCollectionV1 filterFields_OTM = null;
    
    private RESTFilterCollectionV1 revisions = null;
    
    @Override
    public RESTFilterCollectionV1 getRevisions()
    {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTFilterCollectionV1 revisions)
    {
        this.revisions = revisions;
    }

    @Override
    public RESTFilterV1 clone(boolean deepCopy)
    {
        final RESTFilterV1 retValue = new RESTFilterV1();
        
        this.cloneInto(retValue, deepCopy);
        
        retValue.name = this.name;
        retValue.description = this.description;
        
        if (deepCopy)
        {
            if (this.revisions != null)
            {
                retValue.revisions = new RESTFilterCollectionV1();
                revisions.cloneInto(retValue.revisions, deepCopy);
            }
            
            if (this.filterCategories_OTM != null)
            {
                retValue.filterCategories_OTM = new RESTFilterCategoryCollectionV1();
                filterCategories_OTM.cloneInto(retValue.filterCategories_OTM, deepCopy);
            }
            
            if (this.filterLocales_OTM != null)
            {
                retValue.filterLocales_OTM = new RESTFilterLocaleCollectionV1();
                filterLocales_OTM.cloneInto(retValue.filterLocales_OTM, deepCopy);
            }
            
            if (this.filterTags_OTM != null)
            {
                retValue.filterTags_OTM = new RESTFilterTagCollectionV1();
                filterTags_OTM.cloneInto(retValue.filterTags_OTM, deepCopy);
            }
        }
        else
        {
            retValue.revisions = this.revisions;
            retValue.filterCategories_OTM = this.filterCategories_OTM;
            retValue.filterLocales_OTM = this.filterLocales_OTM;
            retValue.filterTags_OTM = this.filterTags_OTM;
        }
        
        return retValue;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }
    
    public void explicitSetName(final String name)
    {
        this.name = name;
        this.setParameterToConfigured(NAME_NAME);
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(final String description)
    {
        this.description = description;
    }
    
    public void explicitSetDescription(final String description)
    {
        this.description = description;
        this.setParameterToConfigured(DESCRIPTION_NAME);
    }

    public RESTFilterTagCollectionV1 getFilterTags_OTM()
    {
        return filterTags_OTM;
    }

    public void setFilterTags_OTM(final RESTFilterTagCollectionV1 filterTags)
    {
        this.filterTags_OTM = filterTags;
    }
    
    public void explicitSetFilterTags_OTM(final RESTFilterTagCollectionV1 filterTags)
    {
        this.filterTags_OTM = filterTags;
        this.setParameterToConfigured(FILTER_TAGS_NAME);
    }

    public RESTFilterLocaleCollectionV1 getFilterLocales_OTM()
    {
        return filterLocales_OTM;
    }

    public void setFilterLocales_OTM(final RESTFilterLocaleCollectionV1 filterLocales)
    {
        this.filterLocales_OTM = filterLocales;
    }
    
    public void explicitSetFilterLocales_OTM(final RESTFilterLocaleCollectionV1 filterLocales)
    {
        this.filterLocales_OTM = filterLocales;
        this.setParameterToConfigured(FILTER_LOCALES_NAME);
    }

    public RESTFilterCategoryCollectionV1 getFilterCategories_OTM()
    {
        return filterCategories_OTM;
    }

    public void setFilterCategories_OTM(final RESTFilterCategoryCollectionV1 filterCategories)
    {
        this.filterCategories_OTM = filterCategories;
    }
    
    public void explicitSetFilterCategories_OTM(final RESTFilterCategoryCollectionV1 filterCategories)
    {
        this.filterCategories_OTM = filterCategories;
        this.setParameterToConfigured(FILTER_CATEGORIES_NAME);
    }

    public RESTFilterFieldCollectionV1 getFilterFields_OTM()
    {
        return filterFields_OTM;
    }

    public void setFilterFields_OTM(final RESTFilterFieldCollectionV1 filterFields)
    {
        this.filterFields_OTM = filterFields;
    }
    
    public void explicitSetFilterFields_OTM(final RESTFilterFieldCollectionV1 filterFields)
    {
        this.filterFields_OTM = filterFields;
        this.setParameterToConfigured(FILTER_FIELDS_NAME);
    }
}