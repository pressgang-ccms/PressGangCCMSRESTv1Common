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

package org.jboss.pressgang.ccms.rest.v1.entities;

/**
 * Wraps up a RESTImageV1 and includes a flag to indicate whether or not the topic was
 * created or matched from an existing one.
 */
public class RESTMatchedImageV1 {
    private RESTImageV1 image;
    private boolean matchedExistingImage;

    public RESTMatchedImageV1() {

    }

    public RESTMatchedImageV1(final RESTImageV1 image, final boolean matchedExistingTopic) {
        this.image = image;
        this.matchedExistingImage = matchedExistingTopic;
    }

    public RESTImageV1 getImage() {
        return image;
    }

    public void setImage(final RESTImageV1 topic) {
        this.image = image;
    }

    public boolean isMatchedExistingImage() {
        return matchedExistingImage;
    }

    public void setMatchedExistingImage(final boolean matchedExistingImage) {
        this.matchedExistingImage = matchedExistingImage;
    }
}
