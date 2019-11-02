package br.com.ufc.Model;

public interface Alocador {
	
	
	public void alocarProgramador(Projeto projeto, Programador programador);
	public void demitirProgramador(Projeto projeto, Programador programador);
	public void alocarPesquisador(Projeto projeto, Pesquisador pesquisador);
	public void demitirPesquisador(Projeto projeto, Pesquisador pesquisador);

}
