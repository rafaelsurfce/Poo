package br.com.ufc.DAOS;

import java.util.List;
import java.util.Vector;
import br.com.ufc.model.Pessoa;

public class PessoaDAO {
	
	private List<Pessoa> pessoas;
	
	
	public PessoaDAO(){
		this.pessoas=new Vector<Pessoa>();
		
	}
	
	public boolean adicionar(Pessoa pessoa) {
		
		//boolean a=true;
		if(!pessoas.isEmpty()) {
		for(Pessoa pessoa1: this.pessoas) {
			if(pessoa1.getCpf().equals(pessoa.getCpf())) {
				
				return false;
			}
		}
		}
		
	
		this.pessoas.add(pessoa);
		return true;	
		
	}
	
	public boolean remover(Pessoa pessoa) {
		
		
			
		}


		
	
	
	public List<Pessoa> retornarListaDePessoas(){
		return pessoas;
		
	}
	public void listar() {
		
		
		
		for(int i =0; i<this.pessoas.size();i++) {
			System.out.println(this.pessoas.get(i));
			
			
			
		}
		
		
	}
	
	

}
