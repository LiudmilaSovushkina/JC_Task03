package by.academy.tr.airline;

public class Main {
	public static void main(String[] args) {

		Airline[] airlinesList = new Airline[5];
		airlinesList[0] = new Airline(123, "Варшава", "Boeing 737-800", 20.35, "Пятница");
		airlinesList[1] = new Airline(234, "Париж", "Airbus А320N", 15.25, "Вторник");
		airlinesList[2] = new Airline(345, "Лондон", "Boeing 777-300ER", 14.45, "Вторник");
		airlinesList[3] = new Airline(456, "Варшава", "Airbus A320", 02.15, "Среда");
		airlinesList[4] = new Airline(567, "Хельсинки", "Boeing 777-300ER", 23.15, "Воскресенье");

		sortDestination(airlinesList);
		sortDepartureDay(airlinesList);
		sortDepartureTime(airlinesList);
	}
	
	// список рейсов для заданного пункта назначения;

	public static void sortDestination(Airline[] airlinesList) {
		System.out.println("Список рейсов в Варшаву:");

		for (int i = 0; i < airlinesList.length; i++) {
			String city = airlinesList[i].getDestination();
			if (city.equals("Варшава")) {
				System.out.println(airlinesList[i].toString());
			}
		}
	}

	// список рейсов для заданного дня недели;

	public static void sortDepartureDay(Airline[] airlinesList) {
		System.out.println("Список рейсов во вторник:");

		for (int i = 0; i < airlinesList.length; i++) {
			String day = airlinesList[i].getDepartureDay();
			if ( day.equals("Вторник")) {
				System.out.println(airlinesList[i].toString());
			}
		}
	}

	// список рейсов для заданного дня недели, время вылета для которых больше
	// заданного.

	public static void sortDepartureTime(Airline[] airlinesList) {
		System.out.println("Список рейсов во вторник после 15.00 :");

		for (int i = 0; i < airlinesList.length; i++) {
			if (airlinesList[i].getDepartureDay() == "Вторник" && airlinesList[i].getDepartureTime() > 15.00) {
				System.out.println(airlinesList[i].toString());
			}
		}
	}
}
