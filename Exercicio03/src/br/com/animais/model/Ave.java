package br.com.animais.model;

public class Ave extends Animal {
	
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comer frutas");
		
	}

	@Override
	public void emitirSom() {
		 System.out.println("Som de Ave");
		
	}
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}

	public String getCorPena() {
		return this.corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
	

}
