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

package org.jboss.pressgang.ccms.rest.v1.entities.base;

public abstract class RESTBaseTranslationServerV1<T extends RESTBasePrimaryEntityV1<T>> extends RESTBasePrimaryEntityV1<T> {
    public static final String NAME_NAME = "name";
    public static final String URL_NAME = "url";

    protected String name;
    protected String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void cloneInto(final RESTBaseTranslationServerV1<?> clone, final boolean deepCopy) {
        super.cloneInto(clone, deepCopy);

        clone.name = name;
        clone.url = url;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof RESTBaseTranslationServerV1)) return false;

        return super.equals(other);
    }
}
