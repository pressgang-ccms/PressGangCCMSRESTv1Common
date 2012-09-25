package org.jboss.pressgang.ccms.rest.v1.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

import org.jboss.pressgang.ccms.rest.v1.entities.RESTTagV1;
import org.jboss.pressgang.ccms.rest.v1.entities.base.RESTBaseTopicV1;
import org.jboss.pressgang.ccms.rest.v1.entities.join.RESTCategoryInTagV1;
import org.jboss.pressgang.ccms.rest.v1.sort.TagV1NameComparator;
import org.jboss.pressgang.ccms.utils.common.ExceptionUtilities;
import org.jboss.pressgang.ccms.utils.common.XMLUtilities;
import org.jboss.pressgang.ccms.utils.structures.NameIDSortMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This component contains methods that can be applied against all topic entities
 * @author Matthew Casperson
 */
public abstract class ComponentBaseTopicV1<T extends RESTBaseTopicV1<T, ?, ?>>
    extends ComponentBaseRESTEntityWithPropertiesV1<T>
{
	final T source;
	
	public ComponentBaseTopicV1(final T source)
	{
		super(source);
		this.source = source;
	}
	
	/**
	 * @return the XML contained in a new element, or null if the XML is not valid
	 */
	public String returnXMLWithNewContainer(final String containerName)
	{
		return returnXMLWithNewContainer(source, containerName);
	}

	static public <T extends RESTBaseTopicV1<T, ?, ?>> String returnXMLWithNewContainer(final T source, final String containerName)
	{
		assert containerName != null : "The containerName parameter can not be null";

		Document document = null;
		try
		{
			document = XMLUtilities.convertStringToDocument(source.getXml());
		}
		catch (SAXException ex)
		{
			ExceptionUtilities.handleException(ex);
		}

		if (document == null)
			return null;

		final Element newElement = document.createElement(containerName);
		final Element documentElement = document.getDocumentElement();

		document.removeChild(documentElement);
		document.appendChild(newElement);
		newElement.appendChild(documentElement);

		return XMLUtilities.convertDocumentToString(document);
	}

	public String returnXMLWithNoContainer(final Boolean includeTitle)
	{
		return returnXMLWithNoContainer(source, includeTitle);

	}

	static public <T extends RESTBaseTopicV1<T, ?, ?>> String returnXMLWithNoContainer(final T source, final Boolean includeTitle)
	{
		Document document = null;
		try
		{
			document = XMLUtilities.convertStringToDocument(source.getXml());
		}
		catch (SAXException ex)
		{
			ExceptionUtilities.handleException(ex);
		}

		if (document == null)
			return null;

		String retValue = "";

		final NodeList nodes = document.getDocumentElement().getChildNodes();

		for (int i = 0; i < nodes.getLength(); ++i)
		{
			final Node node = nodes.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE)
			{

				if (includeTitle != null && !includeTitle)
				{
					if (node.getNodeName().equals("title"))
					{
						continue;
					}
				}

				retValue += XMLUtilities.convertNodeToString(node, true);
			}
		}

		return retValue;

	}

	public String getCommaSeparatedTagList()
	{
		return getCommaSeparatedTagList(source);
	}

	static public <T extends RESTBaseTopicV1<T, ?, ?>> String getCommaSeparatedTagList(final T source)
	{
		final TreeMap<NameIDSortMap, ArrayList<RESTTagV1>> tags = getCategoriesMappedToTags(source);

		String tagsList = "";
		for (final NameIDSortMap key : tags.keySet())
		{
			// sort alphabetically
			Collections.sort(tags.get(key), new TagV1NameComparator());

			if (tagsList.length() != 0)
				tagsList += " ";

			tagsList += key.getName() + ": ";

			String thisTagList = "";

			for (final RESTTagV1 tag : tags.get(key))
			{
				if (thisTagList.length() != 0)
					thisTagList += ", ";

				thisTagList += tag.getName();
			}

			tagsList += thisTagList + " ";
		}

		return tagsList;
	}
	
	static public <T extends RESTBaseTopicV1<T, ?, ?>> TreeMap<NameIDSortMap, ArrayList<RESTTagV1>> getCategoriesMappedToTags(final T source)
	{
		final TreeMap<NameIDSortMap, ArrayList<RESTTagV1>> tags = new TreeMap<NameIDSortMap, ArrayList<RESTTagV1>>();

		if (source.getTags() != null && source.getTags().getItems() != null)
		{
		    final List<RESTTagV1> tagItems = source.getTags().returnItems();
			for (final RESTTagV1 tag : tagItems)
			{
				if (tag.getCategories() != null && tag.getCategories().getItems() != null)
				{
					final List<RESTCategoryInTagV1> categories = tag.getCategories().returnItems();

					if (categories.size() == 0)
					{
						final NameIDSortMap categoryDetails = new NameIDSortMap("Uncatagorised", -1, 0);

						if (!tags.containsKey(categoryDetails))
							tags.put(categoryDetails, new ArrayList<RESTTagV1>());

						tags.get(categoryDetails).add(tag);
					}
					else
					{
						for (final RESTCategoryInTagV1 category : categories)
						{
							final NameIDSortMap categoryDetails = new NameIDSortMap(category.getName(), category.getId(), category.getRelationshipSort() == null ? 0 : category.getRelationshipSort());

							if (!tags.containsKey(categoryDetails))
								tags.put(categoryDetails, new ArrayList<RESTTagV1>());

							tags.get(categoryDetails).add(tag);
						}
					}
				}
			}
		}

		return tags;
	}

	public List<RESTTagV1> returnTagsInCategoriesByID(final List<Integer> categories)
	{
		return returnTagsInCategoriesByID(source, categories);
	}
	
	static public <T extends RESTBaseTopicV1<T, ?, ?>> List<RESTTagV1> returnTagsInCategoriesByID(final T source, final List<Integer> categories)
	{
		final List<RESTTagV1> retValue = new ArrayList<RESTTagV1>();

		if (source.getTags() != null && source.getTags().getItems() != null)
		{
			for (final Integer categoryId : categories)
			{
			    final List<RESTTagV1> tags = source.getTags().returnItems();
				for (final RESTTagV1 tag : tags)
				{
					if (ComponentTagV1.containedInCategory(tag, categoryId))
					{
						if (!retValue.contains(tag))
							retValue.add(tag);
					}
				}
			}
		}

		return retValue;
	}

	public int getTagsInCategory(final Integer categoryId)
	{
		int retValue = 0;

		if (source.getTags() != null && source.getTags().returnItems() != null)
		{
			for (final RESTTagV1 tag : source.getTags().returnItems())
			{
				if (ComponentTagV1.containedInCategory(tag, categoryId))
					++retValue;
			}
		}

		return retValue;
	}

	public boolean hasTag(final Integer tagID)
	{
		return hasTag(source, tagID);
	}
	
	static public <T extends RESTBaseTopicV1<T, ?, ?>> boolean hasTag(final T source, final Integer tagID)
	{
		if (source.getTags() != null && source.getTags().getItems() != null)
		{
		    final List<RESTTagV1> tags = source.getTags().returnItems();
			for (final RESTTagV1 tag : tags)
			{
				if (tag.getId().equals(tagID))
					return true;
			}
		}

		return false;
	}

	public boolean returnIsDummyTopic()
	{
		return returnIsDummyTopic(source);
	}
	
	static public <T extends RESTBaseTopicV1<T, ?, ?>> boolean returnIsDummyTopic(final T source)
	{
		return source.getId() == null || source.getId() < 0;
	}
	
	public abstract boolean hasRelationshipTo(final Integer id);
	public abstract String returnBugzillaBuildId();
	public abstract String returnSkynetURL();
	public abstract String returnInternalURL();
	public abstract T returnRelatedTopicByID(final Integer id);
	public abstract String returnErrorXRefID();
	public abstract String returnXrefPropertyOrId(final Integer propertyTagId);
	public abstract String returnXRefID();
	public abstract String returnEditorURL();
}
