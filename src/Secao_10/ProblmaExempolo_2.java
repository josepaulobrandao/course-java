package Secao_10;

import java.util.Locale;
import java.util.Scanner;

import util.ProdutoSecao10;

public class ProblmaExempolo_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt();
		
		ProdutoSecao10 [] vect = new ProdutoSecao10[n];
		
		for (int i = 0; i < vect.length; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			vect[i] = new ProdutoSecao10 (name, price);
		
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVARAGE PRICE = %.2f%n", avg);
		
		scanner.close();
	}

}
