package br.com.ufc.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	
	private int numero;
	private String cpfFuncionario;
	private String cliente;
	private double valorTotal;
	private String dataDaCompra;
	private List<Produto> produtos;
	
	
	
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Compra() {
		this.produtos=new ArrayList<Produto>();
		
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDataDaCompra() {
		return dataDaCompra;
	}
	public void setDataDaCompra(String dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
		this.valorTotal+=produto.getPreço();
		System.out.println("Produto' "+produto.toString()+ " ' adicionado do carrinho");
		
		
	}
	public void removerProduto(String produto) {
		
		for(Produto produto1: this.produtos) {
			if(produto1.getNome().equals(produto)) {
				this.produtos.remove(produto1);
				this.valorTotal-=produto1.getPreço();
				System.out.println("Produto' "+produto.toString()+ " ' Retirado do carrinho");
				break;
			}
			
		}
		
		
		
	}
	
	public boolean consultar(String alimento) {
		for(Produto produto: this.produtos) {
			if(produto.getNome().equals(alimento)) {
			return true;
		}
		}
		return false;
		
	}
	
	
	
	
	
	public void listar() {
		System.out.println("----------------------------------------CARRINHO DE COMPRAS--------------------------------------------");
		for(Produto produto:this.produtos) {
			

			
			System.out.println("Nome do produto: "+produto.getNome()+" Valor: "+produto.getPreço());
			
			
		}
		System.out.println("Valor total: "+this.valorTotal);
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
	}
	
	public void listar2() {
		System.out.println("Nome do cliente: "+this.cliente+" CPF funcionario: "+this.cpfFuncionario+" Data e hora da compra: "+this.dataDaCompra);
		
		for(Produto produto1: this.produtos)
		{
			System.out.println("Produto: "+produto1.getNome()+" Preço: "+produto1.getPreço());
		}
		System.out.println("Valor total: "+this.valorTotal);
		
		
		
	}
	public void dataEHora() {
		
		
		Date data1= new Date();
		 
		SimpleDateFormat formatador= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String date=formatador.format(data1);
		this.dataDaCompra=date;
	}

}
