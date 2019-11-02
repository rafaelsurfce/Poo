package br.com.ufc.Model;

public class Gerente extends Funcionario implements Alocador{
	
	private Projeto projeto;
	
	public double salarioTotal() {
		return this.getSalario() +(getSalario()*0.5);
		
	}

	
	public void alocarProgramador(Projeto projeto, Programador programador)
	{
		if(this.projeto.equals(projeto)) {
		projeto.alocarProgramador(programador,projeto);
		}
		
		else 
		{
		System.out.println("Voce não é gerente desse projeto");	
			
		}
	}
		
		
	

	
	public void demitirProgramador(Projeto projeto, Programador programador)
	{
		if(this.projeto.equals(projeto)) {
			projeto.demitirProgramador(programador, projeto);
		}
		else 
		{
		System.out.println("Voce não é gerente desse projeto");	
			
		}
				
	}

	
	public void alocarPesquisador(Projeto projeto, Pesquisador pesquisador) {
		
		if(this.projeto.equals(projeto)) {
			projeto.alocarPesquisador(pesquisador, projeto);
		}
		else 
		{
		System.out.println("Voce não é gerente desse projeto");	
			
		}
		
	}

	@Override
	public void demitirPesquisador(Projeto projeto, Pesquisador pesquisador) {
		if(this.projeto.equals(projeto)) {
			projeto.demitirPesquisador(pesquisador, projeto);
		}
		else 
		{
		System.out.println("Voce não é gerente desse projeto");	
			
		}
	}


	public Projeto getProjeto() {
		return this.projeto;
	}


	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
	public String toString() {
		 return this.getNome();
		
	}
	
	
	

}
