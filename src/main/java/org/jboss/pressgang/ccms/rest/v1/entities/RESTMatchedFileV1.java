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

/**
 * Wraps up a RESTFileV1 and includes a flag to indicate whether or not the file was
 * created or matched from an existing one.
 */
public class RESTMatchedFileV1 {
    private RESTFileV1 file;
    private boolean matchedExistingFile;

    public RESTMatchedFileV1() {

    }

    public RESTMatchedFileV1(final RESTFileV1 file, final boolean matchedExistingTopic) {
        this.file = file;
        this.matchedExistingFile = matchedExistingTopic;
    }

    public RESTFileV1 getFile() {
        return file;
    }

    public void setFile(final RESTFileV1 file) {
        this.file = file;
    }

    public boolean isMatchedExistingFile() {
        return matchedExistingFile;
    }

    public void setMatchedExistingFile(final boolean matchedExistingFile) {
        this.matchedExistingFile = matchedExistingFile;
    }
}
