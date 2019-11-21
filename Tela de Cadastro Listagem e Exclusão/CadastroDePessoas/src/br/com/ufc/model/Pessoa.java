
/**  Autor: Rafael Lima Pereira
 * 	Tecnologia em Redes de Computadores	
 * 	Universidade Federal do Ceará
 * 	Programação Orientada a Objetos
 * 	Prof. Julio Martins 
 * 
 * Data de inicio: 09/11/2019
 * Data de Conclusão: 15/11/2019
 * 
 * 
 
 * **/

package br.com.ufc.model;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String toString() {
		return  this.nome+" "+this.cpf+" "+this.idade;
		 
		
	}

	
	
	
	

}
