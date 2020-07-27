package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaSequencial_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double raio = scanner.nextDouble();
		double area = scanner.nextDouble();
		final double PI = 3.1416;
		
		
	    area = PI * Math.pow(raio, 2);
	    System.out.printf("Area =%2.4f", area);	
		System.out.println("Bom dia");
		scanner.close();
		
	}

}
