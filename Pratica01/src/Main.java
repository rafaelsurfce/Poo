
public class Main {

	public static void main(String[] args) {
		//objetos
		ContaBancaria p1=new ContaBancaria();
		ContaBancaria p2=new ContaBancaria();
		
		//Preenchimento conta 1
		p1.setNumConta(123456);
		p1.setDono("Rafael");
		p1.abrirConta("CC");
		
		
		
		
		
		
		// Preenchimento conta 2
		p2.setNumConta(025151515);
		p2.setDono("Obede");
		p2.abrirConta("CP");
		
		
		//teste de deposito
		p1.depositar(100);
		p2.depositar(500);
		//teste de saque
		p2.sacar(100);
		p2.sacar(700);
		p1.sacar(50);
		p1.sacar(100);
		//teste de mensalidade 
		p1.pagarMensalidade();
		//teste de fechar conta
		p1.fecharConta();
		
		
		p1.decricao();
		p2.decricao();
		
		
		

	}

}
