package EstruturaRepetitiva;

import java.util.Scanner;

//https://www.udemy.com/course/java-curso-completo/learn/lecture/10565940#overview
public class EstruturaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x;
			x = scanner.nextInt();

		}
		System.out.println(soma);
		scanner.close();
	}

}
