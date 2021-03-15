package br.com.escola.main;

import br.com.escola.model.Aluno;
import br.com.escola.model.Bolsista;
import br.com.escola.model.Funcionario;
import br.com.escola.model.Pessoa;
import br.com.escola.model.Professor;
import br.com.escola.model.Visitante;

public class Main {

	public static void main(String[] args) {
		
		//Pessoa p0=new Pessoa();
		Bolsista p1= new Bolsista();
		p1.setNome("Bia");
		p1.setIdade(23);
		p1.setSexo("Feminino");
		p1.setMatricula(9634163);
		p1.setCurso("Fisioterapia");
		System.out.println(p1.toString());
		p1.pagarMensalidade();
		
		
		
		Aluno p2= new Aluno();
		p2.setNome("Rafael");
		p2.setIdade(22);
		p2.setMatricula(1545646);
		p2.setSexo("Masculino");
		p2.setCurso("Redes de Computadores");
		System.out.println(p2.toString());
		p2.pagarMensalidade();
		
		
		Visitante p3= new Visitante();
		p3.setNome("Derlan");
		p3.setIdade(23);
		p3.setSexo("Masculino");
		
		System.out.println(p3.toString());
		
		
		
		
		
		
		

	}

}
