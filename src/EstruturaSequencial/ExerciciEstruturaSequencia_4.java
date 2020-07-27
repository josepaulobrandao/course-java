package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciEstruturaSequencia_4 {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
	Scanner scanner = new Scanner (System.in);
	
	int NumeroFuncionario;
	int HoraTrabalhada; 
	double ValorHoraTrabalhada;
	double salario;
	
	NumeroFuncionario =  scanner.nextInt();
	ValorHoraTrabalhada =  scanner.nextDouble();
	HoraTrabalhada 	=  scanner.nextInt();
	
	 salario = NumeroFuncionario * ValorHoraTrabalhada;
	
	 System.out.println("Numero =" + NumeroFuncionario);
	 System.out.printf("Salario %.2f", salario);
	
	
	
	
	
	scanner.close();
	}

}
