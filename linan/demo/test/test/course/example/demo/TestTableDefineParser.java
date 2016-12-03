/**
 * MigrateTool
 * test.course.example.demo
 * Create time: 2013
 * Author: aoyi
 */
package test.course.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Rainbow
 *
 */
public class TestTableDefineParser {

	private TableDefineParser parser = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		parser = new TableDefineParser();
	}

	/**
	 * @param tableDefineStr
	 * @return
	 * @throws ParsingException
	 * @throws ValidityException
	 * @throws IOException
	 */
	private Element createTableDescriptElement(String tableDefineStr)
			throws ParsingException, ValidityException, IOException {
		Builder builder = new Builder();
		Document doc = builder.build(tableDefineStr, null);		
		Element element = doc.getRootElement();
		return element;
	}
	
	@Test
	public void shouldParseTableDefineToTable() 
			throws Exception {
		//Arrangment
		String tableDefineStr = "<Description>" +
									"<Name>Table</Name>" +
									"<FieldCount>4</FieldCount>" +
									"<RecordCount>2</RecordCount>" +
								"</Description>";
		
		Element element = createTableDescriptElement(tableDefineStr);
		
		//Act
		Table actual = parser.parse(element);
		
		//Assert
		assertEquals("Table", actual.getName());
		assertEquals(4, actual.getColumnCount());
		assertEquals(2, actual.getRecordCount());
	}
	
	@Test(expected=NullPointerException.class)
	public void shouldThrowNullPointerExceptionWhenElementIsNull() 
		throws Exception {
		
		//act
		parser.parse(null);
		
		//Assert
		fail("not throw NullPointerException");
	}
	
	@Test(expected=TableDefineException.class)
	public void shouldThrowTableDefineExceptionWhenTableDescriptionElementLessThan3() 
		throws Exception {
		//Arrangment
		String tableDefineStr = "<Description>" +
									"<Name>Table</Name>" +
									"<FieldCount>4</FieldCount>" +
								"</Description>";
		Element element = createTableDescriptElement(tableDefineStr);
		
		//act
		parser.parse(element);
		
		//Assert
		fail("not throw NullPointerException");		
	}
	
	@Test(expected=TableDefineException.class)
	public void shouldThrowTableDefineExceptionWhenTableDescriptionElementMoreThan3() 
		throws Exception {
		//Arrangment
		String tableDefineStr = "<Description>" +
									"<Name>Table</Name>" +
									"<FieldCount>4</FieldCount>" +
									"<RecordCount>2</RecordCount>" +
									"<TableSpace>ABC</TableSpace>" +
								"</Description>";
		Element element = createTableDescriptElement(tableDefineStr);
		
		//act
		parser.parse(element);
		
		//Assert
		fail("not throw NullPointerException");		
	}
	
	@Test(expected=TableDefineException.class)
	public void shouldThrowTableDefineExceptionWhenTableDescriptionError() 
		throws Exception {
		//Arrangment		
		String tableDefineStr = "<Description>" +
									"<TableName>Table</TableName>" +
									"<FieldCount>4</FieldCount>" +
									"<RecordCount>2</RecordCount>" +
								"</Description>";
		Element element = createTableDescriptElement(tableDefineStr);
		
		//act
		parser.parse(element);
		
		//Assert
		fail("not throw NullPointerException");		
	}
	
	@Test(expected=TableDefineException.class)
	public void shouldTrhowTableDefineExceptionWhenTableDescriptIncludeDuplicatedElement()
		throws Exception {
		//Arrangment		
		String tableDefineStr = "<Description>" +
									"<Name>Table</Name>" +
									"<FieldCount>4</FieldCount>" +
									"<FieldCount>2</FieldCount>" +
								"</Description>";
		Element element = createTableDescriptElement(tableDefineStr);
		
		//act
		parser.parse(element);
		
		//Assert
		fail("not throw NullPointerException");				
		
	}
}
