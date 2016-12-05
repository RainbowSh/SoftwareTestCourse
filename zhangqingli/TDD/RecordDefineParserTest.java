package edu.shanda.testcourse.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecordDefineParserTest {

	@Test
	public void shouldTestRecordDefineParser() throws Exception{
		//Arrangement
		String RecordDefineStr = "<Records>" +
		                             "<Field1>" +
				                        "<Name>NewTable</Name>" +
							            "<DataType>String</DataType>" +
				                        "<Size>800</Size>" +
					                    "<Precision>5</Precision>" +
				                     "</Field1>"+
					                 "<Field2>"+
				                        "<Name>TableField</Name>" +
					                    "<DataType>Char</DataType>" +
				                        "<Size>600</Size>" +
					                    "<Percision>3</Percision>" +
				                     "</Field2>";
		RecordDefineParser parser = new RecordDefineParser();
		
		
		//act
		Table real = parser.parse(RecordDefineStr);
		
		//assert
		//<Field1>
		assertEquals("NewTable",real.getFieldName1());
		assertEquals("String",real.getFieldDataType1());
		assertEquals(800,real.getFieldSize1());
		assertEquals(5,real.getFieldPrecision1());
		
		//<Field2>
		assertEquals("TableField",real.getFieldName2());
		assertEquals("Char",real.getFieldDataType2());
		assertEquals(600,real.getFieldSize2());
		assertEquals(3,real.getFieldPercision2());
		
				                     
	}

}
