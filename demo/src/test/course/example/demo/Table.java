package test.course.example.demo;

public class Table {
	private String name;
	private int columnCount;
	private int recordCount;
	
	public Table(String name, int fieldCount, int recordCount) {
		this.setName(name);
		this.setColumnCount(fieldCount);
		this.setRecordCount(recordCount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColumnCount(int fieldCount) {
		this.columnCount = fieldCount;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getColumnCount() {
		return this.columnCount;
	}

}
