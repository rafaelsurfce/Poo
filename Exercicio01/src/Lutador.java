
public class Lutador {
	//atributos
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	//metodos especiais
	
	
	
	public void status() {
		System.out.println("----------------------------STATUS-----------------------");
		System.out.println(this.nome);
		System.out.println("É um peso: "+this.categoria);
		System.out.println(getVitorias()+" Vitorias");
		System.out.println(getDerrotas()+" Derrotas");
		System.out.println(getEmpates()+" Empates");
		
		System.out.println("---------------------------------------------------------");
		
	}
	public void ganharLuta(){
		this.vitorias++;
	}
	public void perderLuta() {
		this.derrotas++;
	}
	public void empatarLuta() {
		this.empates++;
	}
	public void apresentar() {
		System.out.println("----------------------------APRESENTAÇÃO-----------------------");
		System.out.println("Nome: "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("Idade: "+ getIdade());
		System.out.println("Altura: "+getAltura());
		System.out.println("Pesando: "+getPeso());
		System.out.println("Vitorias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());
		System.out.println("--------------------------------------------------------------");
	}
	
	
	//metodos especiais
	
	public Lutador() {} //sobrecarga de construtores
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome=nome;;
		this.nacionalidade=nacionalidade;
		this.idade=idade;
		this.altura=altura;
		setPeso(peso);
		this.vitorias=vitorias;
		this.derrotas=derrotas;
		this.empates=empates;
		
		System.out.println("Lutador cadastrado com sucesso!");
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return this.categoria;
	}
	private void setCategoria() {
		
		if(this.peso<52.2) {
		this.categoria = "INVALIDO";
		}
		else if (this.peso<=70.3) {
			this.categoria="LEVE";	
		}
		else if (this.peso<=83.9) {
		this.categoria="MEDIO";
		}
		else if(this.peso<=120.2) {
			this.categoria="PESADO";
		}
		else {
			this.categoria="invalido";
		}
		
	}
	public int getVitorias() {
		return this.vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return this.empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	

}


