/**
 * 
 */
package howrk.f14012206.chen.test;

import static org.junit.Assert.*;

import org.junit.Test;

//import edu.f14012206.test.Tab.Exception;
//import edu.f14012206.test.Tab.String;
//import edu.f14012206.test.Tab.Table;
//import edu.f14012206.test.Tab.TableDefineParser;

import org.junit.Test;
/**
 * @author chenmengting
 *
 */
public class TableDefineParserTest {

	@Test
	public void shouldParseTableDefineToTable() 
	       throws Exception {
		// Arrangement
		String tableDefineStr = "<Description>" +
		                           "<Name>Table</Name>" +
				                   "<FieldCount>4</FieldCount>" +
		                           "<RecrdCount>2</RecordCount>" +
		                           "</Description>";
		                          
		                           //act
		TableDefineParser parser = new TableDefineParser();
		Table actual = parser.parse(tableDefineStr);
		
		//Assert
		assertEquals("Table", actual.getName());
		assertEquals(4, actual.getFieldCount());
		assertEquals(2, actual.getRecordCount());
	}

}
