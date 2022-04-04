package by.academy.tr.airline;

public class Airline {
	
	private int flightNumber;
	private String destination;
	private String airplaneType;
	private double departureTime;
	private String departureDay;

	public Airline(int flightNumber, String destination, String airplaneType, double departureTime,
			String departureDay) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.departureDay = departureDay;
	}
	
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
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

	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}

	public String getDepartureDay() {
		return departureDay;
	}

	public String toString() {
		String s = "Номей рейса: " + flightNumber + "  " + destination + " (" + airplaneType + ")\nВремя отправления ["
				+ departureTime + "] День недели: " + departureDay + "\n";
		return s;
	}
}
