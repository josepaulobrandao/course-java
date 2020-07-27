package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codigo;
		double preco;
		String especificacao;
		
//		int numeroRandom = (int) (Math.random() *10);
//		System.out.println(numeroRandom);
		
		for ( codigo = 0; codigo < 6; codigo++) {
			System.out.println(codigo);
		}
		
		
		scanner.close();
	}
}
