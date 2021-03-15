package br.com.animais.model;

public class Peixe extends Animal {
	
	private String corEscama;
	
	

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comer substancias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe nao tem som");
		
	}
	
	
	public void soltarBolha() {
		System.out.println("Soltando bolhas!!");
		
	}

	public String getCorEscama() {
		return this.corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
	

}
