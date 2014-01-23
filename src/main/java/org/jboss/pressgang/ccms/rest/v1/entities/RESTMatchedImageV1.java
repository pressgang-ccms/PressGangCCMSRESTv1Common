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
