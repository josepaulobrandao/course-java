package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		String s1, s2, s3;
		int x;

		x = scanner.nextInt();
		s1 = scanner.nextLine();
		s2 = scanner.nextLine();
		s3 = scanner.nextLine();

		System.out.println("DADOS DIGITADOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scanner.close();

	}

}
