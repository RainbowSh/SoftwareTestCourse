/**
 * 
 */
package f14012126TDD;

import static org.junit.Assert.*;

import org.junit.Test;

import nu.xom.Element;

/**
 * @author CAO
 *
 */

public class TableDefinePaserTest {

	@Test
	public void shouldParseTableDefineToTable() throws Exception {
		String tableDefineStr = "<Description>" + "<Name>Table</Name>" + "<FieldCount>4</FieldCount>"
				+ "<RecordCount>2</RecordCount>" + "</Description>";
		TableDefineParser parser = new TableDefineParser();
		// Act
		Table actual = parser.parse(tableDefineStr);

		// Assert
		assertEquals("Table", actual.getName());
		assertEquals(4, actual.getFieldCount());
		assertEquals(2, actual.getRecordCount());
	}
}
