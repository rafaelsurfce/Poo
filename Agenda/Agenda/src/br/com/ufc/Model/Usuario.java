package br.com.ufc.Model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario implements Metodos {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private List<Contato> contatos;
	private List<Ligacao> ligacoes;
	
	
	
	public Usuario() {
		this.contatos= new ArrayList<Contato>();
		this.ligacoes= new ArrayList<Ligacao>();
	}
	
	
	
/*public Usuario(String nome, String sobrenome, String cpf, String email) {
		
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.cpf=cpf;
		this.email=email;
		
		
	}*/
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void consultarContato(Contato contato) {
		
		if(this.contatos.contains(contato)) {
			System.out.println(contato.toString());
		}
		
		else {
			System.out.println("Contato não existe na sua agenda");
			
		}
		
	}


	@Override
	public void ligar(Contato contato) {
		if(this.contatos.contains(contato)){

			Ligacao ligacao1= new Ligacao(contato, this.nome);
			ligacao1.dataEHora();
			this.ligacoes.add(ligacao1);
			System.out.println(ligacao1.toString());
			
			
			
		}
		else {
			
			System.out.println("Impossivel ligar, contato não existente na sua agenda");
		}
		
	}


	@Override
	public void removerContato(Contato contato) {
		
		if(this.contatos.contains(contato)) {
			
			this.contatos.remove(contato);
			System.out.println("Contato "+ contato.toString()+" removido com sucesso");
			
			
		}
		else {
			
			System.out.println("Impossivel remover, contato não existente na sua agenda");
		}
		
		
	}


	@Override
	public void adicionarContato(Contato contato) {
		
		if(!this.contatos.contains(contato)) {
			this.contatos.add(contato);
			System.out.println("Contato "+contato.toString()+" adicionado com sucesso");	
		}
		
		else {
			System.out.println("Contato já existente na agenda ");
			
		}
		
	}
	
	
	

	@Override
	public void pesquisarContato(String telefone) {
		for(int i=0; i<this.contatos.size();i++) {
			if(this.contatos.get(i).getTelefone()==telefone) {
				System.out.println(this.contatos.get(i).toString());
				break;	
			}
			
			
		}
		
		
	}


	
	public void verificarLigacao() {
		
		for(int i=0;i<this.ligacoes.size();i++) {
			
			System.out.println("Ligações realizadas:"+ "\n "+"Contato: " +this.ligacoes.get(i).getContato()+" Data e hora: "+this.ligacoes.get(i).getDataEHora());	
		}	
		
	}

}
