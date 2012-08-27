package org.jboss.pressgangccms.rest.v1.entities.base;

public class RESTLogDetailsV1 implements Cloneable {
    
    public static final byte INTERNAL_FLAG_BIT = 0x01;
    public static final byte TRANSLATOR_FLAG_BIT = 0x02;
    public static final byte REV_HISTORY_FLAG_BIT = 0x04;

    private String message = null;
    private Integer flag = null;
    private String username = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(final Integer flag) {
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public RESTLogDetailsV1 clone()
    {
        final RESTLogDetailsV1 retValue = new RESTLogDetailsV1();
        
        retValue.setFlag(new Integer(flag));
        retValue.setMessage(new String(message));
        
        return retValue;
        
    }
}
