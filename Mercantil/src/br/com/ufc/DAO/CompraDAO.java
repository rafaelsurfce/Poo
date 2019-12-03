package br.com.ufc.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.Model.Compra;

public class CompraDAO {
	
	private List<Compra> compras;
	
	
	
	public CompraDAO() {
		this.compras=new ArrayList<Compra>();
		
		
	}



	
	public void adicionar(Compra compra) {
		this.compras.add(compra);
		
		
	}



	
	public void remover() {
		// TODO Stub de método gerado automaticamente
		
	}



	
	public void consultar(String cpf) {
		for(Compra compra1: this.compras) {
			if(compra1.getCpfFuncionario().equals(cpf)){
				System.out.println("---------------------------------COMPRAS REALIZADAS----------------------------------------------------");
				compra1.listar2();
				
				
				
			}
			
			
			
			
			
		}
		
	}



	
	public void listar() {
		// TODO Stub de método gerado automaticamente
		
	}

}
