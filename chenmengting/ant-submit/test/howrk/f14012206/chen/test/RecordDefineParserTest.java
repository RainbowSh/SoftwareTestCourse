/**
 * 
 */
package howrk.f14012206.chen.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author chenmengting
 *
 */
public class RecordDefineParserTest {

	@Test
	public void shouldParseRecordDefineToTable() 
		       throws Exception {
			// Arrangement
			String recordDefineStr = "<record1>" +
			                           "<Field1>"+  
			                           "<Name>Record/Name>" +
					                   "<DataType>char</DataType>" +
			                           "<Size>10</Size>" +
					                   "<Precision>6<Precision>" +
			                           "</Field1>"+
					                   "</record1>";
			                          
			                           //act
			RecordDefineParser parser = new RecordDefineParser();
			Table actual =  parser.parse(recordDefineStr);
			
			//Assert
			assertEquals("Record", actual.getrecordName());
			assertEquals("char", actual.getrecordDataType());
			assertEquals(10, actual.getrecordsize());
			assertEquals(6, actual.getrecordPrecision());
		}

}
