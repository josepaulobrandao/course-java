package OrinetacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;	
 

public class AlunoProgram {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner(System.in);
	
	Aluno aluno = new Aluno();
	
	aluno.name = scanner.nextLine();
	aluno.grade1 = scanner.nextDouble();
	aluno.grade2 = scanner.nextDouble();
	aluno.grade3 = scanner.nextDouble();
	
	System.out.printf("FINAL GRADE: %.2f POINS %n", aluno.missingPoints());
	
	if (aluno.missingPoints() < 60.0) {
		System.out.println("FILED");
	}else {
		System.out.println("PASS");
	}
	
	scanner.close();
		
	}

}
