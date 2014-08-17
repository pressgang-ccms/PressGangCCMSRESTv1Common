/*
 * Copyright 2011-2014 Red Hat, Inc.
 *
 * This file is part of PressGang CCMS.
 *
 * PressGang CCMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PressGang CCMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PressGang CCMS. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jboss.pressgang.ccms.rest.v1.entities;

import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTranslationServerV1;

public class RESTTranslationServerExtendedV1 extends RESTBaseTranslationServerV1<RESTTranslationServerExtendedV1> {
    public static final String USERNAME_NAME = "username";
    public static final String KEY_NAME = "key";

    private String username;
    private String key;

    public void explicitSetName(String name) {
        this.name = name;
        setParameterToConfigured(NAME_NAME);
    }

    public void explicitSetUrl(String url) {
        this.url = url;
        setParameterToConfigured(URL_NAME);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void explicitSetUsername(String username) {
        this.username = username;
        setParameterToConfigured(USERNAME_NAME);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void explicitSetKey(String key) {
        this.key = key;
        setParameterToConfigured(KEY_NAME);
    }

    @Override
    public RESTTranslationServerExtendedV1 clone(boolean deepCopy) {
        final RESTTranslationServerExtendedV1 retValue = new RESTTranslationServerExtendedV1();
        cloneInto(retValue, deepCopy);
        return retValue;
    }

    public void cloneInto(final RESTTranslationServerExtendedV1 clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.username = username;
        clone.key = key;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTTranslationServerExtendedV1)) return false;

        return super.equals(other);
    }
}
