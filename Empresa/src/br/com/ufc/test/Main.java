package br.com.ufc.test;

import br.com.ufc.Model.Gerente;
import br.com.ufc.Model.Pesquisador;
import br.com.ufc.Model.Programador;
import br.com.ufc.Model.Projeto;

public class Main {

	public static void main(String[] args) {
		Programador programador1=new Programador();
		Programador programador2=new Programador();
		
		
		Pesquisador pesquisador1=new Pesquisador();
		Pesquisador pesquisador2=new Pesquisador();
		
		pesquisador1.setNome("João Victor");
		pesquisador2.setNome("Laura");
		
		
		Gerente gerente1=new Gerente();
		Gerente gerente2=new Gerente();
		
		Projeto projeto1=new Projeto();
		Projeto projeto2=new Projeto();
		
		
		programador1.setNome("Rafael");
		programador2.setNome("Alan");
		
		gerente1.setNome("Julio");
		gerente1.setProjeto(projeto1);
		projeto1.setGerente(gerente1);
		projeto1.setNome("Rede Wireless");
		
		
		
		projeto2.setNome("aplicativo");
		projeto2.setGerente(gerente2);
		gerente2.setProjeto(projeto2);
		gerente2.setNome("Arthur");
		
		
		System.out.println("---------------------Testes com Programador--------------------");
		/*programador1.cadastrar("JAVA");
		programador1.cadastrar("JAVA");
		programador1.cadastrar("Python");
		programador1.cadastrar("Portugol");
		programador1.cadastrar("MySql");
		programador1.cadastrar("ARDUINO");
		
		programador1.listar();
		
		programador1.excluir("JAVA");
		programador1.excluir("JAVA");*/
		
		
		/*programador1.listar();
		
		
		
		
		
		/*gerente1.alocarProgramador(projeto1, programador1);
		
		programador1.programar();
		
		
		gerente1.demitirProgramador(projeto1, programador1);
		
		programador1.programar();*/
		
		System.out.println("---------------------Testes com Pesquisador--------------------");
		
		/*pesquisador1.cadastrar("Banco de Dados");
		pesquisador1.cadastrar("Banco de Dados");
		pesquisador1.cadastrar("Segurança ");
		pesquisador1.cadastrar("Tratamento de erros");
		
		pesquisador1.listar();
		
		pesquisador1.excluir("Tratamento de erros");
		pesquisador1.excluir("Tratamento de erros");
		
		
		
		
		gerente1.alocarPesquisador(projeto1, pesquisador1);
		
		pesquisador1.pesquisar();
		
		gerente1.demitirPesquisador(projeto1, pesquisador1);
		
		pesquisador1.pesquisar();*/
		
		
		
		
		/*System.out.println("-----------------------------Teste de gerente com programador-------------------------------");
		gerente1.alocarProgramador(projeto2, programador2);
		gerente1.demitirProgramador(projeto2, programador2);
		gerente1.alocarProgramador(projeto1, programador1);
		
		
		gerente2.alocarProgramador(projeto1, programador2);
		gerente2.demitirProgramador(projeto1, programador2);
		gerente2.alocarProgramador(projeto2, programador2);
		//gerente1.demitirProgramador(projeto1, programador1);
		System.out.println("------------------------Teste de Gerente com pesquisador-------------------------");
		gerente1.alocarPesquisador(projeto2, pesquisador2);
		gerente1.demitirPesquisador(projeto2, pesquisador1);
		gerente1.alocarPesquisador(projeto1, pesquisador1);
		
		
		gerente2.alocarPesquisador(projeto1, pesquisador2);
		gerente2.demitirPesquisador(projeto1, pesquisador1);
		gerente2.alocarPesquisador(projeto2, pesquisador2);
		//gerente1.demitirPesquisador(projeto1, pesquisador1);
		
		
		System.out.println("------------------------Teste de Alocação e Demissão com Programador -------------------------");
		gerente1.alocarProgramador(projeto1, programador1);
		gerente1.alocarProgramador(projeto1, programador2);
		//gerente1.demitirProgramador(projeto1, programador1);
		//gerente1.demitirProgramador(projeto1, programador1);
		
		
		gerente2.alocarProgramador(projeto2, programador2);
		gerente2.alocarProgramador(projeto2, programador1);
		gerente2.demitirProgramador(projeto2, programador2);
		gerente2.demitirProgramador(projeto2, programador2);
		
		
		System.out.println("------------------------Teste de Alocação e Demissão com Pesquisador-------------------------");
		
		gerente1.alocarPesquisador(projeto1, pesquisador1);
		gerente1.alocarPesquisador(projeto1, pesquisador2);
		//gerente1.demitirPesquisador(projeto1, pesquisador1);
		//gerente1.demitirPesquisador(projeto1, pesquisador1);
		
		
		gerente2.alocarPesquisador(projeto2, pesquisador2);
		gerente2.alocarPesquisador(projeto2, pesquisador1);
		gerente2.demitirPesquisador(projeto2, pesquisador2);
		gerente2.demitirPesquisador(projeto2, pesquisador2);
		
		//gerente1.demitirProgramador(projeto1, programador1);*/
		
		
		
		
		
		

	}

}
