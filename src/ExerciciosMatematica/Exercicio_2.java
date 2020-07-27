package ExerciciosMatematica;

import java.util.Locale;
import java.util.Scanner;

import util.Questao_2;

public class Exercicio_2 {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner(System.in);

	
	 System.out.println("Digite o comprimento: ");
	 Questao_2.comprimento =  scanner.nextDouble();  
	 
	 System.out.println("Digite a largura: ");
	 Questao_2.largura =  scanner.nextDouble();
	 
	 System.out.println("Digite a altura: ");
	 Questao_2.altura = scanner.nextDouble();
	
	 System.out.println(Math.sqrt((Questao_2.calculo1())));
	
	
	scanner.close();
		
		
		
	}

}
