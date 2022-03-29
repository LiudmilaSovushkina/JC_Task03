package by.academy.tr.customer;

public class Customer {
	public int id;
	private String name;
	private String address;
	private String creditCard;
	private String accountNumber;

	public Customer(int id, String name, String address, String creditCard, String accountNumber) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.creditCard = creditCard;
		this.accountNumber = accountNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String toString() {
		String string = "";
		string = string + "ID:" + id + " ФИО: " + name + ", адрес: " + address + ", \n№ карты: " + creditCard
				+ ", № счета: " + accountNumber + "\n";
		return string;
	}
}
