package br.com.ufc.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.Model.Alimento;
import br.com.ufc.Model.Limpeza;
import br.com.ufc.Model.Produto;

public class LimpezaDAO {
	
	private List<Limpeza> produtosDeLimpeza;
	
	
	
	public LimpezaDAO() {
		this.produtosDeLimpeza=new ArrayList<Limpeza>();
		
		
	}



	
	public void adicionar(Limpeza produto) {
		this.produtosDeLimpeza.add(produto);
		
	}



	
	public String remover(String produto) {
		for(Limpeza limpeza1: this.produtosDeLimpeza) {
			if(limpeza1.getNome().equals(produto)) {
				this.produtosDeLimpeza.remove(limpeza1);
				return "Produto excluido com sucesso";
			}
			
		}
		return"Você não possui esse produto cadastrado nessa categoria";
		
	}



	
	public String consultar(String nome) {
		for(Limpeza limpeza: this.produtosDeLimpeza) {
			if(limpeza.getNome().equals(nome)) {
				return"Já possui esse produto alimento cadastrado";
				
				
			}
			
			
		}
		return"";
	}
	public String consultar1(String nome) {
		for(Limpeza limpeza1:this.produtosDeLimpeza) {
			if(limpeza1.getNome().equals(nome)) {
				return "Nome: "+limpeza1.getNome()+" Preço: "+limpeza1.getPreço()+" Quantidade: "+limpeza1.getQuantidade();
				
				
			}
			
			
			
			
			
		}
		
		return"Não possui esse produto cadastrado ";
	}



	
	public void listar() {
		for(int i=0;i<this.produtosDeLimpeza.size();i++) {
			System.out.println(produtosDeLimpeza.get(i).toString());
		
	}
		
	}
	
	public Limpeza comprar(String limpeza) {
		for(int i=0;i<this.produtosDeLimpeza.size();i++) {
			if(this.produtosDeLimpeza.get(i).getNome().equals(limpeza)&& this.produtosDeLimpeza.get(i).getQuantidade()>0){
				this.produtosDeLimpeza.get(i).reduzir();;
				return this.produtosDeLimpeza.get(i);
			}
		}
		return null;
		
		
	}
	
	public void devolver(String limpeza) {
		for(int i=0;i<this.produtosDeLimpeza.size();i++) {
			if(this.produtosDeLimpeza.get(i).getNome().equals(limpeza) && this.produtosDeLimpeza.get(i).getQuantidade()>0){
				this.produtosDeLimpeza.get(i).aumentar();;
				break;
				
			}
		}
	}
	
	
	




}
