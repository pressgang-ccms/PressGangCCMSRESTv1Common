package org.jboss.pressgangccms.rest.v1.query.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.PathSegment;

import org.jboss.pressgangccms.utils.common.CollectionUtilities;
import org.jboss.pressgangccms.utils.constants.CommonFilterConstants;
import org.jboss.resteasy.specimpl.PathSegmentImpl;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public abstract class RESTBaseQueryBuilderV1
{
    private Map<String, String> filterVars = new HashMap<String, String>();
    
    protected Map<String, String> getFilterVars()
    {
        return Collections.unmodifiableMap(filterVars);
    }
    
    protected void setFilterVars(final Map<String, String> filterVars)
    {
        this.filterVars = filterVars;
    }
    
    protected String get(final String constant)
    {
        return filterVars.get(constant);
    }
    
    protected void put(final String constant, final Object value)
    {
        /* If the constant and value is null do nothing */
        if (value == null && constant == null)
        {
            return;
        }
        /* If the constant is set and value is null then remove the constant */
        else if (value == null)
        {
            filterVars.remove(constant);
        }
        
        /* Convert the value to a string */
        if (value instanceof String)
        {
            if (!((String) value).isEmpty())
            {
                filterVars.put(constant, value.toString());
            }
        }
        else if (value instanceof DateTime)
        {
            filterVars.put(constant, ISODateTimeFormat.dateTime().print((DateTime) value));
        }
        else if (value instanceof Date)
        {
            filterVars.put(constant, ISODateTimeFormat.dateTime().print(new DateTime(value)));
        }
        else if (value instanceof Boolean)
        {
            if (((Boolean) value) == false)
            {
                filterVars.remove(constant);
            }
            else
            {
                filterVars.put(constant, value.toString());
            }
        }
        else
        {
            filterVars.put(constant, value.toString());
        }
    }
    
    protected void put(final String constant, final List<Integer> list)
    {
        if (list == null || list.isEmpty())
        {
            put(constant, null);
        }
        else
        {
            put(constant, CollectionUtilities.toSeperatedString(list, ","));
        }
    }
    
    public PathSegment buildQueryPath()
    {
        return buildQueryPath(false);
    }

    public PathSegment buildQueryPath(boolean decode)
    {
        return new PathSegmentImpl(getQuery(), decode);
    }
    
    public String getQuery()
    {
        final StringBuilder query = new StringBuilder("query;");
        
        final Map<String, String> filterVars = getFilterVars();
        for (final String key : filterVars.keySet())
        {
            final String value = filterVars.get(key);
            
            if (value != null)
            {
                query.append(key + "=" + value + ";");
            }
        }
        
        return query.toString();
    }
    
    protected List<Integer> getIntegerList(final String list)
    {
        if (list == null) return null;
        
        final List<Integer> idsList = new ArrayList<Integer>();
        final String[] ids = list.split("\\s*,\\s*");
        for (final String topicId : ids)
        {
            idsList.add(Integer.parseInt(topicId));
        }
        
        return idsList;
    }
    
    public String getQueryLogic()
    {
        return get(CommonFilterConstants.LOGIC_FILTER_VAR);
    }
    
    public void setQueryLogic(final String logic)
    {
        put(CommonFilterConstants.LOGIC_FILTER_VAR, logic);
    }
}
