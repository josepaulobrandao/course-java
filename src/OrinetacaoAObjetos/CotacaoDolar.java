package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

import util.CurrentConverter;

public class CotacaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dólar? R$: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares você deseja comprar? U$$: ");
		double quantosDolares = sc.nextDouble();
		
		System.out.printf("Valor que será gasto R$: %.2f%n", CurrentConverter.ConverterMoeda(precoDolar, quantosDolares));
		
                sc.close();
	}

}
