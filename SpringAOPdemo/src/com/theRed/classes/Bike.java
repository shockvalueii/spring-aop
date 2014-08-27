package com.theRed.classes;

public class Bike implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bike is running");
	}

	@Override
	public void addElement(String name) {
		System.out.println(name+ " was added");
	}

}
