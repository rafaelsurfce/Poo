package br.com.animais.model;

public class Mamifero extends Animal {

	
	private String corPelo;
	
	
	
	
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	
	

	@Override
	public void emitirSom() {
		System.out.println("som do mamifero");
	}
	
	
	

	public String getCorPelo() {
		return this.corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
	
	

}
