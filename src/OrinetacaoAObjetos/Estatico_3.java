package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Estatico_3 {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter raidus: ");
		double radius = scanner.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Cricumference: %.2f%n", c); 
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		
		scanner.close();
	}
	


}
