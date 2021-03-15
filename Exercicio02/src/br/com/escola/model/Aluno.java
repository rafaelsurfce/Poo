package br.com.escola.model;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	
	
	public void cancelarMatricula() {
		System.out.println("Matricula cancelada!");
	}
	
	public void pagarMensalidade() {
		
		System.out.println("Paganado mensalidade do aluno "+ this.getNome());
		
	}



	public int getMatricula() {
		return this.matricula;
	}




	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}




	public String getCurso() {
		return this.curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}
	


}
