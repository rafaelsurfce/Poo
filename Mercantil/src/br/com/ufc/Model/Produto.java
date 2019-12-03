package br.com.ufc.Model;

import java.util.Date;

public abstract class Produto {
	private String nome;
	private String dataDeFabricacao;
	private String dataDeVencimento;
	private int quantidade;
	private double preço;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeFabricacao() {
		return dataDeFabricacao;
	}
	public void setDataDeFabricacao(String dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	public String getDataDeVencimento() {
		return dataDeVencimento;
	}
	public void setDataDeVencimento(String dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public void reduzir() {
		this.quantidade -=1;
		
	}
	
	public void aumentar() {
		this.quantidade +=1;
		
	}
	
	
	public String toString() {
		
		return "Nome: " + this.nome+" Preço: "+this.preço+" Quantidade: "+this.quantidade;
		
	}
	
	
	
	

}
