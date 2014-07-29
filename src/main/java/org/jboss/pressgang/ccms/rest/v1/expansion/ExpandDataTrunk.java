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

package org.jboss.pressgang.ccms.rest.v1.expansion;

import java.util.List;

/**
 * This class defines the information required to expand a collection of
 * entities, as well as the information required to expand the child collections.
 */
public class ExpandDataTrunk {
    /**
     * A representation of the main collection
     */
    private ExpandDataDetails trunk;
    /**
     * A collection of expansion collections held by the trunk
     */
    private List<ExpandDataTrunk> branches;

    public ExpandDataDetails getTrunk() {
        return trunk;
    }

    public void setTrunk(final ExpandDataDetails trunk) {
        this.trunk = trunk;
    }

    public List<ExpandDataTrunk> getBranches() {
        return branches;
    }

    public void setBranches(final List<ExpandDataTrunk> branches) {
        this.branches = branches;
    }

    public ExpandDataTrunk get(final String name) {
        if (branches != null) {
            for (final ExpandDataTrunk branch : branches) {
                if (branch.getTrunk() != null && branch.getTrunk().getName() != null && branch.getTrunk().getName().equals(name))
                    return branch;
            }
        }

        return null;
    }

    public boolean contains(final String name) {
        if (branches != null) {
            for (final ExpandDataTrunk branch : branches) {
                if (branch.getTrunk() != null && branch.getTrunk().getName() != null && branch.getTrunk().getName().equals(name))
                    return true;
            }
        }

        return false;
    }

    public ExpandDataTrunk() {

    }

    public ExpandDataTrunk(final ExpandDataDetails trunk) {
        this.trunk = trunk;
    }

    public ExpandDataTrunk(final ExpandDataDetails trunk, final List<ExpandDataTrunk> branches) {
        this.trunk = trunk;
        this.branches = branches;
    }
}
