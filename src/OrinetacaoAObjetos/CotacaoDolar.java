package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

import util.CurrentConverter;

public class CotacaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cota��o do d�lar? R$: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quantos d�lares voc� deseja comprar? U$$: ");
		double quantosDolares = sc.nextDouble();
		
		System.out.printf("Valor que ser� gasto R$: %.2f%n", CurrentConverter.ConverterMoeda(precoDolar, quantosDolares));
		
                sc.close();
	}

}
