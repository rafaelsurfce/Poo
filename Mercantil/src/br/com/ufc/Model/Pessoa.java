package br.com.ufc.Model;

import java.util.Date;

public abstract class Pessoa {
	
	
	private String nome;
	private String dataDeNascimento;
	private String cpf;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return "nome: " +this.nome+" CPF: " +this.cpf;
		
		
	}
	
	
	

}
