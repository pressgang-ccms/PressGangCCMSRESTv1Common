package org.jboss.pressgang.ccms.rest.v1.entities;

/**
 * This is returned by the endpoint that creates or matches a new topic. It adds a field
 * to indicate whether the topic being returned was created, or was an exsiting topic.
 */
public class RESTMatchedTopicV1 extends RESTTopicV1 {
    private boolean newTopic = false;

    public boolean isNewTopic() {
        return newTopic;
    }

    public void setNewTopic(boolean newTopic) {
        this.newTopic = newTopic;
    }
}
