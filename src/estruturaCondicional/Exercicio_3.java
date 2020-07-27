package estruturaCondicional;

//import java.util.Locale;
//import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		tabuada(7);
		tabuada(8);
		direitos();
	}

	public static void tabuada(int n) {
		int i;

		System.out.printf("+--Resultado--+\n");
		for (i = 1; i <= 10; i++) {
			System.out.printf("| %2d * %d = %2d |\n", i, n, (i * n));
		}
		System.out.printf("+-------------+\n\n");
	}

	public static void direitos() {
		System.out.printf("Copyright (C)Prof. Omero Francisco Bertol.\n");
	}

}
