package by.academy.tr.airline;

public class Airport {
	
	private String airportName;
	private Airline[] airlinesList;
	
	public Airport (String airportName, Airline[] airlinesList) {
		this.airportName = airportName;
		this.airlinesList = airlinesList;		
	}
	
	public void setAirportName (String airportName) {
		this.airportName = airportName;
	}
	
	public String getAirportName () {
		return airportName;
	}
	
	public void setAirline(Airline [] airlinesList){
		this.airlinesList = airlinesList;
	}
	
	public Airline[] getAirline(){
		return airlinesList;
	}
}
