package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class excercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		String x;
		int y;
		double z;

		x = scanner.next();
		y = scanner.nextInt();
		z = scanner.nextDouble();

		System.out.printf("Dados digitados %d , %s, %.2f", x, y, z);
		System.out.println();

		scanner.close();

	}

}
