package edu.uark.dataaccess.repository;

public enum DatabaseTable {
	NONE(""),
	PRODUCT("product"),
	EMPLOYEE("employee");
	//added EMPLOYEE ^ hopefully will somehow connect to employee table.
	public String getLabel() {
		return label;
	}
	
	private final String label;
	
	private DatabaseTable(String label) {
		this.label = label;
	}
}
