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
public class FieldDefineParserTest {

	@Test
	public void shouldParseFeildDefineToTable() 
		       throws Exception {
			// Arrangement
			String fieldDefineStr = "<Field1>" +
			                           "<Name>Field</Name>" +
					                   "<DataType>char</DataType>" +
			                           "<Size>10</Size>" +
					                   "<Precision>6<Precision>" +
			                           "</Field1>";
			                          
			                           //act
			FieldDefineParser parser = new FieldDefineParser();
			Table actual =  parser.parse(fieldDefineStr);
			
			//Assert
			assertEquals("Field", actual.getName());
			assertEquals("char", actual.getDataType());
			assertEquals(10, actual.getsize());
			assertEquals(6, actual.getPrecision());
		}


}
