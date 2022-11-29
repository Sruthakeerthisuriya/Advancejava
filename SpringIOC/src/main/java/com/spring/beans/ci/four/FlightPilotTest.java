package com.spring.beans.ci.four;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlightPilotTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/bean-config/ci/airport/flight-pilot.xml");
		
		Flight f = (Flight) ctx.getBean("flightTwo");
		
		System.out.println(f);

	}

}