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
