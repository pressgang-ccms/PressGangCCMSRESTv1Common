package org.jboss.pressgang.ccms.rest.v1.entities.contentspec.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryEntityV1;

public abstract class RESTBaseCSMetaDataV1 <T extends RESTBaseCSMetaDataV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>, V extends RESTBaseCollectionItemV1<T, U, V>> 
        extends RESTBasePrimaryEntityV1<T, U, V> {

    public static final String TITLE_NAME = "title";
    public static final String DESCRIPTION_NAME = "description";

    private String title = null;
    private String description = null;
    
    public void cloneInto(final RESTBaseCSMetaDataV1<?, ?, ?> clone, final boolean deepCopy)
    {
        super.cloneInto(clone, deepCopy);
        
        clone.title = this.title;
        clone.description = this.description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
