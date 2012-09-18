package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseUpdateCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTLanguageImageCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.RESTLanguageImageV1;

/**
 * This is a wrapper class to work around an Errai limitation - https://issues.jboss.org/browse/ERRAI-319
 * @author Matthew Casperson
 *
 */
public class RESTLanguageImageCollectionV1 extends RESTBaseUpdateCollectionV1<RESTLanguageImageV1, RESTLanguageImageCollectionV1, RESTLanguageImageCollectionItemV1>
{
	private List<RESTLanguageImageCollectionItemV1> items;
	
	@Override
	public List<RESTLanguageImageCollectionItemV1> getItems()
	{
		return this.items;
	}
	
	@Override
	public void setItems(final List<RESTLanguageImageCollectionItemV1> items)
	{
		this.items = items;
	}

    @Override
    protected void addItem(final RESTLanguageImageV1 item, final Integer state)
    {
        if (items == null)
        {
            this.items = new ArrayList<RESTLanguageImageCollectionItemV1>();
        }
        
        items.add(new RESTLanguageImageCollectionItemV1(item, state));
    }
}