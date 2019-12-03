package br.com.ufc.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.Model.Higiene;
import br.com.ufc.Model.Limpeza;

public class HigieneDAO {
 private List<Higiene> produtosDeHigiene;
 
 
 
public HigieneDAO() {
	this.produtosDeHigiene= new ArrayList<Higiene>();
	
}

public void adicionar(Higiene produto) {
	this.produtosDeHigiene.add(produto);
	
}



public String remover(String produto) {
	for(Higiene higiene1: this.produtosDeHigiene) {
		if(higiene1.getNome().equals(produto)) {
			this.produtosDeHigiene.remove(higiene1);
			return "Produto excluido com sucesso";
		}
		
	}
	return"Você não possui esse produto cadastrado nessa categoria";
}




public String consultar(String nome) {
	for(Higiene higiene: this.produtosDeHigiene) {
		if(higiene.getNome().equals(nome)) {
			return"Já possui esse produto alimento cadastrado";
			
			
		}
		
		
	}
	return"";
	
}
public String consultar1(String nome) {
	for(Higiene higiene1:this.produtosDeHigiene) {
		if(higiene1.getNome().equals(nome)) {
			return "Nome: "+higiene1.getNome()+" Preço: "+higiene1.getPreço()+" Quantidade: "+higiene1.getQuantidade();
			
			
		}
		
		
		
		
		
	}
	
	return"Não possui esse produto cadastrado ";
}




public void listar() {
	for(int i=0;i<this.produtosDeHigiene.size();i++) {
		System.out.println(produtosDeHigiene.get(i).toString());
	
}
	
}

public Higiene comprar(String higiene) {
	for(int i=0;i<this.produtosDeHigiene.size();i++) {
		if(this.produtosDeHigiene.get(i).getNome().equals(higiene)&& this.produtosDeHigiene.get(i).getQuantidade()>0){
			this.produtosDeHigiene.get(i).reduzir();;
			return this.produtosDeHigiene.get(i);
		}
	}
	return null;
	
	
}


public void devolver(String higiene) {
	for(int i=0;i<this.produtosDeHigiene.size();i++) {
		if(this.produtosDeHigiene.get(i).getNome().equals(higiene)){
			this.produtosDeHigiene.get(i).aumentar();;
			break;
			
		}
	}
}
 

}
