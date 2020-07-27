package ExerciciosMatematica;

import java.util.Locale;
import java.util.Scanner;

import util.Questao_1;
public class Exercicio_1 {

 public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Questao_1 resultado = new Questao_1();
 Scanner scanner = new Scanner(System.in);
 
 
 System.out.println("Digite o comprimento: ");
 resultado.comprimento =  scanner.nextDouble();  
 
 System.out.println("Digite a largura: ");
 resultado.largura =  scanner.nextDouble();
 
 System.out.println("Digite a altura: ");
 resultado.altura = scanner.nextDouble();
 
 System.out.println(Math.sqrt((resultado.calculo1())));
 scanner.close();
 
	}

}
