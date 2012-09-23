package org.jboss.pressgang.ccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgang.ccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgang.ccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgang.ccms.utils.structures.Pair;

public class RESTPropertyCategoryQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR, CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR, CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR, CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR_DESC));
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
    
    public List<Integer> getPropertyCategoryIds()
    {
        final String propertyCategoryIdsString = get(CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR);
        
        return getIntegerList(propertyCategoryIdsString);
    }
    
    public void setPropertyCategoryIds(final List<Integer> propertyCategoryIds)
    {   
        put(CommonFilterConstants.PROP_CATEGORY_IDS_FILTER_VAR, propertyCategoryIds);
    }
    
    public String getPropertyCategoryName()
    {
        return get(CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR);
    }
    
    public void setPropertyCategoryName(final String propertyCategoryName)
    {
        put(CommonFilterConstants.PROP_CATEGORY_NAME_FILTER_VAR, propertyCategoryName);
    }
    
    public String getPropertyCategoryDescription()
    {
        return get(CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR);
    }
    
    public void setPropertyCategoryDescription(final String propertyCategoryDescription)
    {
        put(CommonFilterConstants.PROP_CATEGORY_DESCRIPTION_FILTER_VAR, propertyCategoryDescription);
    }
}