package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3_v2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int valorA = scanner.nextInt();
		int valorB =  scanner.nextInt();
		
		if(valorA % valorB == 0 || valorB % valorA == 0 ) {
			System.out.println("Os valores são multiplos");
		}
		else  {
			System.out.println("Não são multiplos");
		}
		
		System.out.println("Fim");
		scanner.close();
		
	}

}
