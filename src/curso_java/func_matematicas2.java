package curso_java;

public class func_matematicas2 {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.09;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		// A = Math.sqrt(x)--variavel A recebe a raiz quadrada de x
		System.out.println("A raiz quadrada de " + x + " = " + A);
		System.out.println("A raiz quadrada de " + y + " = " + B);
		System.out.println("A raiz quadrada de " + " = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 3.0);
		C = Math.pow(4.4, 5.3);
		// A = Math.pow(x, y)--variavel A recebe o resultado de x elevado a y

		System.out.println(x + "Elevado a " + y + "=" + A);
		System.out.println(x + "Elevado ao quadrado =" + B);
		System.out.println(x + "Elevado a = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		// A = Math.abs(x)-- Variavel A recebe o valor absoluto de x

		System.out.println(" O valor absolute de " + y + "=" + A);
		System.out.println(" O valor absolute de " + z + "=" + B);

		System.out.println();

	}

}
