package br.com.escola.model;

public abstract class Pessoa {
	
	private String Nome;
	private int idade;
	private String Sexo;
	
	
	public void fazerAniver() {	
		this.idade++;
		}
	

	public String getNome() {
		return this.Nome;
	}


	public void setNome(String nome) {
		this.Nome = nome;
	}


	public int getIdade() {
		return this.idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return this.Sexo;
	}


	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}


	@Override
	public String toString() {
		return "Nome: " + this.Nome +"\n"+ "Idade: " + this.idade + "\n"+"Sexo: " + this.Sexo+ "\n" ;
	}

	
	
	
	
	
	
}
