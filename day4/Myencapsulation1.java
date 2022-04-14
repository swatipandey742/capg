package com.cpg.day4;

class Bank1{
	private int accno;
	private String add;
	public Bank1(int accno, String add) {
		this.accno = accno;
		this.add = add;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	}
public class Myencapsulation1 {
	public static void main(String[]args) {
		Bank1 B=new Bank1 (56456456,"xyz");
		System.out.println(B.getAccno());
		System.out.println(B.getAdd());

	}
}

