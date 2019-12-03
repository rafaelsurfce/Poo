package br.com.ufc.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.Model.Funcionario;
import br.com.ufc.Views.TelaDeCadastroDeFuncionario;

public class FuncionarioDAO {
	
	private List<Funcionario> funcionarios;
	
	
	
	public FuncionarioDAO(){
		this.funcionarios= new ArrayList<Funcionario>();
		
		
	}

	

	
	public int adicionar(Funcionario funcionario, String confSenha) {
		if(funcionario.getCpf().equals("")) {
			return 0;
			
		}
		
		if(!funcionario.getSenha().equals(confSenha)){
			
			return 1;
			
		}
		for(Funcionario funcionario1: this.funcionarios) {
			
			
			
			if(funcionario1.getCpf().equals(funcionario.getCpf())) {
				
				return 2;
				
			}	
		}
		this.funcionarios.add(funcionario);
		
		return 3;
		
	}



	public void remover() {
		// TODO Stub de método gerado automaticamente
		
	}



	
	public String consultar(String cpf, String senha) {
		
		
		if(cpf.equals("")) {
			return"Esse campo CPF é obrigatorio";
			
			
		}
		
		for(Funcionario funcionario1: this.funcionarios) {
			if(funcionario1.getCpf().equals(cpf)&& funcionario1.getSenha().equals(senha)) {
				return "Funcionario logado com sucesso";
			}
			 else if (funcionario1.getCpf().equals(cpf)&& !funcionario1.getSenha().equals(senha)) {
				
				return "senha incorreta";
				
				
			}
		
		
		}
		return "Funcionario não possui cadastro";
		}
	



	
	public void listar() {
		
		
		for (int i=0; i<this.funcionarios.size();i++) {
			System.out.println(this.funcionarios.get(i));
			
			
		}
		
		
	}



	

}
