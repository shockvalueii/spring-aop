package com.theRed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.theRed.classes.Bike;
import com.theRed.classes.Motobike;
import com.theRed.classes.Ron92;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Motobike motobike = (Motobike) context.getBean("moto");
		Bike bike = (Bike) context.getBean("bike");
		Ron92 ron92 = (Ron92) context.getBean("ron92");
		motobike.run();
		bike.run();
		ron92.in();
	}

}
