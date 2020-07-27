package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioApplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rectangle with and heigth:");
		double Width = scanner.nextDouble();
		double heigth = scanner.nextDouble();
		
		
		ExercirioProgram program = new ExercirioProgram();
		
		System.out.println("Enter rectangle width and height: ");
		program.Width =  scanner.nextDouble();
		program.Height = scanner.nextDouble();
		
		System.out.printf("AREA =  %.2f%n", program.area());
		System.out.printf("PERIMETER = %.2f%n", program.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", program.diagonal());
		
		scanner.close();
	}
}
