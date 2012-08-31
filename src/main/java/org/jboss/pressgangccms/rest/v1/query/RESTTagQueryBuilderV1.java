package org.jboss.pressgangccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgangccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgangccms.utils.constants.CommonFilterConstants;
import org.jboss.pressgangccms.utils.structures.Pair;

public class RESTTagQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.TAG_IDS_FILTER_VAR, CommonFilterConstants.TAG_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TAG_NAME_FILTER_VAR, CommonFilterConstants.TAG_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR, CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR_DESC));
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
    
    public List<Integer> getTagIds()
    {
        final String tagIdsString = get(CommonFilterConstants.TAG_IDS_FILTER_VAR);
        
        return getIntegerList(tagIdsString);
    }
    
    public void setTagIds(final List<Integer> tagIds)
    {   
        put(CommonFilterConstants.TAG_IDS_FILTER_VAR, tagIds);
    }
    
    public String getTagName()
    {
        return get(CommonFilterConstants.TAG_NAME_FILTER_VAR);
    }
    
    public void setTagName(final String tagName)
    {
        put(CommonFilterConstants.TAG_NAME_FILTER_VAR, tagName);
    }
    
    public String getTagDescription()
    {
        return get(CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR);
    }
    
    public void setTagDescription(final String tagDescription)
    {
        put(CommonFilterConstants.TAG_DESCRIPTION_FILTER_VAR, tagDescription);
    }
}
