package f14012126TDD;

import static org.junit.Assert.*;

/**
 * @author CAO
 *
 */

import org.junit.Test;

public class RecordDefineParserTest {

	@Test
	public void shouldParseFieldDefineToField() throws Exception {
		String fieldDefineStr = "<FieldDefs>" + "<Field1>" + "<Name>Aiden</Name>" + "<DataType>char</DataType>"
				+ "<Size>5</Size>" + "<Precision>233</Precision>" + "</Field1>" + "<Field2>" + "<Name>IronMan</Name>"
				+ "<DataType>UNKNOW</DataType>" + "<Size>666</Size>" + "<Precision>233</Precision>" + "</Field2>"
				+ "</FieldDefs>";
		FieldDefineParser parser = new FieldDefineParser();
		// Act
		Table actual = parser.parse(fieldDefineStr);

		// Assert
		assertEquals("Aiden", actual.getNameInField1());
		assertEquals("char", actual.getDataTypeInField1());
		assertEquals(5, actual.getSizeInField1());
		assertEquals(233, actual.getPrecisionInField1());

		assertEquals("IronMan", actual.getNameInField2());
		assertEquals("UNKNOW", actual.getDataTypeInField2());
		assertEquals(666, actual.getSizeInField2());
		assertEquals(233, actual.getPrecisionInField2());

	}

}
