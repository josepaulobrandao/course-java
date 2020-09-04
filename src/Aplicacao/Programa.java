package Aplicacao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import Aplicacao_Funcionario.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario func = new Funcionario();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o nome: ");
		String nome = scanner.nextLine();
		System.out.println("Entre com o salario: ");
		Double salario = scanner.nextDouble();
		System.out.println("Entre com o endereco: ");
		String complementaEndereco = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Ano nascimento: ");
	
		Double calcularIdade = scanner.nextDouble();
		
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salario);
		System.out.println("Complementa Endereço: " + complementaEndereco);
		System.out.println("idade real é " +  func.getData_nascimento());
		scanner.close();

	}

}
