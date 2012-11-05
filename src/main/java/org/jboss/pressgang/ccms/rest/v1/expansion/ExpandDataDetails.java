package org.jboss.pressgang.ccms.rest.v1.expansion;

/**
 * This class defines the information required to expand a particular collection
 * that will be returned through the REST interface.
 */
public class ExpandDataDetails
{
	/** The name of the collection */
	private String name;
	/** The starting index - can be negative to indicate a starting point from the end of the collection */
	private Integer start;
	/** The ending index - can be negative to indicate a starting point from the end of the collection */
	private Integer end;
	/** If these details should be recursively applied to all branches */
	//private Boolean recursive;

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public Integer getStart()
	{
		return start;
	}

	public void setStart(final Integer start)
	{
		this.start = start;
	}

	public Integer getEnd()
	{
		return end;
	}

	public void setEnd(final Integer end)
	{
		this.end = end;
	}

	/*public Boolean getRecursive() {
        return recursive;
    }

    public void setRecursive(final Boolean recursive) {
        this.recursive = recursive;
    }*/

    public ExpandDataDetails()
	{

	}

	public ExpandDataDetails(final String name)
	{
		this.name = name;
	}
	
	/*public ExpandDataDetails(final String name, final boolean recursive)
    {
        this.name = name;
        this.recursive = recursive;
    }*/

	public ExpandDataDetails(final String name, final Integer start, final Integer end)
	{
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	/*public ExpandDataDetails(final String name, final Integer start, final Integer end, final boolean recursive)
    {
        this(name, start, end);
        this.recursive = recursive;
    }*/
}
