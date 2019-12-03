package br.com.ufc.DAO;

import br.com.ufc.Model.Funcionario;

public interface Metodos {
	
	public abstract void adicionar(Funcionario funcionario, String confSenha);
	public abstract void remover();
	public abstract void consultar();
	public abstract void  listar();

}
