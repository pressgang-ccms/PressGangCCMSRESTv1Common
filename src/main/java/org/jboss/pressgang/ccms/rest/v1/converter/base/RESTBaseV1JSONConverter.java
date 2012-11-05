package org.jboss.pressgang.ccms.rest.v1.converter.base;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.spi.StringConverter;

public abstract class RESTBaseV1JSONConverter<T> implements StringConverter<T>
{
    private static final ObjectMapper mapper = new ObjectMapper();
    {
        mapper.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    
    private final Class<T> clazz;
    
    public RESTBaseV1JSONConverter(final Class<T> clazz)
    {
        this.clazz = clazz;
    }
    
    @Override
    public T fromString(final String arg0)
    {
        try
        {
            return mapper.readValue(arg0, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString(final T arg0)
    {
        try
        {
            return mapper.writeValueAsString(arg0);
        } catch (Exception e) {
         // TODO Something intelligent
        }
        return null;
    }

}
