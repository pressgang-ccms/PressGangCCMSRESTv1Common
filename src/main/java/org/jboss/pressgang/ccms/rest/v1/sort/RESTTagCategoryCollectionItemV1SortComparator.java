/*
  Copyright 2011-2014 Red Hat

  This file is part of PresGang CCMS.

  PresGang CCMS is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  PresGang CCMS is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with PresGang CCMS.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.jboss.pressgang.ccms.rest.v1.sort;

import java.io.Serializable;
import java.util.Comparator;

import org.jboss.pressgang.ccms.rest.v1.collections.items.join.RESTTagInCategoryCollectionItemV1;

/**
 * A comparator to sort RESTTagCategoryCollectionItemV1 objects by their sort field.
 *
 * @author Matthew Casperson
 */
public class RESTTagCategoryCollectionItemV1SortComparator implements Comparator<RESTTagInCategoryCollectionItemV1>, Serializable {
    private static final long serialVersionUID = -1747410895327434628L;

    @Override
    public int compare(final RESTTagInCategoryCollectionItemV1 arg0, final RESTTagInCategoryCollectionItemV1 arg1) {
        if (arg0 == null && arg1 == null) {
            return 0;
        }

        if (arg0 == arg1) {
            return 0;
        }

        if (arg0 == null) {
            return -1;
        }

        if (arg1 == null) {
            return 1;
        }

        if (arg0.getItem() == null && arg1.getItem() == null) {
            return 0;
        }

        if (arg0.getItem() == null) {
            return -1;
        }

        if (arg1.getItem() == null) {
            return 1;
        }

        if (arg0.getItem().getRelationshipSort() == null && arg1.getItem().getRelationshipSort() == null) {
            return secondOrderSort(arg0, arg1);
        }

        if (arg0.getItem().getRelationshipSort() == null) {
            return -1;
        }

        if (arg1.getItem().getRelationshipSort() == null) {
            return 1;
        }

        if (arg0.getItem().getRelationshipSort().equals(arg1.getItem().getRelationshipSort())) {
            return secondOrderSort(arg0, arg1);
        }

        return arg0.getItem().getRelationshipSort().compareTo(arg1.getItem().getRelationshipSort());
    }

    private int secondOrderSort(final RESTTagInCategoryCollectionItemV1 arg0, final RESTTagInCategoryCollectionItemV1 arg1) {
        /* Second order sort is by name */
        if (arg0.getItem().getName() == null && arg1.getItem().getName() == null) {
            return 0;
        }

        if (arg0.getItem().getName() == null) {
            return -1;
        }

        if (arg1.getItem().getName() == null) {
            return 1;
        }

        return arg0.getItem().getName().compareTo(arg1.getItem().getName());
    }

}
