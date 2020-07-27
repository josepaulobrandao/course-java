package Secao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Employee;

public class ProgramList {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will  be registered? ");
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("id: ");
			Integer id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();

			Employee emp = new Employee(id, name, salary);
			list.add(emp);

		}

		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = scanner.nextInt();//-> tal que .
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		//Integer pos = position(list, idsalary);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
		
			System.out.println("Enter the percentege: ");
			double percente = scanner.nextDouble();
			emp.increaseSalary(percente);

		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(emp);
		}

		scanner.close();
	}
	
//refatoração
	//Essse list abaixo não tem nada a ver com o list do main, por que é outro escopo
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
