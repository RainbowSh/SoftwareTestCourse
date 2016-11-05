/**
 * MigrateTool
 * mtn.zzxysh.migrate.dao
 * Create time: 2013
 * Author: aoyi
 */
package test.course.example.demo;

import nu.xom.Element;
import nu.xom.Elements;

/**
 * @author Rainbow
 *
 */
public class TableDefineParser {

	/**
	 * 
	 */
	private static final int TABLE_DESCRIPTION_ELEMENT_COUNT = 3;
	/**
	 * 
	 */
	private static final String TABLE_RECORD_COUNT = "RecordCount";
	/**
	 * 
	 */
	private static final String TABLE_FIELD_COUNT = "FieldCount";
	/**
	 * 
	 */
	private static final String TABLE_NAME = "Name";

	/**
	 * @param element
	 * @return
	 */
	public Table parse(Element node) 
		throws TableDefineException {
		if (node.getChildElements().size() != TABLE_DESCRIPTION_ELEMENT_COUNT) {
			throw new TableDefineException();
		}
		
		String name = getElementValue(node, TABLE_NAME);
		int fieldCount = Integer.parseInt(getElementValue(node, TABLE_FIELD_COUNT));
		int recordCount =Integer.parseInt(getElementValue(node, TABLE_RECORD_COUNT));
		
		return new Table(name, fieldCount, recordCount);
	}

	/**
	 * @param node
	 * @param nodeName 
	 * @return
	 */
	private String getElementValue(Element node, String nodeName) 
		throws TableDefineException{
		Elements elements = node.getChildElements(nodeName);
		if (elements.size() != 1) {
			throw new TableDefineException();
		}
		
		return elements.get(0).getValue();
	}

}
