import java.util.Random;
public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rouds;
	private boolean aprovada;
	
	//metodos principais
	
	
	public void marcarLuta(Lutador desafiante, Lutador desafiado) {
		
		if(!desafiante.getCategoria().equals(desafiado.getCategoria())) {
			this.aprovada=false;
			System.out.println("Luta reprovada lutadores de categorias diferentes");
		}
		else if(desafiante.getNome().equals(desafiado.getNome())) {
			this.aprovada=false;
			System.out.println("Lutador não pode lutar com sí mesmo ");	
		}
		else {
			this.desafiante=desafiante;
			this.desafiado=desafiado;
			this.aprovada=true;
			System.out.println("Luta marcada com sucesso entre "+this.desafiante.getNome()+" VS "+ this.desafiado.getNome());
		}
	}
	
	
	public void lutar() {
		if(this.aprovada==true) {
		System.out.println("A luta vai começar...");
		System.out.println("######### DESAFIANTE ########");
		this.desafiante.apresentar();
		System.out.println("######### DESAFIADO ########");
		this.desafiado.apresentar();
		
		Random random= new Random();
		int vencedor=random.nextInt(3);
		if(vencedor==0) {
			desafiante.empatarLuta();
			desafiado.empatarLuta();
			System.out.println("Luta Empatada");	
		}
		
		else if(vencedor==1) {
			desafiante.ganharLuta();
			desafiado.perderLuta();
			System.out.println("O desafiante "+this.desafiante.getNome()+" Ganhou a luta");
			
		}
		
		else {
			desafiado.ganharLuta();
			desafiante.perderLuta();
			System.out.println("O desafiado "+this.desafiado.getNome()+" Ganhou a luta");
		}
		
		
			
			
		}
		else {
			System.out.println("Essa luta não foi aprovada ");
			
		}
		
		
		
	}
	
	
	
	//metodos especiais
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public int getRouds() {
		return this.rouds;
	}
	public void setRouds(int rouds) {
		this.rouds = rouds;
	}
	public boolean getAprovada() {
		return this.aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	

}
