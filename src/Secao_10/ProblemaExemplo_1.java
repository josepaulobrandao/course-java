package Secao_10;

import java.util.Locale;
import java.util.Scanner;


public class ProblemaExemplo_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double [] vect = new double [n];
		
		for (int i=0; i < n; i++) {
			vect [i] = scanner.nextDouble();
		}
		System.out.println("IS  VALUE INITIAL VECT " + vect);
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect [i];
		}double avg = sum / n;
		
		System.out.printf("AVARAGE HEIGTH: %.2f%n " , avg);
		scanner.close();
	}

}
