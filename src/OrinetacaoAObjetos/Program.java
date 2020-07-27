package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;
//import OrinetacaoAObjetos.Product;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Emter product data: ");
		System.out.println("Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Price: ");
		double price = scanner.nextDouble();
		
		System.out.println("Quantity int stock: ");
		int quantity = scanner.nextInt();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(24);
		System.out.println("Updated getPrice: " +  product.getPrice());
		
		System.out.println("Updated getQuantity " + product.getQuantity());
		
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the numbero of products to be added in stock: ");
		
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		System.out.println();
		System.out.println("Enter the numbero of products to be removed from  stock: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		
		scanner.close();
	}

}
