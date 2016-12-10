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
public class RecordDefineParserTest {

	@Test
	public void shouldParseRecordDefineToTable()
	         throws Exception {
//		Arrangement
		String recordDefineStr = "<Records>" +
                                             "<Record0>" +
                                                 "<field1/>" +
                                                     "<Name>Table</Name>" +
                                                     "<DataType>int</DataType>" +
                                                     "<size>4</size>" +
                                                     "<Precision/>1<Precision>" +
                                                 "</field1>" +
                                              "</Record0>" +
				          "<Records>";
		RecordDefineParser parser = new RecordDefineParser();
		
		String RecordDefineStr = null;
//		Act
		Table actual = parser.parser(recordDefineStr);
//		Assert
		assertEquals("Table",actual.getNmae());
		assertEquals("int",actual.getDataType());
		assertEquals(4,actual.getSize());
		assertEquals(1,actual.getPrecision());
		
		

	}

}
