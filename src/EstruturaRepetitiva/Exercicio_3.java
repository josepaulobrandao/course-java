package EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;

		int tipo = scanner.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				tipo += 1;
			} else if (tipo == 2) {
				tipo += 1;
			} else if (tipo == 3) {
				tipo += 1;
			} 
			tipo = scanner.nextInt();
		}
		
		
		System.out.println("MUITO O BRIGADO");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		
		scanner.close();
	}
	
	

}
