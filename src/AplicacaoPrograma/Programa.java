package AplicacaoPrograma;

import java.util.Locale;
import java.util.Scanner;

import Aplicacao.Produto;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Price: ");
		double price = scanner.nextDouble();
		
		
		System.out.println("Quantitiy int estock: ");
		int quantity = scanner.nextInt();
		
		Produto produto = new Produto(name, price);
		
		produto.setName("Valor com setName: ");
		System.out.println("Updated name setName: " + produto.getName());
		
		produto.setPrice(232323);
		System.out.println("Updated price getPrice: " +  produto.getPrice());
		
		System.out.println("Product data: " + produto);
		System.out.println();
		System.out.println("Enter the numer of products in staock: "  ); 
		
		quantity = scanner.nextInt();
		produto.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		
		
		scanner.close();
		
	}

}