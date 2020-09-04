package Aplicacao_Funcionario;

import java.sql.Date;
import java.util.Calendar;

public class Funcionario {
	private String name;
	private Double salario;
	private String endereco;
	private Date data_nascimento;
	private Double bonus;

	public Funcionario() {

	}

	public Funcionario(String name, Double salario, String endereco, Date data_nascimento, Double bonus) {

		this.name = name;
		this.salario = salario;
		this.endereco = endereco;
		this.data_nascimento = data_nascimento;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	public double retornarGanhos() {
		return bonus * 1.5;
	}
	
	public void calcularIdade () {
		Calendar cal = Calendar.getInstance();
	}
 	
	public void complementaEndereco() {
		
	}

}
