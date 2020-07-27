package Aplicacao;

public class Produto {

	private String name;
	private double price;
	private int quantity;

	public Produto() {

	}

	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public Produto(String name, double price) {
		this.name = name;
		this.price = price;

	}
	
	 

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	public double totalValueInStock( ) {
		return price* quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -=  quantity;
	}
	
	public String toString() {
		return name + ", $ " 
	   + String.format("%.2f", price) 
	   + ", " + quantity + "units, total: $ " 
	   + String.format("%.2f", totalValueInStock());
 	}

}
