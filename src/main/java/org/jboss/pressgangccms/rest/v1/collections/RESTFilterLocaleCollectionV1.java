package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterLocaleV1;

public class RESTFilterLocaleCollectionV1 extends BaseRestCollectionV1<RESTFilterLocaleV1, RESTFilterLocaleCollectionV1>
{
    private List<RESTFilterLocaleV1> items;
    
    @Override
    public List<RESTFilterLocaleV1> getItems()
    {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterLocaleV1> items)
    {
        this.items = items;
    }
}
