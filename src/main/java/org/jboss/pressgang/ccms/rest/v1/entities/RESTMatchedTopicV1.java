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
 * Wraps up a RESTTopicV1 and includes a flag to indicate whether or not the topic was
 * created or matched from an existing one.
 */
public class RESTMatchedTopicV1 {
    private RESTTopicV1 topic;
    private boolean matchedExistingTopic;

    public RESTMatchedTopicV1() {

    }

    public RESTMatchedTopicV1(final RESTTopicV1 topic, final boolean matchedExistingTopic) {
        this.topic = topic;
        this.matchedExistingTopic = matchedExistingTopic;
    }

    public RESTTopicV1 getTopic() {
        return topic;
    }

    public void setTopic(final RESTTopicV1 topic) {
        this.topic = topic;
    }

    public boolean isMatchedExistingTopic() {
        return matchedExistingTopic;
    }

    public void setMatchedExistingTopic(final boolean matchedExistingTopic) {
        this.matchedExistingTopic = matchedExistingTopic;
    }
}
