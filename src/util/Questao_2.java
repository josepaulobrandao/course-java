package util;

public class Questao_2 {
	public static double altura;
	public static double largura;
	public static double comprimento;
	 
	
	public static double calculo1 () {
		double resultado1 = 
				(altura  	 *= altura )
			  + (largura 	 *= largura)
			  + (comprimento *= comprimento);
		return resultado1;
	}
	
	public  double raizQuadrada () {
		return Math.sqrt(this.calculo1());
	}

}
