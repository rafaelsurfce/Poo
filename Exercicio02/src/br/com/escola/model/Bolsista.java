package br.com.escola.model;

public class Bolsista extends Aluno{
	private int bolsa;
	
	
	public void pagarMensalidade() {
		System.out.println("Aluno é bolsista, Bolsa renovada!");
		
		
	}


	public int getBolsa() {
		return this.bolsa;
	}


	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

}
