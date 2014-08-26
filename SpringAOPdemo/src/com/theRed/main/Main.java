package com.theRed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.theRed.classes.Bike;
import com.theRed.classes.Motobike;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Motobike motobike = (Motobike) context.getBean("moto");
		Bike bike = (Bike) context.getBean("bike");
		motobike.run();
		bike.run();
	}

}
