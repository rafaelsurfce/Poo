package br.com.ufc.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Programador extends Funcionario implements MetodosAlteradorProgramador{
	
	private Projeto projeto;
	private List<String> linguagens;
	
	
	
	public Programador() {
		this.linguagens= new ArrayList<String>();
	}
	
	
	
	
	
	
	public double salarioTotal() {
		 return this.getSalario() + (getSalario()*0.3);
	}


	public Projeto getProjeto() {
		return this.projeto;
	}


	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
	public void programar() {
		if(this.projeto!=null) {
			System.out.println("Programador programando no projeto "+this.projeto);
			
		}
		
		else {
			System.out.println("Programador não está alocado a nenhum projeto ");
			
		}
	}






	@Override
	public void cadastrar(String linguagem) {
	
		if(!this.linguagens.contains(linguagem)) {
			this.linguagens.add(linguagem);
			
			System.out.println("Linguagem "+linguagem+" adicionada com sucesso");
		}
		else {
			System.out.println("Programador já possui essa linguagem ");
		}
		
		}






	@Override
	public void excluir(String linguagem) {
		
		 {
			if(this.linguagens.contains(linguagem)) {
				this.linguagens.remove(linguagem);
				System.out.println("Linguagem "+linguagem+" Removida com sucesso");
			}
			else {
				System.out.println("Programador não possui essa linguagem ");
			}
			
			
			
		}
		
	}






	@Override
	public void listar() {
		for(int i=0;i<this.linguagens.size();i++) {
			System.out.println("Linguagem "+ i +" "+this.linguagens.get(i));
			
			
		}
		
	}
	
	

}
