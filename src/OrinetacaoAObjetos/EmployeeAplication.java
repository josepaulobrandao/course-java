package OrinetacaoAObjetos;

public class EmployeeAplication {
	String name;
	double GrossSalary;
	double tax;
	
	public double netSalary () {
		return GrossSalary - tax;
	}
	

	public void incrementSalary(double porcentagem) {
		GrossSalary += GrossSalary * porcentagem / 100.0;
	}
	
	public String toString () {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
