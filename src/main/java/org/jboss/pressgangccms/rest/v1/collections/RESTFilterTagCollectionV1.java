package org.jboss.pressgangccms.rest.v1.collections;

import java.util.List;

import org.jboss.pressgangccms.rest.v1.collections.base.BaseRestCollectionV1;
import org.jboss.pressgangccms.rest.v1.entities.RESTFilterTagV1;

public class RESTFilterTagCollectionV1 extends BaseRestCollectionV1<RESTFilterTagV1, RESTFilterTagCollectionV1>
{
    private List<RESTFilterTagV1> items;
    
    @Override
    public List<RESTFilterTagV1> getItems()
    {
        return items;
    }

    @Override
    public void setItems(final List<RESTFilterTagV1> items)
    {
        this.items = items;
    }
}
