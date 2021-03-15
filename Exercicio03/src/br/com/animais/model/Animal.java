package br.com.animais.model;

public abstract class Animal {
	private double peso;
	private int idade;
	private int menbros;
	
	
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMenbros() {
		return this.menbros;
	}
	public void setMenbros(int menbros) {
		this.menbros = menbros;
	}
	
	
	

}
