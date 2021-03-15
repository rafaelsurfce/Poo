package br.com.animais.main;

import br.com.animais.model.Animal;
import br.com.animais.model.Ave;
import br.com.animais.model.Mamifero;
import br.com.animais.model.Peixe;
import br.com.animais.model.Reptil;

public class Main {

	public static void main(String[] args) {
		//Animal animal= new Animal();
		
		Mamifero m= new Mamifero();
		Reptil r= new Reptil();
		Peixe p= new Peixe();
		Ave a=new Ave();
		
		
	m.locomover();
	r.locomover();
	p.locomover();
	a.locomover();
		
		
		

	}

}
