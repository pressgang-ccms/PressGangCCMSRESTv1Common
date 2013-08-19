package org.jboss.pressgang.ccms.rest.v1.entities.base;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.join.RESTTagInCategoryCollectionV1;

public abstract class RESTBaseCategoryV1<T extends RESTBaseCategoryV1<T, U, V>, U extends RESTBaseCollectionV1<T, U, V>,
        V extends RESTBaseCollectionItemV1<T, U, V>> extends RESTBasePrimaryEntityV1<T, U, V> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String MUTUALLYEXCLUSIVE_NAME = "mutuallyExclusive";
    public static final String SORT_NAME = "sort";
    public static final String TAGS_NAME = "tags";

    protected String name = null;
    protected String description = null;
    protected boolean mutuallyExclusive = false;
    protected Integer sort = null;
    protected RESTTagInCategoryCollectionV1 tags = null;

    public void cloneInto(final RESTBaseCategoryV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.description = description;
        clone.mutuallyExclusive = mutuallyExclusive;
        clone.sort = sort == null ? null : sort;

        if (deepCopy) {
            if (tags != null) {
                clone.tags = new RESTTagInCategoryCollectionV1();
                tags.cloneInto(clone.tags, deepCopy);
            }
        } else {
            clone.tags = tags;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    public void setMutuallyExclusive(final boolean mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(final Integer sort) {
        this.sort = sort;
    }

    public RESTTagInCategoryCollectionV1 getTags() {
        return tags;
    }

    public void setTags(final RESTTagInCategoryCollectionV1 tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseCategoryV1)) return false;

        return super.equals(other);
    }
}
