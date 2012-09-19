package org.jboss.pressgang.ccms.rest.v1.collections;

import java.util.ArrayList;

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
    @Override
    protected void addItem(final RESTLanguageImageV1 item, final Integer state)
    {
        if (getItems() == null)
        {
            setItems(new ArrayList<RESTLanguageImageCollectionItemV1>());
        }
        
        getItems().add(new RESTLanguageImageCollectionItemV1(item, state));
    }
}
