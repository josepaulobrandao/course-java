package MeusTestes;
import java.util.Locale;
import java.util.Scanner;

import util.Alugem;

public class Exercicio_teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// quantidade quartos = 10--||
		int n = scanner.nextInt();
		Alugem[] vect = new Alugem[n];
		
		for (int i = 0; i < vect.length; i++) {
			scanner.nextLine();
			String name = scanner.next();
			String email = scanner.next();
			scanner.nextLine();
			//int room = scanner.nextInt();
			scanner.nextLine();
			vect[i] = new Alugem(name, email);
			
			if (vect[i] != null) {
				
				System.out.println("Name " + name);
				System.out.println("Email " + email);
				System.out.println("Room " + n);
			} 
			
			else {
				System.out.println("Quarto vazio" + i);				
			}
			System.out.println("is there an inicial deposit(y / n) ?");
			
			char response = scanner.nextLine().charAt(0);
			if (response =='y') {
				System.out.println("Enter name room: " );
				
				
			}else {
				System.out.println("Busy rooms: " + n);
				
			}
			
			

		}

		scanner.close();
	}


}
