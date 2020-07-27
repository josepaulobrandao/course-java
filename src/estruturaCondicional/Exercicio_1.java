package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o valor: ");
	int numero;
	
	numero = scanner.nextInt();
	
	if (numero < 0) {
		System.out.printf("O numero %s é NEGATIVO", numero);
		
	}else  
		System.out.println("Não negativo");
	
	scanner.close();
	}

}
