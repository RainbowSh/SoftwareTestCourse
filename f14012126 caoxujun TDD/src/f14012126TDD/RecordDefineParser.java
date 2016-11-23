package f14012126TDD;

public class RecordDefineParser {
	public Table parse(String TableDefineStr) {
		Table table = new Table(TableDefineStr);
		return table;
	}
}