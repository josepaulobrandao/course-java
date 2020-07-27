package util;

public class Questao_1 {
	public double altura;
	public double largura;
	public double comprimento;

	public double calculo1 () {
		double resultado1 = 
				(this.altura  *= this.altura )
			  + (this.largura *= this.largura)
			  + (this.comprimento *= this.comprimento);
		return resultado1;
				
	}
}
