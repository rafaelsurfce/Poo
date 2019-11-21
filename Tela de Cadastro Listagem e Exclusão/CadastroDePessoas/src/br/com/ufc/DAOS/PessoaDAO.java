
/**  Autor: Rafael Lima Pereira
 * 	Tecnologia em Redes de Computadores	
 * 	Universidade Federal do Ceará
 * 	Programação Orientada a Objetos
 * 	Prof. Julio Martins 
 * 
 * Data de inicio: 09/11/2019
 * Data de Conclusão: 15/11/2019
 * 
 * 
 
 * **/


package br.com.ufc.DAOS;

import java.util.List;
import java.util.Vector;
import br.com.ufc.model.Pessoa;

public class PessoaDAO {
	
	private List<Pessoa> pessoas;
	
	
	public PessoaDAO(){
		this.pessoas=new Vector<Pessoa>();
		
	}
	
	public String adicionar(Pessoa pessoa)
	{
		
		if(pessoa.getCpf().equals("")) //verificar se o campo de digitação de cpf tem dados
		{
			return "CPF é um campo obrigatorio";
		}
		for(Pessoa pessoa1 : this.pessoas){			
			if(pessoa1.getCpf().equals(pessoa.getCpf())) //Verifica se já existe uma pessoa cadastrada com o mesmo cpf
			{
				return "Pessoa já consta no banco de dados";
				
				
			}
		}
		pessoas.add(pessoa);
		
		return "Pessoa adicionada com sucesso";	
	}
	
	public void remover(int indice) {
		
		this.pessoas.remove(indice);
		
		
			
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
