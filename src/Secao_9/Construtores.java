package Secao_9;

import java.util.Locale;
import java.util.Scanner;
import util.entitnies;

public class Construtores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter pruduct data: ");
		System.out.println("Name: ");
		
		String name = scanner.nextLine();
		System.out.println("Price: ");
		
		double price = scanner.nextDouble();
		System.out.println("Quantity: ");
		
		int quantity = scanner.nextInt();
		
		entitnies productEntitnies =  new entitnies(name, price, quantity);	
		System.out.println(productEntitnies);
		
		
		scanner.close();
		
	}

}
