package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		EmployeeAplication emp = new EmployeeAplication();
		
		System.out.println("Name: ");
		emp.name =  scanner.nextLine();
		System.out.println("Gross Salary: ");
		emp.GrossSalary =  scanner.nextDouble();
		System.out.println("Tax: ");
		emp.tax = scanner.nextDouble();
		
		System.out.println("Employee: " + emp.name + ", " + emp.GrossSalary );
		System.out.println();
		System.out.println("Which percentage to increment salary ? ");
		double porcentagem = scanner.nextDouble();
		emp.incrementSalary(porcentagem);
		
		System.out.println();
		System.out.println("Upadate data: " + emp);
		
		
		scanner.close();
	
	}
}
