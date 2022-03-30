package by.academy.tr.airline;

public class Airline {

	private int flightNumber;
	private String destination;
	private String airplaneType;
	private double departureTime;
	private String weekdays;

	public Airline() {
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setWeekdays(String weekdays) {
		this.weekdays = weekdays;
	}

	public String getWeekdays() {
		return weekdays;
	}

	public String toString() {
		String s = "Номей рейса: " + flightNumber + "  " + destination + " (" + airplaneType + ")\nВремя отправления ["
				+ departureTime + "] День недели: " + weekdays + "\n";
		return s;
	}
}
