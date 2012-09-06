package org.jboss.pressgangccms.rest.v1.query;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pressgangccms.rest.v1.constants.CommonFilterConstants;
import org.jboss.pressgangccms.rest.v1.query.base.RESTBaseQueryBuilderV1;
import org.jboss.pressgangccms.utils.structures.Pair;

public class RESTCategoryQueryBuilderV1 extends RESTBaseQueryBuilderV1
{
    private static List<Pair<String, String>> filterPairs = new ArrayList<Pair<String, String>>()
    {
        private static final long serialVersionUID = -8638470044710698912L;
        
        {
            add(new Pair<String, String>(CommonFilterConstants.CATEGORY_IDS_FILTER_VAR, CommonFilterConstants.CATEGORY_IDS_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CATEGORY_NAME_FILTER_VAR, CommonFilterConstants.CATEGORY_NAME_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CATEGORY_DESCRIPTION_FILTER_VAR, CommonFilterConstants.CATEGORY_DESCRIPTION_FILTER_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CATEGORY_IS_MUTUALLY_EXCLUSIVE_VAR, CommonFilterConstants.CATEGORY_IS_MUTUALLY_EXCLUSIVE_VAR_DESC));
            add(new Pair<String, String>(CommonFilterConstants.CATEGORY_IS_NOT_MUTUALLY_EXCLUSIVE_VAR, CommonFilterConstants.CATEGORY_IS_NOT_MUTUALLY_EXCLUSIVE_VAR_DESC));
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
    
    public List<Integer> getCategoryIds()
    {
        final String categoryIdsString = get(CommonFilterConstants.CATEGORY_IDS_FILTER_VAR);
        
        return getIntegerList(categoryIdsString);
    }
    
    public void setCategoryIds(final List<Integer> categoryIds)
    {   
        put(CommonFilterConstants.CATEGORY_IDS_FILTER_VAR, categoryIds);
    }
    
    public String getCategoryName()
    {
        return get(CommonFilterConstants.CATEGORY_NAME_FILTER_VAR);
    }
    
    public void setCategoryName(final String categoryName)
    {
        put(CommonFilterConstants.CATEGORY_NAME_FILTER_VAR, categoryName);
    }
    
    public String getCategoryDescription()
    {
        return get(CommonFilterConstants.CATEGORY_DESCRIPTION_FILTER_VAR);
    }
    
    public void setCategoryDescription(final String categoryDescription)
    {
        put(CommonFilterConstants.CATEGORY_DESCRIPTION_FILTER_VAR, categoryDescription);
    }
    
    public Boolean getCategoryIsMutuallyExclusive()
    {
        final String mutuallyExclusiveString = get(CommonFilterConstants.CATEGORY_IS_MUTUALLY_EXCLUSIVE_VAR);
        
        return mutuallyExclusiveString == null ? null : Boolean.parseBoolean(mutuallyExclusiveString);
    }
    
    public void setCategoryIsMutuallyExclusive(final Boolean mutuallyExclusive)
    {
        put(CommonFilterConstants.CATEGORY_IS_MUTUALLY_EXCLUSIVE_VAR, mutuallyExclusive);
    }
    
    public Boolean getCategoryIsNotMutuallyExclusive()
    {
        final String mutuallyExclusiveString = get(CommonFilterConstants.CATEGORY_IS_NOT_MUTUALLY_EXCLUSIVE_VAR);
        
        return mutuallyExclusiveString == null ? null : Boolean.parseBoolean(mutuallyExclusiveString);
    }
    
    public void setCategoryIsNotMutuallyExclusive(final Boolean mutuallyExclusive)
    {
        put(CommonFilterConstants.CATEGORY_IS_NOT_MUTUALLY_EXCLUSIVE_VAR, mutuallyExclusive);
    }
}
