package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterFieldV1;

public class RESTFilterFieldCollectionV1 extends BaseRestCollectionV1<RESTFilterFieldV1, RESTFilterFieldCollectionV1>
{
    private List<RESTFilterFieldV1> items;
    
    @Override
    public List<RESTFilterFieldV1> getItems()
    {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterFieldV1> items)
    {
        this.items = items;
    }

}
