package estruturaCondicional;

import java.util.Scanner;

public class Exercicio_4_v2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int horaInical = scanner.nextInt();
		int horaFinal = scanner.nextInt();

		int duracao;

		if (horaInical < horaFinal) {
			duracao = horaInical + horaFinal;

		} else {
			duracao = 24 - horaInical + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao  +  " HORAS(S)");

		scanner.close();

	}
}
