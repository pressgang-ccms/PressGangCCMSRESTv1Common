package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgangccms.utils.structures.Pair;

public class RESTPropertyTagQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.PROP_TAG_IDS_FILTER_VAR, CommonFilterConstants.PROP_TAG_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROP_TAG_NAME_FILTER_VAR, CommonFilterConstants.PROP_TAG_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROP_TAG_DESCRIPTION_FILTER_VAR, CommonFilterConstants.PROP_TAG_DESCRIPTION_FILTER_VAR_DESC));
        }
    };

    public static List<Pair<String, String>> getFilterInfo()
    {
        return filterPairs;
    }

    public static String getFilterDesc(final String varName)
    {
        if (varName == null) return null;
        
        final List<Pair<String, String>> filterInfo = getFilterInfo();
        for (final Pair<String, String> varInfo : filterInfo)
        {
            if (varInfo.getFirst().equals(varName))
            {
                return varInfo.getSecond();
            }
        }
        
        return null;
    }
    
    public List<Integer> getPropertyTagIds()
    {
        final String propertyTagIdsString = get(CommonFilterConstants.PROP_TAG_IDS_FILTER_VAR);
        
        return getIntegerList(propertyTagIdsString);
    }
    
    public void setPropertyTagIds(final List<Integer> propertyTagIds)
    {   
        put(CommonFilterConstants.PROP_TAG_IDS_FILTER_VAR, propertyTagIds);
    }
    
    public String getPropertyTagName()
    {
        return get(CommonFilterConstants.PROP_TAG_NAME_FILTER_VAR);
    }
    
    public void setPropertyTagName(final String propertyTagName)
    {
        put(CommonFilterConstants.PROP_TAG_NAME_FILTER_VAR, propertyTagName);
    }
    
    public String getPropertyTagDescription()
    {
        return get(CommonFilterConstants.PROP_TAG_DESCRIPTION_FILTER_VAR);
    }
    
    public void setPropertyTagDescription(final String propertyTagDescription)
    {
        put(CommonFilterConstants.PROP_TAG_DESCRIPTION_FILTER_VAR, propertyTagDescription);
    }
}