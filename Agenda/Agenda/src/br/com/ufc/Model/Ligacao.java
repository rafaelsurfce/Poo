package br.com.ufc.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ligacao {
	private  String nomeDeUsuario;
	private Contato contato;
	private String dataEHora;

	
	
	Ligacao(Contato contato, String nomeDeUsuario){
		
		this.contato=contato;
		this.nomeDeUsuario=nomeDeUsuario;
		
		
	}
	
	
	


	public String getNomeDeUsuario() {
		return this.nomeDeUsuario;
	}





	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}





	public Contato getContato() {
		return this.contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public String getDataEHora() {
		return this.dataEHora;
	}
	public void setDataEHora(String dataEHora) {
		this.dataEHora = dataEHora;
	}
	

	public void dataEHora() {
		
		Date data1= new Date();
	 
		SimpleDateFormat formatador= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String date=formatador.format(data1);
		this.dataEHora=date;
		
		
		
  	}
 

	public String toString() {
		
		
		
		
		return "Voce está ligando para o contato de " + this.contato+ " no dia e hora "+this.dataEHora;
		
		
	}
}
