package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		char opcaoMenu, opcaoSUBmenu, opcaoCarrinho, opcaoPagamento, opcaoGerenciaEstoque;
		int cadastro=0, codigoNumerico;
		String codigoEscolhido;
		double totalPreco=0, totalImposto=0;
		
		Scanner scan = new Scanner(System.in);
		Cliente clienteAtual = new Cliente();
		List<Produto> joias = inicializa();
		
		pula();
		linhaCima();
		pula();
		System.out.println("           BRILHO ETERNO           ");
		System.out.println(" Ressalte também sua luz exterior  ");
		linhaBaixo();
		
		do {
			pula();
			pula();
			linhaSimplesCurta();
			pula();
			System.out.println("          MENU PRINCIPAL       ");
			linhaSimplesCurta();
			pula();
			System.out.println("[1] - COMPRAR PRODUTO");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			pula();
			System.out.print("Digite sua opcao: ");
			opcaoMenu = scan.next().charAt(0);
			linhaSimplesCurta();
			pula();
			
			
			switch(opcaoMenu) {
				
				case '1':
					
					do {
						pula();
						pula();
						linhaSimplesCurta();
						pula();
						System.out.println("          ÁREA DO CLIENTE");
						linhaSimplesCurta();
						pula();
						System.out.println("[1] - CADASTRO");
						System.out.println("[2] - ADICIONAR PRODUTO AO CARRINHO");
						System.out.println("[3] - EXIBIR CARRINHO");
						System.out.println("[4] - REMOVER PRODUTO DO CARRINHO");
						System.out.println("[5] - COMPRAR");
						System.out.println("[6] - EXIBIR PERFIL CLIENTE");
						System.out.println("[7] - VOLTAR AO MENU PRINCIPAL");
						pula();
						System.out.print("Digite sua opcao: ");
						opcaoSUBmenu = scan.next().charAt(0);linhaSimplesCurta();
						pula();
			
						
						switch(opcaoSUBmenu) {
						
							case '1':
																
								System.out.print("Informe o seu nome: ");
								clienteAtual.setNome(scan.next().toUpperCase());
								
								System.out.print("Gênero que se identifica: [M]Masculino - [F]Feminino - [O]Outros: ");
								clienteAtual.setGenero(scan.next().toUpperCase().charAt(0));
								
								System.out.print("Informe seu número de CPF: ");
								clienteAtual.corrigeCpf(scan.next());
								
								System.out.print("Informe seu ano de nascimento: ");
								clienteAtual.setAnoNascimento(scan.nextInt());
								
								cadastro = 1;
								
							break;
							
							case '2':
								exibirEstoque(joias);
								
								System.out.println("Selecione uma jóia pelo código correspondente: ");
								codigoNumerico = converteCodigoProduto(scan.next().toUpperCase());
								linhaSimples();
								pula();
								
								System.out.println("Informe a quantidade desejada do produto selecionado: ");
								joias.get(codigoNumerico).adicionaCarrinho(scan.nextInt());
							break;
							
							case '3':
								linhaSimples();
								pula();
								System.out.println("CÓDIGO\t\tR$(UN)\t\tCARRINHO\t\tPRODUTO");
								linhaSimples();
								pula();
								
								for (Produto joia : joias){
									System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",joia.getCodigo(), joia.getPrecoUnitario(), joia.getQtdeCarrinho(), joia.getNomeProduto());
								}
								
								linhaSimples();
								pula();
							break;
								
							case '4':
								linhaSimplesCurta();
								pula();
								System.out.println("        REMOÇÃO DE ITENS");
								linhaSimplesCurta();
								pula();
								System.out.println("[1] - REMOVER ITEM");
								System.out.println("[2] - LIMPAR CARRINHO");
								System.out.println("[3] - VOLTAR");
								pula();
								System.out.print("Digite sua opcao: ");
								opcaoCarrinho = scan.next().charAt(0);
								linhaSimplesCurta();
								pula();
								if(opcaoCarrinho == '1') {
									linhaSimples();
									pula();
									System.out.println("CÓDIGO\t\tR$(UN)\t\tCARRINHO\t\tPRODUTO");
									linhaSimples();
									pula();
									
									for (Produto joia : joias){
										System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",joia.getCodigo(), joia.getPrecoUnitario(), joia.getQtdeCarrinho(), joia.getNomeProduto());
									}
									
									linhaSimples();
									pula();
									
									System.out.println("Digite o código do produto a remover: ");
									codigoNumerico = converteCodigoProduto(scan.next().toUpperCase());
									
									System.out.println("Digite a quantidade a ser removida do produto selecionado: ");
									joias.get(codigoNumerico).removeCarrinho(scan.nextInt());
								}
								else if(opcaoCarrinho == '2') {
									limparCarrinho(joias);
									System.out.println("Você limpou o Carrinho!");
								}
								
							break;
							
							case '5':
								if(cadastro == 1) {
									for (Produto joia : joias){
										totalPreco += joia.venda();
									}
									
									linhaSimplesCurta();
									pula();
									System.out.println("        FORMAS DE PAGAMENTO");
									linhaSimplesCurta();
									pula();
									System.out.printf("[1] - A VISTA = R$ %.2f + R$ %.2f de impostos\n", (totalPreco - (totalPreco * 0.1)), ((totalPreco - (totalPreco * 0.1)) * 0.09));
									System.out.printf("[2] - DÉBITO = R$ %.2f + R$ %.2f de impostos\n", totalPreco, (totalPreco * 0.09));
									System.out.printf("[3] - CRÉDITO = R$ %.2f + R$ %.2f de impostos\n", totalPreco + (totalPreco * 0.05), ((totalPreco + (totalPreco * 0.05)) * 0.09));
									System.out.printf("[4] - 3X COM JUROS = R$ %.2f + R$ %.2f de impostos\n" , totalPreco + (totalPreco * 0.1), ((totalPreco + (totalPreco * 0.1)) * 0.09));
									System.out.println("[5] - VOLTAR");
									pula();
									System.out.print("Digite sua opcao: ");
									opcaoPagamento = scan.next().charAt(0);
									pula();
									linhaSimplesCurta();
									pula();
									
									
									pula();
									pula();
									linhaCima();
									pula();
									System.out.print("            NOTA FISCAL");
									pula();
									linhaBaixo();
									pula();
									pula();
									
									if(opcaoPagamento == '1') {
										System.out.printf("COMPRA REALIZADA A VISTA = R$ %.2f + R$ %.2f de impostos\n", (totalPreco - (totalPreco * 0.1)), ((totalPreco - (totalPreco * 0.1)) * 0.09));
										retiraItensEstoque(joias);
										limparCarrinho(joias);
										totalPreco = 0;
									}
									else if(opcaoPagamento == '2') {
										System.out.printf("COMPRA REALIZADA NO DÉBITO = R$ %.2f + R$ %.2f de impostos\n", totalPreco, (totalPreco * 0.09));
										retiraItensEstoque(joias);
										limparCarrinho(joias);
										totalPreco = 0;
									}
									else if(opcaoPagamento == '3') {
										System.out.printf("COMPRA REALIZADA NO CRÉDITO = R$ %.2f + R$ %.2f de impostos\n", totalPreco + (totalPreco * 0.05), ((totalPreco + (totalPreco * 0.05)) * 0.09));
										retiraItensEstoque(joias);
										limparCarrinho(joias);
										totalPreco = 0;
									}
									else if(opcaoPagamento == '4') {
										System.out.printf("COMPRA REALIZADA EM 3X COM JUROS = R$ %.2f + R$ %.2f de impostos\n" , totalPreco + (totalPreco * 0.1), ((totalPreco + (totalPreco * 0.1)) * 0.09));
										retiraItensEstoque(joias);
										limparCarrinho(joias);
										totalPreco = 0;
									}
									
									linhaSimples();
									pula();
								}
								else {
									System.out.println("Realize o cadastro para efetuar a compra");
								}
							break;
								
							case '6':
								if (cadastro == 1) {
									linhaSimplesCurta();
									pula();
									System.out.println("           PERFIL CLIENTE");
									linhaSimplesCurta();
									pula();
									System.out.println("NOME: " + clienteAtual.getNome());
									System.out.println("GÊNERO: " + clienteAtual.getGenero());
									System.out.println("NÚMERO DE CPF: " + clienteAtual.getCpf());
									System.out.println("ANO DE NASCIMENTO: " + clienteAtual.getAnoNascimento());
									System.out.println("IDADE: " + clienteAtual.voltaIdade());
									pula();
									linhaSimplesCurta();
									pula();
									
								} else {
									System.out.println("Realize o cadastro para visualizar perfil");
								}
							break;
							
							case '7':
								System.out.println("Voltando...");
							break;
							
							default:
								System.out.println("Opção inválida.");
							break;
							
						}
					}while(opcaoSUBmenu != '6');
					
				break;
				
				case '2':
					do {
						pula();
						linhaSimplesCurta();
						pula();
						System.out.println("    GERENCIAMENTO DE ESTOQUE");
						linhaSimplesCurta();
						pula();
						System.out.println("[1] - ADICIONAR AO ESTOQUE");
						System.out.println("[2] - REMOVER ESTOQUE");
						System.out.println("[3] - EXIBIR ESTOQUE");
						System.out.println("[4] - VOLTAR AO MENU PRINCIPAL");
						pula();
						System.out.print("Digite sua opcao: ");
						opcaoGerenciaEstoque = scan.next().charAt(0);
						linhaSimplesCurta();
						pula();
	
						switch(opcaoGerenciaEstoque) {
						
						case '1':
							exibirEstoque(joias);
							
							System.out.println("Selecione uma jóia pelo código para adicionar ao estoque: ");
							codigoNumerico = converteCodigoProduto(scan.next().toUpperCase());
							linhaSimples();
							pula();
							
							System.out.println("Informe a quantidade a ser adicionada: ");
							joias.get(codigoNumerico).adicionaEstoque(scan.nextInt());
							
						break;
						
						case '2':
							exibirEstoque(joias);
							
							System.out.println("Selecione uma jóia pelo código para retirar do estoque: ");
							codigoNumerico = converteCodigoProduto(scan.next().toUpperCase());
							
							linhaSimples();
							pula();
							
							System.out.println("Informe a quantidade a ser removida: ");
							joias.get(codigoNumerico).tiraEstoque(scan.nextInt());
							
						break;
							
						case '3':
							exibirEstoque(joias);
						break;

						case '4':
							System.out.println("Voltando...");
						break;
						
						default:
							System.out.println("Opção inválida.");
						break;
						
						}
					
					}while(opcaoGerenciaEstoque != '4');
					
					
				break;
				
				case '3':
					System.out.println("Você optou por sair da BRILHO ETERNO");
					System.out.println("VOLTE SEMPRE :)");
				break;
				
				default:
					System.out.println("Opção inválida.");
				break;
				
				
			}
		}while(opcaoMenu != '3');
	}
	
	public static void linhaBaixo() {
		for(int i = 1; i <= 37; i++) {
			System.out.print("┬");
		}
	}
	
	public static void linhaCima() {
		for(int i = 1; i <= 37; i++) {
			System.out.print("┴");
		}
	}
	
	public static void linhaSimples() {
		for(int i = 1; i <= 75; i++) {
			System.out.print("-");
		}
	}
	
	public static void linhaSimplesCurta() {
		for(int i = 1; i <= 35; i++) {
			System.out.print("-");
		}
	}
	
	public static void pula() {
		System.out.print("\n");
	}
	
		
	public static void limparCarrinho(List<Produto> joias) {
		for(Produto joia : joias) {
			joia.removeCarrinho(joia.getQtdeCarrinho());
		}
	}
	
	public static void retiraItensEstoque(List<Produto> joias) {
		for(Produto joia : joias) {
			joia.tiraEstoque(joia.getQtdeCarrinho());
		}
	}
	
	public static int converteCodigoProduto(String codigoEscolhido) {
		codigoEscolhido = codigoEscolhido.substring(codigoEscolhido.length()-3);
		return Integer.parseInt(codigoEscolhido)-1;
	}
	
	public static void exibirEstoque(List<Produto> joias) {
		linhaSimples();
		pula();
		System.out.println("CÓDIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
		linhaSimples();
		pula();
		
		for (Produto joia : joias){
			System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",joia.getCodigo(), joia.getPrecoUnitario(), joia.getQtdeProdutoEstoque(), joia.getNomeProduto());
		}
		
		pula();
		linhaSimples();
		pula();
	}
	
	public static List<Produto> inicializa(){
		
		String produtoJoias[] = {"Colar com pingente", "Gargantilha", "Brinco Pequeno", "Brinco Grande", "Escapulário", "Tiara", "Medalhão", "Anel", "Tornozeleira", "Relicário"};

		String codigo [] = {"BTR-001", "BTR-002", "BTR-003", "BTR-004", "BTR-005", "BTR-006", "BTR-007", "BTR-008", "BTR-009", "BTR-010"};
		
		double precoUnitario [] = {40, 35, 5, 10, 15, 50, 90, 5, 20, 90};
		
		
		
		List<Produto> joias = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
					
			joias.add (new Produto(produtoJoias[i], codigo[i], precoUnitario[i], 10));
						
		}
		
		return joias;
	}

}
