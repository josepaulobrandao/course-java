package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaSequencial_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		double largura = scanner.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		double comprimento = scanner.nextDouble();
		
		System.out.println("Digite o metro quadrado: ");
		double metroQuadrado = scanner.nextDouble();
		
		double area  = largura * comprimento;
		double calcPreco = metroQuadrado * area;
		
		
		System.out.printf("O resultado �: %.2f ", area);
		System.out.printf("O pre�o da terreno � :%.2f", calcPreco);
		
		
		scanner.close();
		
	}

}
