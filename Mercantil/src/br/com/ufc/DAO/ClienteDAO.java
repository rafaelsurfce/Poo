package br.com.ufc.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.Model.Cliente;

public class ClienteDAO {
	
	private List<Cliente> clientes;
	
	
	
	
	
	public ClienteDAO(){
		this.clientes=new ArrayList<Cliente>();
	}
	
	
	
	public void adicionar(Cliente cliente) {
		
		this.clientes.add(cliente);
		
		
		
	}
	public String remover(String cliente) {
		for(int i=0;i<this.clientes.size();i++) {
			if(this.clientes.get(i).getCpf().equals(cliente)) {
				
				this.clientes.remove(this.clientes.get(i));
				return "REMOVIDO COM SUCESSO";
				
			}
		}
		return"Nao existe esse cliente no nosso banco de dados";
		
		
		
	}
	
	public int consultar1(String cpf) {
		for(Cliente cliente1: this.clientes) {
			if(cliente1.getCpf().equals(cpf)) {
			return 1;
			}
		}
		
		return 2;
		
		
	}
				
	public String consultar(String cpf) {
		for(Cliente cliente1: this.clientes) {
			if(cliente1.getCpf().equals(cpf)) {
			return cliente1.toString();
			}
			
		}
		
		return "Não possui esse cliente cadastrado";
		
	}
	
	
	public void listar() {
		for(Cliente cliente1: this.clientes) {
			System.out.println(cliente1.toString()); 
			
		}
		
	}
	
	public String selecionar(String nome) {
		for(Cliente cliente1: this.clientes) {
			if(cliente1.getNome().equals(nome)) {
				
				return cliente1.getNome();
				
			}
			
			
		
			
			
		}
		
		return "Não tem cliente cadastrado com esse nome";
	}


}
