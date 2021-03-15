package br.com.escola.model;

public class Professor extends Pessoa{
	private String especialidade;
	private double salario;
	
	
	
	
	public void receberAumento(double aumento) {
		this.salario+= aumento;
		
		
	}

	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return this.salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
