package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;
// Resolução -  https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
public class Exercicio_7_v2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double x, y;
		
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q4");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		
		scanner.close();
	}

}
