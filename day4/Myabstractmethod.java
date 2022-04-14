package com.cpg.day4;

interface A{
	public void print() ;
}
interface B{
	public void print();
}
class InterfaceImpl implements B
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print from class");
		}
	}
public class Myabstractmethod {
	public static void main (String[]args) {
		InterfaceImpl impl= new InterfaceImpl();
		impl.print();
	}

}
