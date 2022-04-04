package by.academy.tr.customer;

public class Market {
	private String marketName;
	private Customer[] customersList;

	public Market(String marketName, Customer[] customersList) {
		this.marketName = marketName;
		this.customersList = customersList;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setCustomersList(Customer[] customersList) {
		this.customersList = customersList;
	}

	public Customer[] getCustomersList() {
		return customersList;
	}
}
