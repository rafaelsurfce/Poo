
public class Main {

	public static void main(String[] args) {
	Pessoa pessoa[]= new Pessoa[2];
	
	Livro livro[]= new Livro[3];
	
	
	pessoa[0]= new Pessoa("Rafael",22,"Masculino");
	pessoa[1]= new Pessoa ("Adriele", 18, "feminino");
	
	
	livro[0]= new Livro("Cinquenta tons de cinza","Desconhecido ",300, pessoa[1]);
	livro[1]= new Livro("Alemanha 1945","Desconhecido ",200, pessoa[0]);
	livro[2]= new Livro("Sistemas operacionais","Tarnembau ",685, pessoa[0]);
	
	
	
	livro[1].folhear(15);
	livro[1].abrir();
	livro[1].folhear(2);
	livro[1].avançarPag();
	
	livro[1].voltarPag();
	System.out.println(livro[1].detalhes());

	}

}
