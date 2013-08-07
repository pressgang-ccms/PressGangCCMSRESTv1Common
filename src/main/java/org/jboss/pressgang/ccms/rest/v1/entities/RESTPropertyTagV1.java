package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTPropertyTagCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTPropertyCategoryInPropertyTagCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTAssignedPropertyTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTPropertyTagInPropertyCategoryV1;

public class RESTPropertyTagV1 extends RESTBasePropertyTagV1<RESTPropertyTagV1, RESTPropertyTagCollectionV1,
        RESTPropertyTagCollectionItemV1> {
    /**
     * A list of the Envers revision numbers
     */
    private RESTPropertyTagCollectionV1 revisions = null;

    public RESTPropertyTagV1() {

    }

    public RESTPropertyTagV1(final RESTAssignedPropertyTagV1 assignedPropertyTag) {
        if (assignedPropertyTag != null) {
            assignedPropertyTag.cloneInto(this, false);
        }
    }

    public RESTPropertyTagV1(final RESTPropertyTagInPropertyCategoryV1 propertyTagWithSort) {
        if (propertyTagWithSort != null) {
            propertyTagWithSort.cloneInto(this, false);
        }
    }

    @Override
    public RESTPropertyTagCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTPropertyTagCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTPropertyTagV1 clone(boolean deepCopy) {
        final RESTPropertyTagV1 retValue = new RESTPropertyTagV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTPropertyTagV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        if (deepCopy) {
            if (revisions != null) {
                clone.revisions = new RESTPropertyTagCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }
        } else {
            clone.revisions = revisions;
        }
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public void explicitSetIsUnique(boolean isUnique) {
        this.isUnique = isUnique;
        setParameterToConfigured(ISUNIQUE_NAME);
    }

    public void explicitSetCanBeNull(final boolean canBeNull) {
        this.canBeNull = canBeNull;
        setParameterToConfigured(CANBENULL_NAME);
    }

    public void explicitSetRegex(final String regex) {
        this.regex = regex;
        setParameterToConfigured(REGEX_NAME);
    }

    public void explicitSetName(final String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTPropertyTagV1)) return false;

        return super.equals(other);
    }

    public void explicitSetPropertyCategories(final RESTPropertyCategoryInPropertyTagCollectionV1 propertyTagCategories) {
        propertyCategories = propertyTagCategories;
        setParameterToConfigured(PROPERTY_CATEGORIES_NAME);
    }
}
