package com.bl.oop.polymorphism;

public class Car extends Vehical {
	// defining the same method as in the parent class
	void run() {
		System.out.println("car is running safely");
	}

//	  method overriding
	public static void main(String args[]) {
		Car obj = new Car();
		obj.run();
	}

}
