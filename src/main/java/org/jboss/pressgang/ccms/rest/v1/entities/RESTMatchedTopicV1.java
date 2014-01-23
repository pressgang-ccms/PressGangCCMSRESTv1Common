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
