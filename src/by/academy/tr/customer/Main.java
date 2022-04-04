package by.academy.tr.customer;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Customer[] customersList = new Customer[5];
		customersList[0] = new Customer(101, "Иванов И.И.", "Коралловая, 12", "9653675445329071", "12421343252350");
		customersList[1] = new Customer(102, "Петров П.П.", "Жемчужная, 89", "1683675345329034", "91863950302876");
		customersList[2] = new Customer(103, "Андреев А.А.", "Рубиновая, 4", "5682175340029033", "41863956728001");
		customersList[3] = new Customer(104, "Кириллов К.К.", "Алмазная, 9", "4688658720029114", "01861321228009");
		customersList[4] = new Customer(105, "Сергеев С.С.", "Сапфировая,6", "7682175340029033", "01861321228009");

		sortName(customersList);

		sortCreditCard(customersList);
	}

	// список покупателей в алфавитном порядке

	public static void sortName(Customer[] customersList) {
		String[] arrayName = new String[customersList.length];
		for (int i = 0; i < customersList.length; i++) {
			arrayName[i] = customersList[i].getName();
		}

		Arrays.sort(arrayName);

		System.out.println(Arrays.toString(arrayName));
	}

	// список покупателей, у которых номер карточки находится в заданном интервале

	public static void sortCreditCard(Customer[] customersList) {
		for (int i = 0; i < customersList.length; i++) {
			long minCardNumber = 4000000000000000L;
			long maxCardNumber = 8000000000000000L;
			long a = Long.parseLong(customersList[i].getCreditCard());
			if (a > minCardNumber && a < maxCardNumber) {
				System.out.println(customersList[i]);
			}
		}
	}
}
