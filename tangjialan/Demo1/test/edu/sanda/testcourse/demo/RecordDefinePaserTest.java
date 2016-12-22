package edu.sanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecordDefinePaserTest {

	@Test
	public void shouldParseRecordDefineToTable() throws Exception {
		// Arrangement
		String recordDefineStr = "<Field1>" + 
		                        "<Name>Record</Name>" + 
				                "<DataType>int</DataType>" +
				                "<Size>2</Size>" + 
				                "<Precision>2</precision>"+
				                "</Field1>";
		RecordDefineParser parser = new RecordDefineParser();

		// Act
		Table actual = parser.parser(recordDefineStr);
		// Assert
		assertEquals("Record", actual.getrecordNmae());
		assertEquals("int", actual.getrecordDataType());
		assertEquals(2, actual.getrecordSize());
		assertEquals(2,actual.getrecordprecision());

	}
}
