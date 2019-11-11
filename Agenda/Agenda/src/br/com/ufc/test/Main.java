package br.com.ufc.test;

import br.com.ufc.Model.Contato;
import br.com.ufc.Model.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario rafael=new Usuario();
		Contato diego=new Contato("Diego", "9962566771");
		Contato mercia=new Contato("Mercia ", "190");
		
		
		
		rafael.setNome("Rafael");
		
		System.out.println("------------------- teste de contatos------------------------");
		//ADICÃO DE CONTATO
		rafael.adicionarContato(diego);
		rafael.adicionarContato(mercia);
		
	
		//CONSULTA DE CONTATO
		
		//rafael.pesquisarContato("9962566771");
		//rafael.verificarLigacao();
		//rafael.consultarContato(diego);
		
		//LIGAR 
		rafael.ligar(diego);
		rafael.verificarLigacao();
		//rafael.ligar(mercia);
		
		
		
		
		//REMOÇÃO DE CONTATO
		//rafael.removerContato(diego);

	}

}
