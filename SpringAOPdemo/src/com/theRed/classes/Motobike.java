package com.theRed.classes;

public class Motobike implements Vehicle {
	@Override
	public void run() {
		System.out.println("Moto is running");
	}

	@Override
	public void addElement(String name) {
		System.out.println(name + " was added");
	}
}
