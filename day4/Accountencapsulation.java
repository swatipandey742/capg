package com.cpg.day4;

class Cx{
	private int acc_no;
	private String name;
	private String email;
	
	

	public Cx(int acc_no, String name, String email) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.email = email;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
	}


public class Accountencapsulation {
	public static void main(String[]args) {
		Cx raj=new Cx(455533,"Anu","xyz");
		System.out.println(raj.getAcc_no());
		System.out.println(raj.getName());

		
	

		
		
		
	}

}
