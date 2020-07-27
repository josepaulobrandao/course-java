package MeusTestes;

import java.util.Locale;
import java.util.Scanner;

import util.Alugem;

public class Exercicios_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = scanner.nextDouble();
		}
		System.out.println("A impressão do vetor é: " + vetor);

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vetor[i];
		}

		double avg = sum / n;
		System.out.printf("O valor de média é:%.2f%n ", avg);

		scanner.close();

	}

}
