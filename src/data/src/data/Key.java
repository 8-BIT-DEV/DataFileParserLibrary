package data;

import java.util.ArrayList;

public class Key {
	
	private String name;
	private ArrayList<String> value;
	
	public Key() {
		this.name = "";
		this.value = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addValue(String value) {
		this.value.add(value);
	}
	
}
