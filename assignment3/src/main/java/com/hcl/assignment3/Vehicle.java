package com.hcl.assignment3;


public abstract class Tests {
	public static void main(String[] args) {
		Truck truck=new Truck();
		truck.changeAttribute();
		
	}
}
class Vehicle {
	int vehicleNum;
	String model;
	String manufacturer;
	String color= "white";
}
class Truck extends Vehicle {
	int loadingCapacity = 100;
	public void changeAttribute() {
		this.color="black";
		this.loadingCapacity=200;
		System.out.println("color: "+ this.color+ " loading capacity "+ this.loadingCapacity);
		
	}
}

