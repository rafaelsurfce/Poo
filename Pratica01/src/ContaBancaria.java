
public class ContaBancaria {
	private  int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	
	//metodos especiais
	
	public ContaBancaria() {
		this.saldo=0;
		this.status=false;
		
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int num) {
		this.numConta=num;	
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono=dono;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status=status;	
	}
	
	
	//metodos
	
	
	public void decricao() {
		System.out.println("-----------Detalhes-----------");
		System.out.println("Numero da conta: "+ this.numConta+"\n"+"Tipo: "+this.tipo+"\n"+" Dono: "+this.dono+"\n"+"Saldo:"
				+ " "+this.saldo+"\n"+ "Status: "+this.status);
		 System.out.println("-----------------------------");
	}
	   
	
	
	public void abrirConta(String tipo) {
		
		if(tipo.equals("CP")) {
			this.tipo=tipo;
			this.saldo=150;
			this.status=true;
			
		}
		
		else if(tipo.equals("CC")) {
			this.tipo=tipo;
			this.saldo=50;
			this.status=true;
			
		}
		else {
			
			System.out.println("TIPO DE CONTA INVALIDA!!!");
		}
		
		
		
	}
	
	public void fecharConta() {
		if(this.saldo>0) {
			System.out.println("Voce possui um saldo maior que 0, saque o dinheiro antes de cancelar a conta");
			
		}
		else if(this.saldo==0 && this.status==true) {
			this.status=false;
			System.out.println("Conta fechada com sucesso");
		}
		
		else if(this.saldo<0) {
			System.out.println("CONTA POSSUI UM SALDO NEGATIVO, IMPOSSIVEL FECHAR!!");
		}
		else {
			System.out.println("Conta Não existe");
		}
	}
	public void depositar(double valor) {
		if(this.status==true) {
			this.saldo +=valor;
			System.out.println("Deposito de "+valor+" feito com sucesso!");
			
		}
		else {
			
			System.out.println("Conta não Existe");
		}
		
		
	}
public void sacar(double valor) {
	if(this.status==true) {
	if(this.saldo>=valor ) {
		this.saldo-=valor;
		System.out.println("Saque efetuado com sucesso ");
	}
	
	else {
		
		System.out.println("saldo insuficiente");
	}
	}
	else {
		System.out.println("Conta não existe ou desativada");
		
	}
	
	
}
public void pagarMensalidade() {
	
	if(this.status==true && this.tipo.equals("CC")) {
		this.saldo-=20;
		System.out.println("Mensalidade paga com sucesso");
	}
	
	else if(this.status==true && this.tipo.equals("CP")) {
		this.saldo-=12;
		System.out.println("Mensalidade paga com sucesso");
	}
	
	else {
		
		System.out.println("Conta não existe");
	}
	
}
}
