package ProgramInStrock;

import java.util.Locale;
import java.util.Scanner;
import ProgramInstock.Product;


public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Product product = new Product();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter for data: ");
		System.out.println("Enter for Name: ");
		product.name = scanner.nextLine();
		System.out.println("Enter for price: ");
		product.price = scanner.nextDouble();
		System.out.println("Enter for quantity: ");
		product.quantity = scanner.nextInt();
		
		System.out.println();
		System.out.println("Product date: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in strock: ");
		int quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from strock: ");
		quantity =  scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data" + product);
		
		scanner.close();
	}

}
