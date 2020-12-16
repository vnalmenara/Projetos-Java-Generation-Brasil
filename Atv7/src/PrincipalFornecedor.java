
public class PrincipalFornecedor {

	public static void main(String[] args) {
		
		Fornecedor provider = new Fornecedor("João", "São Paulo-SP", "(11) 99098-9098", 2000, 500);
		
		System.out.println("**** RELÁTÓRIO DO FORNECEDOR ****");
		
		System.out.println("Nome: " + provider.getNome());
		System.out.println("Endereço: " + provider.getEndereco());
		System.out.println("Telefone Comercial: " + provider.getTelefone());
		System.out.println("Crédito máximo: " + provider.getValorCredito());
		System.out.println("Valor da Dívida: " + provider.getValorDivida());
		System.out.println("Saldo disponível: " + provider.obterSaldo());
		
		provider.setNome("Maria");
		provider.setEndereco("João Pessoa-PB");
		provider.setTelefone("(83) 98237-8237");
		provider.setValorCredito(3000);
		provider.setValorDivida(1500);
		
		System.out.println();
		System.out.println("**** RELÁTÓRIO DO FORNECEDOR ****");
		
		System.out.println("Nome: " + provider.getNome());
		System.out.println("Endereço: " + provider.getEndereco());
		System.out.println("Telefone Comercial: " + provider.getTelefone());
		System.out.println("Crédito máximo: " + provider.getValorCredito());
		System.out.println("Valor da Dívida: " + provider.getValorDivida());
		System.out.println("Saldo disponível: " + provider.obterSaldo());
		
	}

}
