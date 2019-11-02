package br.com.ufc.Model;

import java.util.ArrayList;
import java.util.List;

public class Projeto implements MetodosConsultor{
	private String nome;
	private String dataDeInicio;
	private double or�amento;
	private Gerente gerente;
	private List<Programador> programadores;
	private List<Pesquisador> pesquisadores;
	
	
	public  Projeto() {
		this.programadores=new ArrayList<Programador>();
		this.pesquisadores=new ArrayList<Pesquisador>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public double getOr�amento() {
		return or�amento;
	}
	public void setOr�amento(double or�amento) {
		this.or�amento = or�amento;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	

	
	public String toString() {
		return this.nome;
		
	}

	@Override
	public void alocarProgramador(Programador programador, Projeto projeto) {
		
	
		for(int i=0;i<this.programadores.size();i++) {
			if(programador.equals(this.programadores.get(i))) {
				System.out.println("Programador j� est� no projeto");
				break;
			}
			
		}
		
		if(programador.getProjeto()==null){
			this.programadores.add(programador);
			programador.setProjeto(projeto);
			System.out.println("Programador "+programador.toString()+ " alocado com sucesso no projeto "+projeto.toString());
			
		}
		
		else if(programador.getProjeto()!=null && programador.getProjeto()!=projeto) {
			System.out.println("Programador j� est� alocado para outro projeto");
		}
		
	}
		
	

	@Override
	public void demitirProgramador(Programador programador,Projeto projeto) {
		
		if(this.programadores.contains(programador)) {
			
			this.programadores.remove(programador);
			programador.setProjeto(null);
			System.out.println("Programador "+programador.toString()+" Removido do projeto "+ projeto.toString());	
		}
		
		
		else {
			
			System.out.println("Programador n�o pertence a esse projeto ");
			
		}
		
		
	}

	
	

	@Override
	public void alocarPesquisador(Pesquisador pesquisador, Projeto projeto) {
		
		for(int i=0;i<this.pesquisadores.size();i++) {
			if(pesquisador.equals(this.pesquisadores.get(i))) {
				System.out.println("pesquisador j� est� no projeto");
				break;
			}
			
		}
		
		if(pesquisador.getProjeto()==null){
			this.pesquisadores.add(pesquisador);
			pesquisador.setProjeto(projeto);
			System.out.println("Pesquisador "+pesquisador.toString()+ " alocado com sucesso no projeto "+projeto.toString());
			
		}
		
		else if(pesquisador.getProjeto()!=null && pesquisador.getProjeto()!=projeto) {
			System.out.println("Pesquisador j� est� alocado para outro projeto");
		}
		
		
	}

	@Override
	public void demitirPesquisador(Pesquisador pesquisador, Projeto projeto) {
		
if(this.pesquisadores.contains(pesquisador)) {
			
			this.pesquisadores.remove(pesquisador);
			pesquisador.setProjeto(null);
			System.out.println("Pesquisador "+pesquisador.toString()+" Removido do projeto "+ projeto.toString());	
		}
		
		
		else {
			
			System.out.println("Pesquisador n�o pertence a esse projeto ");
			
		}
		
		
		
	}

	
	

}
