package banco;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
		int dia=1, continuar, menu=0, numeroConta, submenu=0, dataUsuario;
		boolean encontrado=false;
		double valor, valorEmprestimo;
		
		clientes = inicializa();
		
		do {
			
			System.out.println("Dia: " + dia);
			
			System.out.print("DIGITE O NÚMERO DA CONTA: ");
			numeroConta = scan.nextInt();

			for (int i = 0; i < 40; i++) {
				if (numeroConta == clientes.get(i).getCc().getNumeroConta()+1) {
					encontrado = true;
				}
			}
			
			if(encontrado) {
				numeroConta--;
				clientes.get(numeroConta).boasVindas();
				
				do {
					System.out.println("▬▬▬▬▬ CONTAS DISPONÍVEIS ▬▬▬▬▬");
					System.out.println("[1] - Conta Corrente");
					System.out.println("[2] - Conta Poupança");
					System.out.println("[3] - Conta Especial");
					System.out.println("[4] - Conta Empresa");
					System.out.println("[5] - Conta Universitária");
					System.out.println("[6] - SAIR");
					menu = scan.nextInt();
					
					switch(menu) {
					
					case 1:{ //CONTA CORRENTE
						do {
							System.out.println("▬▬▬▬▬ SERVIÇOS DISPONÍVEIS ▬▬▬▬▬");
							System.out.println("[1] - Consultar Saldo");
							System.out.println("[2] - Realizar Depósito");
							System.out.println("[3] - Realizar Saque");
							System.out.println("[4] - Emitir Talão");
							System.out.println("[5] - SAIR");
							submenu = scan.nextInt();
							
							switch(submenu) {
							
							case 1:
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCc().saldoAtual());
							break;	
							
							case 2:
								System.out.println("Informe o valor a ser depositado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCc().credito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCc().saldoAtual());
								
							break;	
							
							case 3:
								System.out.println("Informe o valor a ser sacado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCc().debito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCc().saldoAtual());
								
							break;	
							
							case 4:
								System.out.printf("Você possui %d talão(ões) de cheque(s) disponível(is)\n", clientes.get(numeroConta).getCc().talaoRestante());
								
								if(clientes.get(numeroConta).getCc().talaoRestante() != 0) {
									System.out.printf("Deseja emitir talão de cheque? (1)-SIM /(2)-NÃO: ");
									continuar = scan.nextInt();
									
									if(continuar == 1) {
										clientes.get(numeroConta).getCc().emitirTalao();
									}	
								}
								
							break;	
							
							case 5:
								System.out.println("Você optou por sair da Conta Corrente.");
							break;	
							
							default:
								System.out.println("Opção inválida!");
							break;	
														
							}
							
						}while(submenu != 5);
					break;	
					}
					
					case 2:{ // CONTA POUPANÇA
						do {
							System.out.println("▬▬▬▬▬ SERVIÇOS DISPONÍVEIS ▬▬▬▬▬");
							System.out.println("[1] - Consultar Saldo");
							System.out.println("[2] - Realizar Depósito");
							System.out.println("[3] - Realizar Saque");
							System.out.println("[4] - Verificar Aniversário da Conta");
							System.out.println("[5] - SAIR");
							submenu = scan.nextInt();
							
							switch(submenu) {
							
							case 1:
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCp().saldoAtual());
							break;	

							case 2:
								System.out.println("Informe o valor a ser depositado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCp().credito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCp().saldoAtual());
							break;	
						
							case 3:
								System.out.println("Informe o valor a ser sacado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCp().debito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCp().saldoAtual());
							break;	
							
							case 4:
								System.out.println("Veja se hoje é o aniversário da sua conta!");
								System.out.println("Digite a data [dd]:");
								dataUsuario = scan.nextInt();
								
								clientes.get(numeroConta).getCp().correcaoAniversario(dataUsuario);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCp().saldoAtual());
							break;	
							
							case 5:
								System.out.println("Você optou por sair da Conta Poupança.");
							break;	
							
							
							default:
								System.out.println("Opção inválida!");
							break;	
														
							}
							
						}while(submenu != 5);
					break;	
					}
					
					case 3:{ // CONTA ESPECIAL
						do {
							System.out.println("▬▬▬▬▬ SERVIÇOS DISPONÍVEIS ▬▬▬▬▬");
							System.out.println("[1] - Consultar Saldo e Limite(Cheque Especial)");
							System.out.println("[2] - Realizar Depósito");
							System.out.println("[3] - Realizar Saque");
							System.out.println("[4] - Emitir Talão");
							System.out.println("[5] - SAIR");
							submenu = scan.nextInt();
							
							switch(submenu) {
							
							case 1:
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCe().saldoAtual());
								
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCe().consultarLimite());
																
							break;	
							
							case 2:
								System.out.println("Informe o valor a ser depositado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCe().credito(valor);
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCe().saldoAtual());
								
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCe().consultarLimite());
							break;	
							
							case 3:
								System.out.println("Informe o valor a ser sacado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCe().debito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCe().saldoAtual());
								
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCe().consultarLimite());
							break;	
							
							case 4:
								System.out.printf("Você possui %d talão(ões) de cheque(s) disponível(is)\n", clientes.get(numeroConta).getCe().talaoRestante());
								
								if(clientes.get(numeroConta).getCe().talaoRestante() != 0) {
									System.out.printf("Deseja emitir talão de cheque? (1)-SIM /(2)-NÃO: ");
									continuar = scan.nextInt();
									
									if(continuar == 1) {
										clientes.get(numeroConta).getCe().emitirTalao();
									}	
								}
								
							break;	
							
							case 5:
								System.out.println("Você optou por sair da Conta Especial.");
							break;	
							
							default:
								System.out.println("Opção inválida!");
							break;	
														
							}
							
						}while(submenu != 5);
					break;	
					}
						
					case 4:{ //CONTA EMPRESARIAL
						do {
							System.out.println("▬▬▬▬▬ SERVIÇOS DISPONÍVEIS ▬▬▬▬▬");
							System.out.println("[1] - Consultar Saldo e valor disponível para Empréstimo");
							System.out.println("[2] - Realizar Depósito");
							System.out.println("[3] - Realizar Saque");
							System.out.println("[4] - Emitir Talão");
							System.out.println("[5] - Solicitar Empréstimo");
							System.out.println("[6] - SAIR");
							submenu = scan.nextInt();
							
							switch(submenu) {
							
							case 1:
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCemp().saldoAtual());
								
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCemp().consultarEmprestimo());
							break;	
							
							case 2:
								System.out.println("Informe o valor a ser depositado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCemp().credito(valor);
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCemp().saldoAtual());
								
							break;	
							
							case 3:
								System.out.println("Informe o valor a ser sacado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCemp().debito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCemp().saldoAtual());
							break;	
							
							case 4:
								System.out.printf("Você possui %d talão(ões) de cheque(s) disponível(is)\n", clientes.get(numeroConta).getCemp().talaoRestante());
								
								if(clientes.get(numeroConta).getCemp().talaoRestante() != 0) {
									System.out.printf("Deseja emitir talão de cheque? (1)-SIM /(2)-NÃO: ");
									continuar = scan.nextInt();
									
									if(continuar == 1) {
										clientes.get(numeroConta).getCemp().emitirTalao();
									}	
								}
								
							break;	
					
							case 5:
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCemp().consultarEmprestimo());
								
								if(clientes.get(numeroConta).getCemp().consultarEmprestimo() != 0) {
									System.out.println("Deseja realizar empréstimo? (1)-SIM/(2)-NÃO: ");
									continuar = scan.nextInt();
									
									if(continuar == 1) {
										System.out.println("Quanto deseja retirar em empréstimo? ");
										valorEmprestimo = scan.nextDouble();
										
										clientes.get(numeroConta).getCemp().pegarEmprestimo(valorEmprestimo);
										System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCemp().consultarEmprestimo());
									}	
								}
							
							break;
							
							case 6:
								System.out.println("Você optou por sair da Conta Empresarial.");
							break;	
							
							default:
								System.out.println("Opção inválida!");
							break;	
														
							}
							
						}while(submenu != 6);
					break;	
					}
					
					case 5:{ // CONTA UNIVERSITARIA
						do {
							System.out.println("▬▬▬▬▬ SERVIÇOS DISPONÍVEIS ▬▬▬▬▬");
							System.out.println("[1] - Consultar Saldo e valor disponível para Empréstimo Universitario");
							System.out.println("[2] - Realizar Depósito");
							System.out.println("[3] - Realizar Saque");
							System.out.println("[4] - Emitir Talão");
							System.out.println("[5] - Solicitar Empréstimo");
							System.out.println("[6] - SAIR");
							submenu = scan.nextInt();
							
							switch(submenu) {
							
							case 1:
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCuni().saldoAtual());
								
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCuni().consultarEmprestimo());
							break;	
							
							case 2:
								System.out.println("Informe o valor a ser depositado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCuni().credito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCuni().saldoAtual());
							break;	
							
							case 3:
								System.out.println("Informe o valor a ser sacado: ");
								valor = scan.nextDouble();
								
								clientes.get(numeroConta).getCuni().debito(valor);
								
								System.out.println("Seu saldo atual é de: " + clientes.get(numeroConta).getCuni().saldoAtual());
							break;	
							
							case 4:
								System.out.printf("Você possui %d talão(ões) de cheque(s) disponível(is)\n", clientes.get(numeroConta).getCuni().talaoRestante());
								
								if(clientes.get(numeroConta).getCuni().talaoRestante() != 0) {
									System.out.printf("Deseja emitir talão de cheque? (1)-SIM /(2)-NÃO: ");
									continuar = scan.nextInt();
									
									if(continuar == 1) {
										clientes.get(numeroConta).getCuni().emitirTalao();
									}	
								}
								
							break;	
					
							case 5:
								System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCuni().consultarEmprestimo());
								
								if(clientes.get(numeroConta).getCuni().consultarEmprestimo() != 0) {
									System.out.println("Deseja realizar empréstimo? (1)-SIM/(2)-NÃO: ");
									continuar = scan.nextInt();
									
									if(continuar == 1) {
										System.out.println("Quanto deseja retirar em empréstimo? ");
										valorEmprestimo = scan.nextDouble();
										
										clientes.get(numeroConta).getCuni().pegarEmprestimo(valorEmprestimo);
										System.out.println("Seu limite disponível é de: " + clientes.get(numeroConta).getCuni().consultarEmprestimo());
									}	
								}
							
							break;
							
							case 6:
								System.out.println("Você optou por sair da Conta Universitária.");
							break;	
							
							default:
								System.out.println("Opção inválida!");
							break;	
														
							}
							
						}while(submenu != 6);
						
					break;	
					}
							
					case 6:{
						System.out.println("Você optou por sair! Volte sempre :)");
					break;	
					}
					
					default:{
						System.out.println("Opção inválida!");
					break;	
					}
					
					}
				
				}while(menu != 6);
			
			}
			else {
				System.out.print("Cliente não localizado.");
			}
				
			System.out.println("Deseja continuar? (1)-SIM / (2)-NÃO: ");
			continuar = scan.nextInt();
			if(continuar == 2) {
				dia = 0;
			}
			else {
				dia++;
				clientes.get(numeroConta).getCc().fimDia();
			}
			
		}while(dia != 0);		

	}
	
	public static List<Cliente> inicializa(){
		
		String nomes[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires", "Gabriel Enrique Cabral Silva",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos", "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
				"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almenara",
				"Vinicius Alves Miranda" };

		char generos[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M',
				'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
				'M' };
			
		List<Cliente> clientes = new ArrayList<>();
		
		for(int i = 0; i < 40; i++) {
			ContaCorrente ccAtual = new ContaCorrente(i+1);
			ContaPoupanca cpAtual = new ContaPoupanca(i+1);
			ContaEspecial ceAtual = new ContaEspecial(i+1);
			ContaEmpresarial cempAtual = new ContaEmpresarial(i+1);
			ContaUniversitaria cuniAtual = new ContaUniversitaria(i+1);
			
			clientes.add (new Cliente(nomes[i], generos[i], ccAtual, cpAtual, ceAtual, cempAtual, cuniAtual));
						
		}
		
		return clientes;
	}

}
