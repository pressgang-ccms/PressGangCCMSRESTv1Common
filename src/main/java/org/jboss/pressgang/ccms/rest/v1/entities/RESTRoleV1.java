/*
  Copyright 2011-2014 Red Hat, Inc

  This file is part of PressGang CCMS.

  PressGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PressGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PressGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.collections.RESTRoleCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.RESTUserCollectionV1;
import org.jboss.pressgang.ccms.rest.v1.collections.items.RESTRoleCollectionItemV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBasePrimaryAuditedEntityV1;

public class RESTRoleV1 extends RESTBasePrimaryAuditedEntityV1<RESTRoleV1, RESTRoleCollectionV1, RESTRoleCollectionItemV1> {
    public static final String NAME_NAME = "name";
    public static final String DESCRIPTION_NAME = "description";
    public static final String CHILDROLES_NAME = "childRoles";
    public static final String PARENTROLES_NAME = "parentRoles";
    public static final String USERS_NAME = "users";

    private String name = null;
    private String description = null;
    private RESTUserCollectionV1 users = null;
    private RESTRoleCollectionV1 childRoles = null;
    private RESTRoleCollectionV1 parentRoles = null;
    /**
     * A list of the Envers revision numbers
     */
    private RESTRoleCollectionV1 revisions = null;

    @Override
    public RESTRoleCollectionV1 getRevisions() {
        return revisions;
    }

    @Override
    public void setRevisions(final RESTRoleCollectionV1 revisions) {
        this.revisions = revisions;
    }

    @Override
    public RESTRoleV1 clone(boolean deepCopy) {
        final RESTRoleV1 retValue = new RESTRoleV1();

        cloneInto(retValue, deepCopy);

        return retValue;
    }

    public void cloneInto(final RESTRoleV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.description = description;

        if (deepCopy) {
            if (users != null) {
                clone.users = new RESTUserCollectionV1();
                users.cloneInto(clone.users, deepCopy);
            }  else {
                clone.users = null;
            }

            if (childRoles != null) {
                clone.childRoles = new RESTRoleCollectionV1();
                childRoles.cloneInto(clone.childRoles, deepCopy);
            }  else {
                clone.childRoles = null;
            }

            if (parentRoles != null) {
                clone.parentRoles = new RESTRoleCollectionV1();
                parentRoles.cloneInto(clone.parentRoles, deepCopy);
            }   else {
                clone.parentRoles = null;
            }

            if (revisions != null) {
                clone.revisions = new RESTRoleCollectionV1();
                revisions.cloneInto(clone.revisions, deepCopy);
            }   else {
                clone.revisions = null;
            }
        } else {
            clone.users = users;
            clone.childRoles = childRoles;
            clone.parentRoles = parentRoles;
            clone.revisions = revisions;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void explicitSetName(final String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void explicitSetDescription(final String description) {
        this.description = description;
        setParameterToConfigured(DESCRIPTION_NAME);
    }

    public RESTUserCollectionV1 getUsers() {
        return users;
    }

    public void setUsers(final RESTUserCollectionV1 users) {
        this.users = users;
    }

    public void explicitSetUsers(final RESTUserCollectionV1 users) {
        this.users = users;
        setParameterToConfigured(USERS_NAME);
    }

    public RESTRoleCollectionV1 getChildRoles() {
        return childRoles;
    }

    public void setChildRoles(final RESTRoleCollectionV1 childRoles) {
        this.childRoles = childRoles;
    }

    public void explicitSetChildRoles(final RESTRoleCollectionV1 childRoles) {
        this.childRoles = childRoles;
        setParameterToConfigured(CHILDROLES_NAME);
    }

    public RESTRoleCollectionV1 getParentRoles() {
        return parentRoles;
    }

    public void setParentRoles(final RESTRoleCollectionV1 parentRoles) {
        this.parentRoles = parentRoles;
    }

    public void explicitSetParentRoles(final RESTRoleCollectionV1 parentRoles) {
        this.parentRoles = parentRoles;
        setParameterToConfigured(PARENTROLES_NAME);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTRoleV1)) return false;

        return super.equals(other);
    }
}
