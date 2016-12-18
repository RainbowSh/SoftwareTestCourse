package edu.sanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableDefineParserTest {

	@Test
	public void shouldParseTableDefineToTable() throws Exception {
		// Arrangement
		String tableDefineStr = "<Description>" + 
		                        "<Name>Table</Name>" + 
				                "<FieldCount>4</FieldCount>" +
				                "<RecordCount>2</RecordCount>" + 
				                "<Description>";
		TableDefineParser parser = new TableDefineParser();

		// Act
		Table actual = parser.parser(tableDefineStr);
		// Assert
		assertEquals("Table", actual.getNmae());
		assertEquals(4, actual.getFieldCount());
		assertEquals(2, actual.getRecordCount());

	}

}