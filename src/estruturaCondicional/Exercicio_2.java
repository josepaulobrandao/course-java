package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

//		Scanner scanner = new Scanner(System.in);

		int numero;
		for (numero = 0; numero < 10 ; numero++)
//		numero = scanner.nextInt();

			if (numero < 0) {
				System.out.printf("O numero %s é IMPAR", numero);
			} else
				System.out.printf("O numero %s é PAR", numero);

		System.out.println("Fim");
//		scanner.close();
	}

}
