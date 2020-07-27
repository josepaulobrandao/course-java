package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double largura = scanner.nextDouble();
		double comprimento = scanner.nextDouble();
		double metroQuadrado = scanner.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		scanner.close();

	}

}
