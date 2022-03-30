package by.academy.tr.customer;

import java.util.Arrays;

public class Market {
	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Иванов И.И.", "Коралловая, 12", "9653675445329071", "12421343252350");
		Customer c2 = new Customer(102, "Петров П.П.", "Жемчужная, 89", "1683675345329034", "91863950302876");
		Customer c3 = new Customer(103, "Андреев А.А.", "Рубиновая, 4", "5682175340029033", "41863956728001");
		Customer c4 = new Customer(104, "Кириллов К.К.", "Алмазная, 9", "4688658720029114", "01861321228009");
		Customer c5 = new Customer(105, "Сергеев С.С.", "Сапфировая,6", "7682175340029033", "01861321228009");

		Customer[] array = { c1, c2, c3, c4, c5 };

		sortName(array);

		sortCreditCard(array);
	}

	// список покупателей в алфавитном порядке

	public static void sortName(Customer[] array) {
		String[] arrayName = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayName[i] = array[i].getName();
		}

		Arrays.sort(arrayName);

		System.out.println(Arrays.toString(arrayName));
	}

	// список покупателей, у которых номер карточки находится в заданном интервале

	public static void sortCreditCard(Customer[] array) {
		for (int i = 0; i < array.length; i++) {
			long a = Long.parseLong(array[i].getCreditCard());
			if (a > 4000000000000000L && a < 8000000000000000L) {
				System.out.println(array[i]);
			}
		}
	}
}
