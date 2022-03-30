package by.academy.tr.airline;

public class FlightList {
	public static void main(String[] args) {

		Airline a1 = new Airline();
		Airline a2 = new Airline();
		Airline a3 = new Airline();
		Airline a4 = new Airline();
		Airline a5 = new Airline();

		init1(a1);
		init2(a2);
		init3(a3);
		init4(a4);
		init4(a5);
		
		Airline[] array = { a1, a2, a3, a4, a5 };

		sortDestination(array);
		sortWeekdays(array);
		sortDepartureTime(array);
	}

	public static void init1(Airline a1) {
		a1.setFlightNumber(123);
		a1.setDestination("Варшава");
		a1.setAirplaneType("Boeing 737-800");
		a1.setDepartureTime(20.35);
		a1.setWeekdays("Пятница");
	}

	public static void init2(Airline a2) {
		a2.setFlightNumber(234);
		a2.setDestination("Париж");
		a2.setAirplaneType("Airbus А320N");
		a2.setDepartureTime(15.25);
		a2.setWeekdays("Вторник");
	}

	public static void init3(Airline a3) {
		a3.setFlightNumber(345);
		a3.setDestination("Лондон");
		a3.setAirplaneType("Boeing 777-300ER");
		a3.setDepartureTime(14.45);
		a3.setWeekdays("Вторник");
	}

	public static void init4(Airline a4) {
		a4.setFlightNumber(456);
		a4.setDestination("Варшава");
		a4.setAirplaneType("Airbus A320");
		a4.setDepartureTime(02.15);
		a4.setWeekdays("Среда");
	}

	public static void init5(Airline a5) {
		a5.setFlightNumber(567);
		a5.setDestination("Хельсинки");
		a5.setAirplaneType("Boeing 777-300ER");
		a5.setDepartureTime(23.15);
		a5.setWeekdays("Воскресенье");
	}

	// список рейсов для заданного пункта назначения;

	public static void sortDestination(Airline[] array) {
		System.out.println("Список рейсов в Варшаву:");

		for (int i = 0; i < array.length; i++) {
			if (array[i].getDestination() == "Варшава") {
				System.out.println(array[i].toString());
			}
		}
	}

	// список рейсов для заданного дня недели;

	public static void sortWeekdays(Airline[] array) {
		System.out.println("Список рейсов во вторник:");

		for (int i = 0; i < array.length; i++) {
			if (array[i].getWeekdays() == "Вторник") {
				System.out.println(array[i].toString());
			}
		}
	}

	// список рейсов для заданного дня недели, время вылета для которых больше
	// заданного.

	public static void sortDepartureTime(Airline[] array) {
		System.out.println("Список рейсов во вторник после 15.00 :");

		for (int i = 0; i < array.length; i++) {
			if (array[i].getWeekdays() == "Вторник" && array[i].getDepartureTime() > 15.00) {
				System.out.println(array[i].toString());
			}
		}
	}
}
