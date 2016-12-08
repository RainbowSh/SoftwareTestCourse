/**
 * 
 */
package edu.shanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class FieldDefineParserTest {

	@Test
	public void shouldParserFierdtest() 
	            throws Exception{
		//Arrangement
		String FieldDefineStr = "<Field1>"  +
			                    "<Name>Table</Name>" +
						        "<DataType>Double</DataType>" +
			                    "<Size>2500</Size>" +
						        "<Precision>4</Precision>" +
			                    "</Field1>";
		FieldDefineParser parser = new FieldDefineParser();
				
		//Act
		Table actual = parser.parse(FieldDefineStr);
				
		//Assert
		assertEquals("Table",actual.getName());
		assertEquals("Double",actual.getDataType());
		assertEquals(2500,actual.getSize());
	    assertEquals(4,actual.getPrecision());
		        
	}

}
