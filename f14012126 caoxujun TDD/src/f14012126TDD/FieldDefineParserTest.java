package f14012126TDD;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author CAO
 *
 */

public class FieldDefineParserTest {

	@Test
	public void shouldParseRecordDefineToRecord() throws Exception {
		String recordDefineStr = "<Records>" + "<Record0>" + "<field1>23333</field1>" + "<field2>23</field2>"
				+ "</Record0>" + "<Record1>" + "<field1>hhhh</field1>" + "<field2>666</field2>" + "</Record1>"
				+ "</Records>";
		RecordDefineParser paser = new RecordDefineParser();
		// Act
		Table actual = paser.parse(recordDefineStr);

		// Assert
		assertEquals("23333", actual.getField1InRecord0());
		assertEquals(23, actual.getField2InRecord0());

		assertEquals("hhhh", actual.getField1InRecord1());
		assertEquals(666, actual.getField2InRecord1());
	}
}
