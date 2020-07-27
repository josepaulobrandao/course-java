package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciEstruturaSequencia_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("O valor da diferença é : " + diferenca);
		scanner.close();
	}

}
