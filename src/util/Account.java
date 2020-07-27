package util;

public class Account {
	private int numerCount;
	private String name;
	public double priceCount;
	public double  Balance;

	public double AddaccountBalance(double AddaccountBalance) {
		return this.Balance += AddaccountBalance;
	}

	public double RemoveccountBalance(double RemoveccountBalance) {
		return this.Balance -= RemoveccountBalance;
	}
	

	public int getNumerCount() {
		return numerCount;
	}

	public String getHolderCount() {
		return name;
	}

	
	public String toString() {
		return name + String.format("%d", numerCount) +" Holder: " + name + "balance" + Balance + ", ";
	}
	
	
	
}
