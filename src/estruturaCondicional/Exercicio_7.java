package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// resolução em https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java

public class Exercicio_7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double intervalo = scanner.nextDouble();
		
		if (intervalo < 0.0 || intervalo > 100.0 ) {
			System.out.println("Fora do intervalo");
		}
		else if (intervalo <= 25.0) {
			System.out.println("Dentro do intervalo [0,25]" );
		}
		else if (intervalo <= 100.00) {
			System.out.println("Dentro do intervalo [0,25]");
		}
		else if (intervalo <= 75.0) {
			System.out.println("Dentro do intervalo [0,25]");
		}
	
		else if (intervalo < 50.0) {
			System.out.println("Fora do intervalo");
		}
		else  {
			System.out.println("Dentro do intervalo [0,56]");
		}
		
		scanner.close();
	}
}
