package estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		String dia;
		
		
		switch (x) {
		case 1:
			dia ="dommingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sabado";
			break;
		
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println(" O valor do dia " + dia);
		
		scanner.close();
		
		
	}

}
