package com.spring.beans.ci.four;


public class Flight {
	private String flightNumber;
	private String flightName;
	private Pilot pilot;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	public Flight(String flightNumber, String flightName, Pilot pilot) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.pilot = pilot;
	}
	
	
	public Flight(String flightNumber, String flightName) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
	}
	
	public Flight(Pilot pilot) {
		super();
		this.pilot = pilot;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", pilot=" + pilot + "]";
	}
	
	
	
	
}
