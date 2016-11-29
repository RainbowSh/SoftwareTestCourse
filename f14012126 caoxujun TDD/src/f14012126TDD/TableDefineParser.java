package f14012126TDD;

import nu.xom.Element;
import nu.xom.Elements;

public class TableDefineParser {
	public Table parse(String TableDefineStr) {
		Table table = new Table(TableDefineStr);
		return table;
	}
}