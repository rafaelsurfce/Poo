
public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	
	//metodos principais
	public void fazerAniversario() {
		this.idade++;
		
	}
	
	
	//metodos especiais
	
	
	public Pessoa(String nome, int idade, String sexo) {
		this.sexo=sexo;
		this.idade=idade;
		this.nome=nome;
		System.out.println("Pessoa cadastrada com sucesso");
		System.out.println();
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	

}
