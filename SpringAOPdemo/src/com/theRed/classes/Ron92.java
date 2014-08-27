package com.theRed.classes;

public class Ron92 implements Fuel {

	@Override
	public String in() {
		return "Fill with Ron 92";
	}

	@Override
	public void throwExceptionFuelIn() throws Exception {
		System.out.println("Ron 92 is getting in, but somethings wrong");
		throw new Exception("Ron 92 get in error");
	}
}
