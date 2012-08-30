package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterCategoryV1;

public class RESTFilterCategoryCollectionV1 extends BaseRestCollectionV1<RESTFilterCategoryV1, RESTFilterCategoryCollectionV1>
{
    private List<RESTFilterCategoryV1> items;
    
    @Override
    public List<RESTFilterCategoryV1> getItems()
    {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterCategoryV1> items)
    {
        this.items = items;
    }
}
