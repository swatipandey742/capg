package com.cpg.day4;

class City{
	//create class variables
	String name ;
	double population;
	// create method of the class 
	public void display() {
		System.out.println("City name:"+name);
		System.out.println("City population:"+population);
}
}

public class Mycityname {
	public static void main(String[]args) {
		City metro1,metro2;
		metro1=new City();
		metro2=new City();
		metro1.name="Kanpur";
		metro1.population=1055225;
		metro1.name="Delhi";
		metro1.population=15564354;
		System.out.println("details of metro1");
		System.out.println("details of metro2");
		metro1.display();
		metro2.display();


		

	}

}
