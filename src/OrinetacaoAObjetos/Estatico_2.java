package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Estatico_2 {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Calculator calc =  new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter raidus: ");
		double radius = scanner.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Cricumference: %.2f%n", c); 
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		
		scanner.close();
	}
	


}
