package br.com.ufc.Model;

import java.util.ArrayList;
import java.util.List;

public class Pesquisador extends Funcionario implements MetodoAlteradorPesquisador {
	
	
	private Projeto projeto;
	private List<String>areas;
	
	
	public Pesquisador() {
		this.areas=new ArrayList<String>();
	}
	
	public double salarioTotal() {
		return this.getSalario() + (getSalario()*0.7);
		
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
	
	public void pesquisar() {
		if(this.projeto!=null) {
			System.out.println("Pesquisador pesquisando no projeto "+this.projeto);
			
		}
		else {
			System.out.println("Pesquisador não está alocado a nenhum projeto ");
		}
		
	}

	@Override
	public void cadastrar(String area) {
		if(!this.areas.contains(area)) {
			this.areas.add(area);
			
			System.out.println("Area de estudo "+area+" adicionada com sucesso");
		}
		else {
			System.out.println("Pesquisador já possui essa area ");
		}
		
		
	}

	@Override
	public void excluir(String area) {
		

		if(this.areas.contains(area)) {
			this.areas.remove(area);
			System.out.println("Area de estudo "+area+" Removida com sucesso");
		}
		else {
			System.out.println("Pesquisador não possui essa area ");
		}
	}

	@Override
	public void listar() {
		
		for(int i=0;i<this.areas.size();i++) {
			System.out.println("Area de estudo "+ i +" "+this.areas.get(i));
		
	}

}
}
