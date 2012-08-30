package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterV1;

public class RESTFilterCollectionV1 extends BaseRestCollectionV1<RESTFilterV1, RESTFilterCollectionV1>
{
    private List<RESTFilterV1> items;
    
    @Override
    public List<RESTFilterV1> getItems()
    {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterV1> items)
    {
        this.items = items;
    }

}
