/*
  Copyright 2011-2014 Red Hat

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

package org.jboss.pressgang.ccms.rest.v1.components;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * This component contains methods that can be applied against the topic entity. It excludes any
 * methods that are not GWT compatible (unlike the ComponentTopicV1 class, which includes a bunch
 * of XML processing).
 *
 * @author Matthew Casperson
 */
public abstract class GWTComponentTopicV1 extends ComponentBaseRESTEntityWithPropertiesV1 {
    final RESTBaseTopicV1<?, ?, ?> source;

    protected GWTComponentTopicV1(final RESTBaseTopicV1<?, ?, ?> source) {
        super(source);
        this.source = source;
    }

    public boolean hasTag(final Integer tagID) {
        return hasTag(source, tagID);
    }

    public static boolean hasTag(final RESTBaseTopicV1<?, ?, ?> source, final Integer tagID) {
        checkArgument(source != null, "The source parameter can not be null");

        if (source.getTags() != null && source.getTags().getItems() != null) {
            final List<RESTTagV1> tags = source.getTags().returnItems();
            for (final RESTTagV1 tag : tags) {
                if (tag.getId().equals(tagID)) return true;
            }
        }

        return false;
    }
}