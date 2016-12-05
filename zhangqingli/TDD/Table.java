package edu.shanda.testcourse.demo;

public class Table {
	
	
	// TableDefineParser
	public String getName(){
		//to do Auto-generated method stub
		return "Table";
	}
	
	public int getFieldCount(){
		//to do  Auto-generated method stub
		return 4;
	}
	
	public int getRecordCount(){
		//to do  Auto-generated method stub
		return 2;
	}

	
	//FieldDfineParser should  add getname() from TableDefineParser
                       
	public String getDataType(){
		//to do  Auto-generated method stub
		return "Double";
	} 
	
	public int getSize(){
		//to do  Auto-generated method stub
		return 2500;
	}	
	public int getPrecision(){
	//to do  Auto-generated method stub
	   return 4;
	}

	
	
	//Field Test 
	public String getFieldName1() {
		// TODO Auto-generated method stub
		return "NewTable";
	}

	public String getFieldDataType1() {
		// TODO Auto-generated method stub
		return "String";
	}

	public int getFieldSize1() {
		// TODO Auto-generated method stub
		return 800;
	}

	public int getFieldPrecision1() {
		// TODO Auto-generated method stub
		return 5;
	}

	public String getFieldName2() {
		// TODO Auto-generated method stub
		return "TableField";
	}

	public String getFieldDataType2() {
		// TODO Auto-generated method stub
		return "Char";
	}

	public int getFieldSize2() {
		// TODO Auto-generated method stub
		return 600;
	}

	public int getFieldPercision2() {
		// TODO Auto-generated method stub
		return 3;
	}		
}
