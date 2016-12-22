package edu.sanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldDefinePaserTest {

	@Test
	public void shouldParseFieldDefineToTable() throws Exception {
		// Arrangement
		String fieldDefineStr = "<Field1>" + 
		                        "<Name>Field</Name>" + 
				                "<DataType>int</DataType>" +
				                "<Size>2</Size>" + 
				                "<Precision>2</precision>"+
				                "</Field1>";
		FieldDefineParser parser = new FieldDefineParser();

		// Act
		Table actual = parser.parser(fieldDefineStr);
		// Assert
		assertEquals("Field", actual.getFieldNmae());
		assertEquals("int", actual.getDataType());
		assertEquals(2, actual.getSize());
		assertEquals(2,actual.getprecision());

	}
}
