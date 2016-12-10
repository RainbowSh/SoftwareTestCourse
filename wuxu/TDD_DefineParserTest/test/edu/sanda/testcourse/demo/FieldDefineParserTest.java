/**
 * 
 */
package edu.sanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class FieldDefineParserTest {

	@Test
	public void shouldParseFieldDefineToTable()
	         throws Exception {
//		Arrangement
		String fieldDefineStr = "<FieldDefs>" +
                                                    "<Name>Table</Name>" +
				                    "<DataType>int</DataType>" +
                                                    "<size>4</size>" +
				                    "<Precision/>1</Precision>" +
				         "<FieldDefs>";
		FieldDefineParser parser = new FieldDefineParser();
		
		String FieldDefineStr = null;
//		Act
		Table actual = parser.parser(fieldDefineStr);
//		Assert
		assertEquals("Table",actual.getNmae());
		assertEquals("int",actual.getDataType());
		assertEquals(4,actual.getSize());
		assertEquals(1,actual.getPrecision());
		
		

	}

}
