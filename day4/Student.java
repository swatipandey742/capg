package com.cpg.day4;

class Name{
	int id;
	String name;
	String address;
	
	
public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

public static void main(String[]args) {
		Name raj=new Name();
		raj.setAddress(null);
		System.out.println(raj.getAddress());
	}
}
	
		
