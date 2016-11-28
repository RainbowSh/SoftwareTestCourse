package f14012126TDD;

public class FieldDefineParser {
	public Table parse(String TableDefineStr) {
		Table table = new Table(TableDefineStr);
		return table;
	}
}