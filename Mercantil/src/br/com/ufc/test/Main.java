package br.com.ufc.test;



import java.util.Scanner;

import br.com.ufc.DAO.AlimentoDAO;
import br.com.ufc.DAO.ClienteDAO;
import br.com.ufc.DAO.CompraDAO;
import br.com.ufc.DAO.FuncionarioDAO;
import br.com.ufc.DAO.HigieneDAO;
import br.com.ufc.DAO.LimpezaDAO;
import br.com.ufc.Model.Alimento;
import br.com.ufc.Model.Cliente;
import br.com.ufc.Model.Compra;
import br.com.ufc.Model.Funcionario;
import br.com.ufc.Model.Higiene;
import br.com.ufc.Model.Limpeza;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		//Classes de objetos 
		//Classes de produtos
		
		
		
		//Classes de DROP BASE
		
		FuncionarioDAO funcionarioDAO=new FuncionarioDAO();
		ClienteDAO clienteDAO=new ClienteDAO();
		CompraDAO compraDAO=new CompraDAO();
		
		
		AlimentoDAO alimentoDAO=new AlimentoDAO();
		LimpezaDAO limpezaDAO=new LimpezaDAO();
		HigieneDAO higieneDAO=new HigieneDAO();
		
		
		int comando=0;
		
		while(true) {
			System.out.println("-------------------------TELA DE LOGIN---------------------------------------------");
			System.out.print("Digite o CPF do funcionario: ");
			String cpf=entrada.nextLine();
			System.out.print("Digite a senha: ");
			String senha=entrada.nextLine();

			System.out.println("Caso deseje ENTRAR Digite 1, caso deseje fazer CADASTRO digite 2");
			comando=Integer.parseInt(entrada.nextLine());

			
			
			switch(comando) {
			case 1:
				
				String resultado=funcionarioDAO.consultar(cpf, senha);
				if(resultado=="Esse campo CPF é obrigatorio") {
					System.out.println("Esse campo CPF é obrigatorio");
				}
				
				else if (resultado=="Funcionario logado com sucesso") {
					
					System.out.println("Funcionario logado com sucesso");
					while(true) {
					System.out.println("--------------------TELA DE MENU------------------------------------");
					
					System.out.println("Vendas: DIGITE 1");
					System.out.println("Clientes: DIGITE 2");
					System.out.println("Produtos: DIGITE 3");
					System.out.println("SAIR: DIGITE 4");
					System.out.print("Digite uma ação: ");
					 comando=Integer.parseInt(entrada.nextLine());
					switch(comando) {
					case 1:
						while(true) {
							System.out.println("---------------------------VENDAS---------------------------");
						System.out.println("Iniciar vendas: DIGITE 1");
						System.out.println("Consultar Vendas: DIGITE 2");
						
						System.out.println("Voltar ao menu inicial: DIGITE 3");
						System.out.print("Digite uma ação: ");
						int comandoVenda=Integer.parseInt(entrada.nextLine());
						switch(comandoVenda) {
						
						case 1:
						while(true) {
							System.out.println("---------------------------INICIAR VENDAS---------------------------");
							Compra compra=new Compra();
							System.out.print("Digite o nome do Cliente ou digite sair para sair de vendas: ");
							String nome=entrada.nextLine();
							String resultadoNome=clienteDAO.selecionar(nome);
							
							
							if(nome.equals("sair")) {
								break;
								
								
							}
							
							else if(resultadoNome.equals("Não tem cliente cadastrado com esse nome")) {
								
								System.out.println("Não tem cliente cadastrado com esse nome ");
								continue;
							}
							else {
								compra.setCliente(resultadoNome);
								while(true) {
									System.out.println("---------------------------Carrinho de Compras---------------------------");
									
									System.out.print("Digite a categoria do produto: ");
									String categoriaProduto=entrada.nextLine();	
									
									
									
									if(categoriaProduto.equals("Alimento")) {
										
										System.out.println("Digite 1 para adicionar ao carrinho ");
										System.out.println("Digite 2 para remover do carrinho ");
										System.out.print("Digite uma ação: ");
										int comandoVendax=Integer.parseInt(entrada.nextLine());
										
										if(comandoVendax==1) {
										System.out.print("Digite o nome do Alimento: ");
										String alimento1=entrada.nextLine();
										
										Alimento resultadox=alimentoDAO.comprar(alimento1);
										
										if(resultadox!=null) {
											
										compra.adicionarProduto(resultadox);
										
										compra.listar();
										}
										
										else {
											
											System.out.println("Não possui esse produto cadastrado, ou o mesmo está esgotado");
											
										}
										}
										else if(comandoVendax==2) {
											System.out.print("Digite o nome do Alimento: ");
											String alimento1=entrada.nextLine();
											
											Boolean resultadox=compra.consultar(alimento1);
											
											if(resultadox==true) {
												compra.removerProduto(alimento1);
												compra.listar();
												alimentoDAO.devolver(alimento1);
												
											}
											else {
												
												System.out.println("Produto não existe no seu carrinho de compras ");
												
											}
										}
										else {
											
											System.out.println("Comando invalido");
										}
										
										
											
											
											
										}
									
									else if(categoriaProduto.equals("Limpeza")) {
										
										System.out.println("Digite 1 para adicionar ao carrinho ");
										System.out.println("Digite 2 para remover do carrinho ");
										System.out.print("Digite uma ação: ");
										int comandoVendax=Integer.parseInt(entrada.nextLine());
										
										if(comandoVendax==1) {
										System.out.print("Digite o nome do Produto de Limpeza: ");
										String limpeza1=entrada.nextLine();
										
										Limpeza resultadox=limpezaDAO.comprar(limpeza1);
										
										if(resultadox!=null) {
											
										compra.adicionarProduto(resultadox);
										compra.listar();
											
										}
										else {
											
											System.out.println("Não possui esse produto cadastrado, ou o mesmo estar esgotado");
											
										}
										}
										else if(comandoVendax==2) {
											System.out.print("Digite o nome do Produto de Limpeza: ");
											String limpeza1=entrada.nextLine();
											
											Boolean resultadox=compra.consultar(limpeza1);
											
											if(resultadox==true) {
												compra.removerProduto(limpeza1);
												limpezaDAO.devolver(limpeza1);
												compra.listar();
												
											}
											else {
												
												System.out.println("Produto não existe no seu carrinho de compras ");
												
											}
										}
										else {
											
											System.out.println("Comando invalido");
										}
										
										
									}
									else if(categoriaProduto.equals("Higiene")) {
										
										System.out.println("Digite 1 para adicionar ao carrinho ");
										System.out.println("Digite 2 para remover do carrinho ");
										System.out.print("Digite uma ação: ");
										int comandoVendax=Integer.parseInt(entrada.nextLine());
										
										if(comandoVendax==1) {
										System.out.print("Digite o nome do Produto de Higiene: ");
										String higiene1=entrada.nextLine();
										
										Higiene resultadox=higieneDAO.comprar(higiene1);
										
										if(resultadox!=null) {
											
										compra.adicionarProduto(resultadox);
										compra.listar();
											
										}
										else {
											
											System.out.println("Não possui esse produto cadastrado");
											
										}
										}
										else if(comandoVendax==2) {
											System.out.print("Digite o nome do produto de higiene: ");
											String higiene1=entrada.nextLine();
											
											Boolean resultadox=compra.consultar(higiene1);
											
											if(resultadox==true) {
												compra.removerProduto(higiene1);
												compra.listar();
												alimentoDAO.devolver(higiene1);
												
											}
											else {
												
												System.out.println("Não possui esse produto cadastrado, ou o mesmo está esgotado");
												
											}
										}
										else {
											
											System.out.println("Comando invalido");
										}
										
										
										
									}
									
									
									
									else {
										
										System.out.println("Não existe essa categoria de produto");
										continue;
										
									}
									System.out.print("Deseja finaliza a compra? 1=Finalizar 2=Cancelar 3=Continuar comprando: ");
									
									int escolha=Integer.parseInt(entrada.nextLine());
									
									if(escolha==1) {
										
										compra.setCpfFuncionario(cpf);
										compra.dataEHora();
										compraDAO.adicionar(compra);
										System.out.println("-------------------------------------------------------------------------------------------------------");
										compra.listar2();
										System.out.println("-------------------------------------------------------------------------------------------------------");
										break;
									}
									
									else if (escolha==2){
										break;
										
									}
									else if(escolha==3) {}
									
									else {
										
										System.out.println("Comando invalido");
									}
										
										
									}
								}
							System.out.print("Deseja continuar a fazer vendas? s/n: ");
							String escolhax=entrada.nextLine();
							if(escolhax.equals("s")) {continue;}
							
							else if(escolhax.equals("n")) {
								System.out.println("-------------------------------------------------------------------------------------------------------");
								break;
							}
								else {
									System.out.println("Comando invalido");
									
								}
							

							     }
						break;
						case 2:
							while(true) {
								
							System.out.println("----------------------------------------LISTAR VENDAS REALIZADAS------------------------------");
							System.out.print("Deseja listar as vendas realizadas? s/n: ");
							String desejo=entrada.nextLine();
							
							
							if(desejo.equals("s")) {
								System.out.println("------------------------------------VENDAS REALIZADAS-------------------------------------");
								compraDAO.consultar(cpf);
								
							}
							else if(desejo.equals("n")) {
								System.out.println("-----------------------------------------------------------------------------------------");
								break;
								
							}
							}
							break;
							
						case 3:
							
								
							break;
							
						}
						break;
						
						
						
						
							
							
							
							
							
							
							
							
						
						}
						break;
						
						
					
						
						
						
					case 2: 
						while(true) {
							System.out.println("-----------------------------CLIENTE-----------------------------------------------");
							System.out.println("Cadastrar Cliente: DIGITE 0");
							System.out.println("Consultar Cliente: DIGITE 1");
							System.out.println("Listar Cliente: DIGITE 2");
							System.out.println("Excluir Cliente: DIGITE 3");
							
							System.out.println("Voltar ao menu inicial: DIGITE 4");
							System.out.print("Digite uma ação: ");
							int comandoCliente=Integer.parseInt(entrada.nextLine());
							if(comandoCliente==0) {
								System.out.println("--------------------------------------CADASTRO CLIENTE-----------------------------------------------");
								Cliente cliente=new Cliente();
								
								System.out.print("Digite o nome do Cliente: ");
								cliente.setNome(entrada.nextLine());
								System.out.print("Digite o cpf do Cliente: ");
								String cpfCli=entrada.nextLine();
								
								
								int resu=clienteDAO.consultar1(cpfCli);
								
								
								if(resu==1) {
									System.out.println("Esse Cliente já possui cadastro");
								
									continue;
								}
								else if(resu==2){
									cliente.setCpf(cpfCli);
									System.out.print("Digite a data de Nascimento: ");
									cliente.setDataDeNascimento(entrada.nextLine());
									
								}
							System.out.print("Deseja cadastrar novo cliente? s/n: ");
							String comandoCad=entrada.nextLine();
							
							if(comandoCad.equals("s")) {
							
								clienteDAO.adicionar(cliente);
								System.out.println("Cliente cadastrado com sucesso");
									
							}
							else {
								
								continue;
							}
							
							
							}
							else if(comandoCliente==1) {
								System.out.println("----------------------------- CONSULTAR CLIENTE-----------------------------------------------");
								
								System.out.print("Consultar? s/n: ");
								String comandoCons=entrada.nextLine();
								
								if(comandoCons.equals("s")) {
								System.out.print("Digite o cpf do cliente: ");
								String cpfC= entrada.nextLine();
								System.out.println(clienteDAO.consultar(cpfC));
								
								}
								else {
									
									continue;
								}
								
								
								
								
							}
							else if(comandoCliente==2) {
								System.out.println("-----------------------------LISTAR CLIENTES-----------------------------------------------");
								
								clienteDAO.listar();
								
								
							}
							else if(comandoCliente==3) {
								System.out.println("-----------------------------EXCLUIR CLIENTE-----------------------------------------------");
								
								System.out.print("Digite o Cpf do cliente: ");
								String cpfC= entrada.nextLine();
								clienteDAO.remover(cpfC);
								
								
							}
							else if(comandoCliente==4) {
								break;
								
							}
							else {
								
								
								System.out.println("Comando invalido");
								
							}
							
						}
						break;
						
							
						
						
						
						
					case 3: 
						while(true) {
							System.out.println("----------------------------- PRODUTOS -----------------------------------------------");
						System.out.println("Cadastrar Produto: DIGITE 0");
						System.out.println("Consultar Produto: DIGITE 1");
						System.out.println("Listar Produtos: DIGITE 2");
						System.out.println("Excluir Produto: DIGITE 3");
						
						System.out.println("Voltar ao menu inicial: DIGITE 4");
						System.out.print("Digite uma ação: ");
						int comandoProdutos=Integer.parseInt(entrada.nextLine());
						
						
						if(comandoProdutos==0) {
							System.out.println("-----------------------------CADASTRO DE PRODUTOS-----------------------------------------------");
							while(true) {
							System.out.print("Digite a categoria do produto/ ou sair para sair da tela de cadastro de produtos: ");
							String categoria=entrada.nextLine();
						if(categoria.equals("Alimento")) {
							System.out.println("-----------------------------CATEGORIA ALIMENTOS-----------------------------------------------");
							Alimento alimento=new Alimento();
							System.out.print("Digite o nome do produto: ");
							String nomeAlimento=entrada.nextLine();
							
							String resultadoAli=alimentoDAO.consultar(nomeAlimento);
							
							if(resultadoAli.equals("Já possui esse produto alimento cadastrado")) {
								System.out.println("Já possui esse produto de alimento cadastrado");
								System.out.println("----------------------------------------------------------------------------");
								continue;
								
							}
							else {
								alimento.setNome(nomeAlimento);
								System.out.print("Digite a data de Fabricação: ");
								alimento.setDataDeFabricacao(entrada.nextLine());
								System.out.print("Digite a data de Vencimento: ");
								alimento.setDataDeVencimento(entrada.nextLine());
								
								System.out.print("Quantidade: ");
								alimento.setQuantidade(Integer.parseInt(entrada.nextLine()));
								System.out.print("Preço: ");
								alimento.setPreço(Double.parseDouble(entrada.nextLine()));
								
								System.out.print("Deseja cadastrar o produto? s/n ");
								String comandoCadP=entrada.nextLine();
								if(comandoCadP.equals("s")) {
									alimentoDAO.adicionar(alimento);
									System.out.println("----------------------------------------------------------------------------");
									System.out.println("produto cadastrado com sucesso ");
									
									
								}
								
								else {
									System.out.println("----------------------------------------------------------------------------");
									continue;
									
									
									
									
								}
								
							}
							
							
						}
						else if(categoria.equals("Limpeza")) {
							System.out.println("-----------------------------CATEGORIA LIMPEZA-----------------------------------------------");
							Limpeza limpeza= new Limpeza();
							System.out.print("Digite o nome do produto: ");
							String nomeLimpeza=entrada.nextLine();
							
							String resultadoLim=limpezaDAO.consultar(nomeLimpeza);
							
							if(resultadoLim.equals("Já possui esse produto alimento cadastrado")) {
								System.out.println("Já possui esse produto de Limpeza cadastrado");
								System.out.println("----------------------------------------------------------------------------");
								continue;
								
							}
							else {
								limpeza.setNome(nomeLimpeza);
								System.out.print("Digite a data de Fabricação: ");
								limpeza.setDataDeFabricacao(entrada.nextLine());
								System.out.print("Digite a data de Vencimento: ");
								limpeza.setDataDeVencimento(entrada.nextLine());
								
								System.out.print("Quantidade: ");
								limpeza.setQuantidade(Integer.parseInt(entrada.nextLine()));
								System.out.print("Preço: ");
								limpeza.setPreço(Double.parseDouble(entrada.nextLine()));
								
								System.out.print("Deseja cadastrar o produto? s/n: ");
								String comandoCadP=entrada.nextLine();
								if(comandoCadP.equals("s")) {
									limpezaDAO.adicionar(limpeza);
									System.out.println("produto cadastrado com sucesso ");
									System.out.println("----------------------------------------------------------------------------");
									
								}
								
								else {
									System.out.println("----------------------------------------------------------------------------");
									continue;
									
									
									
									
								}
								
							}
							
							
						}
						else if(categoria.equals("Higiene")) {
							System.out.println("-----------------------------CATEGORIA HIGIENE-----------------------------------------------");
							Higiene higiene= new Higiene();
							System.out.print("Digite o nome do produto: ");
							String nomeHigiene=entrada.nextLine();
							
							String resultadoLim=limpezaDAO.consultar(nomeHigiene);
							
							if(resultadoLim.equals("Já possui esse produto alimento cadastrado")) {
								System.out.println("Já possui esse produto de Higiene cadastrado");
								System.out.println("----------------------------------------------------------------------------");
								
								continue;
								
							}
							else {
								higiene.setNome(nomeHigiene);
								System.out.print("Digite a data de Fabricação: ");
								higiene.setDataDeFabricacao(entrada.nextLine());
								System.out.print("Digite a data de Vencimento: ");
								higiene.setDataDeVencimento(entrada.nextLine());
								
								System.out.print("Quantidade: ");
								higiene.setQuantidade(Integer.parseInt(entrada.nextLine()));
								System.out.print("Preço: ");
								higiene.setPreço(Double.parseDouble(entrada.nextLine()));
								
								System.out.print("Deseja cadastrar o produto? s/n: ");
								String comandoCadP=entrada.nextLine();
								if(comandoCadP.equals("s")) {
									higieneDAO.adicionar(higiene);
									System.out.println("produto cadastrado com sucesso ");
									System.out.println("----------------------------------------------------------------------------");
									
								}
								
								else {
									System.out.println("----------------------------------------------------------------------------");
									continue;
									
									
									
									
								}
								
							}
							
							
						}
						else if (categoria.equals("sair")) {
							break;
						}
						else {
							
							System.out.println("Comando invalido");
						}
						}
						}
						else if(comandoProdutos==1) {
							while(true) {
							System.out.println("-------------------------------------------CONSULTA DE PRODUTOS------------------------------------------");
							System.out.print("Digite a categoria do produto/ ou sair para sair de consulta: ");
							String categoriaProduto=entrada.nextLine();
							if(categoriaProduto.equals("Alimento")) {
								System.out.println("-------------------------------------------CONSULTA DE ALIMENTOS------------------------------------------");
								System.out.print("Digite o nome do Alimento: ");
								String nomeAlimento=entrada.nextLine();
								System.out.println(alimentoDAO.consultar1(nomeAlimento));
								System.out.println("----------------------------------------------------------------------------------------------------------");
								
								
								
							}
							else if(categoriaProduto.equals("Limpeza")) {
								System.out.println("-------------------------------------------CONSULTA DE PRODUTOS DE LIMPEZA------------------------------------------");
								System.out.print("Digite o nome do Produto de limpeza: ");
								String nomeLimpeza=entrada.nextLine();
								System.out.println(limpezaDAO.consultar1(nomeLimpeza));
								System.out.println("----------------------------------------------------------------------------------------------------------");
								
							}
							else if(categoriaProduto.equals("Higiene")) {
								System.out.println("-------------------------------------------CONSULTA DE PRODUTOS DE HIGIENE------------------------------------------");
								System.out.print("Digite o nome do Produto de higiene: ");
								String nomeHigiene=entrada.nextLine();
								System.out.println(higieneDAO.consultar1(nomeHigiene));
								System.out.println("----------------------------------------------------------------------------------------------------------");
							}
							else if(categoriaProduto.equals("sair")) {
								break;
							}
							else {
								System.out.println("comando invalido ");
							}
							}
						}
						else if(comandoProdutos==2) {
							while(true) {
								System.out.println("------------------------------------LISTAGEM DE PRODUTOS--------------------------------------------");
							System.out.print("Digite a categoria do produto que deseja listar/ ou sair para sair: ");
							String categoriaListar=entrada.nextLine();
							
							if(categoriaListar.equals("Alimento")) {
								
								System.out.println("-------------------------------------------LISTAR ALIMENTOS------------------------------------------");
								alimentoDAO.listar();
								System.out.println("---------------------------------------------------------------------------------------------------------------");
							}
							
							else if(categoriaListar.equals("Limpeza")) {
								System.out.println("-------------------------------------------LISTAR PRODUTOS DE LIMPEZA------------------------------------------");
								limpezaDAO.listar();
								System.out.println("---------------------------------------------------------------------------------------------------------------");
								
							}
							else if(categoriaListar.equals("Higiene")) {
								System.out.println("-------------------------------------------LISTAR PRODUTOS DE HIGIENE------------------------------------------");
								higieneDAO.listar();
								System.out.println("---------------------------------------------------------------------------------------------------------------");
								
							}
							else if(categoriaListar.equals("sair")) {
								break;
							}
							else {
								
								System.out.println("comando invalido ");
							}
							
							}
							
						}
						else if(comandoProdutos==3) {
							while(true) {
							System.out.println("-------------------------------------------EXCLUSÃO DE PRODUTOS------------------------------------------");
							System.out.print("Digite a Categoria do produto: ");
							String categoriaDeExclusão=entrada.nextLine();
							
							if(categoriaDeExclusão.equals("Alimento")) {
								System.out.println("-------------------------------------------EXCLUSÃO DE PRODUTOS DE ALIMENTOS------------------------------------------");
								System.out.print("Nome do produto: ");
								String nomeDoAlimento=entrada.nextLine();
								System.out.println(alimentoDAO.remover(nomeDoAlimento));
								System.out.println("----------------------------------------------------------------------------------------------------------------------");
								
							}
							else if(categoriaDeExclusão.equals("Limpeza")) {
								System.out.println("-------------------------------------------EXCLUSÃO DE PRODUTOS DE LIMPEZA------------------------------------------");
								System.out.print("Nome do produto: ");
								String nomeLimpeza=entrada.nextLine();
								System.out.println(limpezaDAO.remover(nomeLimpeza));
								System.out.println("--------------------------------------------------------------------------------------------------------------------");
							}
							else if(categoriaDeExclusão.equals("Higiene")) {
								System.out.println("-------------------------------------------EXCLUSÃO DE PRODUTOS DE HIGIENE------------------------------------------");
								System.out.print("Nome do produto: ");
								String nomeHigiene=entrada.nextLine();
								System.out.println(higieneDAO.remover(nomeHigiene));
								System.out.println("--------------------------------------------------------------------------------------------------------------------");
							}
							
							else  {
								System.out.println("comando invalido ");
								
							}
							System.out.print("Deseja continuar excluindo produtos? s/n: ");
							String desejo=entrada.nextLine();
							if(desejo.equals("n")) {
								break;
							}
  							}
							
						}
						
						
						
						else if(comandoProdutos==4) {
							break;
						}
						
						
						}
						break;
						
						
						
						
					case 4:
						break;
						
						
						
					default:
						System.out.println("Comando invalido");
						
					}
					
					if(comando==4) {
						
						break;
						
					}
					}
					
				}
				
				
				else if(resultado=="senha incorreta") {
					System.out.println("senha incorreta");
				}
				else {
					
					System.out.println("Esse funcionario não possui cadastro");
					
				}
				break;
				
			case 2:
				
			while(true) {
				System.out.println("-------------------------TELA DE CADASTRO---------------------------------------------");
				Funcionario funcionario=new Funcionario();
			//int comando=0;
			System.out.print("Nome do Funcionario: ");	
			funcionario.setNome(entrada.nextLine());
			System.out.print("CPF: ");
			funcionario.setCpf(entrada.nextLine());
			System.out.print("Data de Nascimento: ");
			funcionario.setDataDeNascimento(entrada.nextLine());
			System.out.print("Senha:  ");
			funcionario.setSenha(entrada.nextLine());
			System.out.print("Confirme sua Senha:  ");
			String confSenha=entrada.nextLine();
			
			
			System.out.println("Para CADASTRAR digite 1 \n "+" Para CANCELAR digite 2");
			System.out.print("Digite uma ação: ");
			comando=Integer.parseInt(entrada.nextLine());
			
			if(comando==1) {
				int resultado1=funcionarioDAO.adicionar(funcionario, confSenha);
				if(resultado1==0) {
				System.out.println("CPF é um campo obrigatório");
				}
				else if(resultado1==1){
					System.out.println("Senhas não correspondem");
				}
				else if(resultado1==2) {
					
					System.out.println("Funcionario já possui cadastro");
					
				}
				else {
					
					System.out.println("Funcionario cadastrado com sucesso ");
					break;
					
				}
			}
			else if(comando==2) {
				
				break;
				
				
			}
			else {
				
				System.out.println("Comando invalido ");
				
			}
				
				
				
			}
			
			}
			}
			
			
		}
}
	
		
		
		

	
