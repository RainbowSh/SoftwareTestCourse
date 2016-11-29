package f14012126TDD;

public class Table {
	String RableDefineString;

	public Table(String TableDefineString) {
		this.RableDefineString = TableDefineString;
	}

	public String getInnerContent(String Label, String XmlString) {
		int BeginIndex = XmlString.indexOf("<" + Label + ">");
		int EndIndex = XmlString.indexOf("</" + Label + ">");
		BeginIndex += ("<" + Label + ">").length();
		String InnerContent = XmlString.substring(BeginIndex, EndIndex);
		return InnerContent;
	}

	public String getName() {
		return getInnerContent("Name", RableDefineString);
	}

	public int getFieldCount() {
		return Integer.parseInt(getInnerContent("FieldCount", RableDefineString));
	}

	public int getRecordCount() {
		return Integer.parseInt(getInnerContent("RecordCount", RableDefineString));
	}

	public String getNameInField1() {
		return getInnerContent("Name", getInnerContent("Field1", RableDefineString));
	}

	public String getDataTypeInField1() {
		return getInnerContent("DataType", getInnerContent("Field1", RableDefineString));
	}

	public int getSizeInField1() {
		return Integer.parseInt(getInnerContent("Size", getInnerContent("Field1", RableDefineString)));
	}

	public int getPrecisionInField1() {
		return Integer.parseInt(getInnerContent("Precision", getInnerContent("Field1", RableDefineString)));
	}

	public String getNameInField2() {
		return getInnerContent("Name", getInnerContent("Field2", RableDefineString));
	}

	public String getDataTypeInField2() {
		return getInnerContent("DataType", getInnerContent("Field2", RableDefineString));
	}

	public int getSizeInField2() {
		return Integer.parseInt(getInnerContent("Size", getInnerContent("Field2", RableDefineString)));
	}

	public int getPrecisionInField2() {
		return Integer.parseInt(getInnerContent("Precision", getInnerContent("Field2", RableDefineString)));
	}

	public String getField1InRecord0() {
		return getInnerContent("field1", getInnerContent("Record0", RableDefineString));
	}

	public int getField2InRecord0() {
		return Integer.parseInt(getInnerContent("field2", getInnerContent("Record0", RableDefineString)));
	}

	public String getField1InRecord1() {
		return getInnerContent("field1", getInnerContent("Record1", RableDefineString));
	}

	public int getField2InRecord1() {
		return Integer.parseInt(getInnerContent("field2", getInnerContent("Record1", RableDefineString)));
	}

}
