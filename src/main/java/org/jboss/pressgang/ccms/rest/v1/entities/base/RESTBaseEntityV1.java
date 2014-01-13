package org.jboss.pressgang.ccms.rest.v1.entities.base;

import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.collections.base.RESTBaseEntityCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.elements.base.RESTBaseElementWithConfiguredParametersV1;


public abstract class RESTBaseEntityV1<T extends RESTBaseEntityV1<T, U, V>, U extends RESTBaseEntityCollectionV1<T, U, V>,
        V extends RESTBaseEntityCollectionItemV1<T, U, V>> extends RESTBaseElementWithConfiguredParametersV1<T> {
    public static final String REVISIONS_NAME = "revisions";
    public static final String LOG_DETAILS_NAME = "logDetails";

    /**
     * The id of the entity
     */
    private Integer id = null;
    /**
     * The revision of the entity
     */
    private Integer revision = null;
    /**
     * The names of collections that can be expanded
     */
    private List<String> expand = null;
    private RESTLogDetailsV1 logDetails = null;

    public abstract U getRevisions();

    public abstract void setRevisions(U revisions);

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseEntityV1)) return false;

        @SuppressWarnings("rawtypes")
        final RESTBaseEntityV1 otherCasted = (RESTBaseEntityV1) other;

        if (id == null && otherCasted.id == null) {
            if (revision == null && otherCasted.revision == null) return super.equals(other);

            if (revision == null || otherCasted.revision == null) return false;

            return revision.equals(otherCasted.revision);
        }

        if (id == null || otherCasted.id == null) return false;

        if (id.equals(otherCasted.id)) {
            if (revision == null && otherCasted.revision == null) return true;

            if (revision == null || otherCasted.revision == null) return false;

            return revision.equals(otherCasted.revision);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (id == null) return 0;
        return id.hashCode();
    }

    public void cloneInto(final RESTBaseEntityV1<?, ?, ?> clone, final boolean deepCopy) {
        super.cloneInto(clone);
        clone.setId(id == null ? null : id);
        clone.setRevision(revision);
        clone.setExpand(expand);

        if (deepCopy) {
            if (logDetails != null) {
                clone.setLogDetails(logDetails.clone(deepCopy));
            }
        } else {
            clone.setLogDetails(logDetails);
        }
    }

    public List<String> getExpand() {
        return expand;
    }

    public void setExpand(final List<String> expand) {
        this.expand = expand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(final Integer revision) {
        this.revision = revision;
    }

    public RESTLogDetailsV1 getLogDetails() {
        return logDetails;
    }

    public void setLogDetails(final RESTLogDetailsV1 logDetails) {
        this.logDetails = logDetails;
    }
}
