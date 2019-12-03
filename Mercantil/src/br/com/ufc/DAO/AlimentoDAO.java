package br.com.ufc.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.Model.Alimento;
import br.com.ufc.Model.Produto;

public class AlimentoDAO{
	
	
	private List<Alimento> alimentos;
	
	
	
	public AlimentoDAO() {
		this.alimentos=new ArrayList<Alimento>();
		
	}



	
	public void adicionar(Alimento produto) {
		this.alimentos.add(produto);
		
	}



	
	public String remover(String produto) {
		for(Alimento alimento1: this.alimentos) {
			if(alimento1.getNome().equals(produto)) {
				this.alimentos.remove(alimento1);
				return "Produto excluido com sucesso";
			}
			
		}
		return"Você não possui esse produto cadastrado nessa categoria";
	


		
	}



	
	public Alimento comprar(String alimento) {
		for(int i=0;i<this.alimentos.size();i++) {
			if(this.alimentos.get(i).getNome().equals(alimento) && this.alimentos.get(i).getQuantidade()>0){
				this.alimentos.get(i).reduzir();;
				return this.alimentos.get(i);
			}
		}
		return null;
		
		
	}
	public void devolver(String alimento) {
		for(int i=0;i<this.alimentos.size();i++) {
			if(this.alimentos.get(i).getNome().equals(alimento)){
				this.alimentos.get(i).aumentar();;
				break;
				
			}
		}
	}
		
	
	public void listar() {
		for(int i=0;i<this.alimentos.size();i++) {
			System.out.println(alimentos.get(i).toString());
		
	}
	

	}

	
	public String consultar(String nome) {
		for(Alimento alimento1:this.alimentos) {
			if(alimento1.getNome().equals(nome)) {
				return"Já possui esse produto alimento cadastrado";
				
				
			}
			
			
			
			
			
		}
		
		return"";
	}
	
	
	
	public String consultar1(String nome) {
		for(Alimento alimento1:this.alimentos) {
			if(alimento1.getNome().equals(nome)) {
				return "Nome: "+alimento1.getNome()+" Preço: "+alimento1.getPreço()+" Quantidade: "+alimento1.getQuantidade();
				
				
			}
			
			
			
			
			
		}
		
		return"Não possui esse produto cadastrado ";
	}


	



	
}
