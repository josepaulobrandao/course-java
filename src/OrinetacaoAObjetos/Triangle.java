package OrinetacaoAObjetos;

public class Triangle {

	public double a;
	public double b;
	public double c;

	//Triangle x, y;
	//x = new Triangle();
	//y = new Triangle();
	//criando umma funcao publica 
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p *(p - a) * (p - b) * (p - c));
	}
}


 