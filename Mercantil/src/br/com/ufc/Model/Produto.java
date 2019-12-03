package br.com.ufc.Model;

import java.util.Date;

public abstract class Produto {
	private String nome;
	private String dataDeFabricacao;
	private String dataDeVencimento;
	private int quantidade;
	private double pre�o;
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
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public void reduzir() {
		this.quantidade -=1;
		
	}
	
	public void aumentar() {
		this.quantidade +=1;
		
	}
	
	
	public String toString() {
		
		return "Nome: " + this.nome+" Pre�o: "+this.pre�o+" Quantidade: "+this.quantidade;
		
	}
	
	
	
	

}
