package EstruturaRepetitiva;

import java.util.Scanner;

public class ExercicioWhile_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int senha = scanner.nextInt();
		
		while(senha != 2002) {
			senha = scanner.nextInt();
			System.out.println("Senha invalida");
		}
		scanner.close();
		System.out.println("Senha valida");
	}
	
}
