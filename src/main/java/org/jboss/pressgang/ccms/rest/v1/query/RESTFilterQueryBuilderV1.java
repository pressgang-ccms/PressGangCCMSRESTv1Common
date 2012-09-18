package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTFilterQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.FILTER_IDS_FILTER_VAR, CommonFilterConstants.FILTER_DESCRIPTION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.FILTER_NAME_FILTER_VAR, CommonFilterConstants.FILTER_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.FILTER_DESCRIPTION_FILTER_VAR, CommonFilterConstants.FILTER_DESCRIPTION_FILTER_VAR_DESC));
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
    
    public List<Integer> getFilterIds()
    {
        final String filterIdsString = get(CommonFilterConstants.FILTER_IDS_FILTER_VAR);
        
        return getIntegerList(filterIdsString);
    }
    
    public void setFilterIds(final List<Integer> filterIds)
    {   
        put(CommonFilterConstants.FILTER_IDS_FILTER_VAR, filterIds);
    }
    
    public String getFilterName()
    {
        return get(CommonFilterConstants.FILTER_NAME_FILTER_VAR);
    }
    
    public void setFilterName(final String filterName)
    {
        put(CommonFilterConstants.FILTER_NAME_FILTER_VAR, filterName);
    }
    
    public String getFilterDescription()
    {
        return get(CommonFilterConstants.FILTER_DESCRIPTION_FILTER_VAR);
    }
    
    public void setFilterDescription(final String filterDescription)
    {
        put(CommonFilterConstants.FILTER_DESCRIPTION_FILTER_VAR, filterDescription);
    }
}
