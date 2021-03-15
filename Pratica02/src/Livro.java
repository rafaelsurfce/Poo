
public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//metodos principais
	
	
	public String detalhes() {
		return "-------------Livro-------------" + "\n"+" Titulo: "
				+ ""+ this.titulo+"\n"+"Autor: "+this.autor + "\n"+"Total de Paginas: "+this.totPaginas +"\n"+"Pagina atual: "+
				this.pagAtual+"\n" + "Aberto: "+this.aberto +"\n"+ "Leitor: "+this.leitor.getNome();
	}
	
	
	
	
	//Metodos especiais 
	
	public Livro (String titulo, String autor, int totPaginas, Pessoa leitor) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.totPaginas=totPaginas;
		this.leitor=leitor;
		this.pagAtual=0;
		this.aberto=false;
		System.out.println("Livro cadastrado com sucesso");
		
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return this.pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return this.aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return this.leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	@Override
	public void abrir() {
		this.aberto=true;
		System.out.println("Livro aberto!");
		System.out.println();
	}
	@Override
	public void fechar() {
		this.aberto=false;
		System.out.println("Livro fechado!");
		System.out.println();
		
	}
	@Override
	public void folhear(int p) {
		if(p<=this.totPaginas && this.aberto==true) {
		this.pagAtual=p;
		System.out.println("Voce avançou "+ p +" paginas");
		System.out.println();
		}
		else {
			
			System.out.println("Pagina nao existe, ou o livro nao foi aberto");
			System.out.println();
		}
		
	}
	@Override
	public void avançarPag() {
		if(this.aberto==true) {
		this.pagAtual++;
		System.out.println("Voce avançou uma pagina");
		System.out.println();
		}
		else {
			
			System.out.println("Livro não está aberto");
			System.out.println();
			
		}
	}
	@Override
	public void voltarPag() {
		if(this.aberto==true) {
		this.pagAtual--;
		System.out.println("Voce voltou uma pagina");
		System.out.println();
		}
		else {
			System.out.println("Livro não está aberto");
			System.out.println();
		}
	}
	
	


}
