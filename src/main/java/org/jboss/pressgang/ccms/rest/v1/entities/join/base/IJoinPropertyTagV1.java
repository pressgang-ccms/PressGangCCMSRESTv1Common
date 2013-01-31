package org.jboss.pressgang.ccms.rest.v1.entities.join.base;

public interface IJoinPropertyTagV1 extends IBaseJoinEntityV1 {
    public String getValue();

    public void setValue(final String value);

    public boolean getValid();

    public void setValid(final boolean valid);
}
