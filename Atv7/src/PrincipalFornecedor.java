
public class PrincipalFornecedor {

	public static void main(String[] args) {
		
		Fornecedor provider = new Fornecedor("Jo�o", "S�o Paulo-SP", "(11) 99098-9098", 2000, 500);
		
		System.out.println("**** REL�T�RIO DO FORNECEDOR ****");
		
		System.out.println("Nome: " + provider.getNome());
		System.out.println("Endere�o: " + provider.getEndereco());
		System.out.println("Telefone Comercial: " + provider.getTelefone());
		System.out.println("Cr�dito m�ximo: " + provider.getValorCredito());
		System.out.println("Valor da D�vida: " + provider.getValorDivida());
		System.out.println("Saldo dispon�vel: " + provider.obterSaldo());
		
		provider.setNome("Maria");
		provider.setEndereco("Jo�o Pessoa-PB");
		provider.setTelefone("(83) 98237-8237");
		provider.setValorCredito(3000);
		provider.setValorDivida(1500);
		
		System.out.println();
		System.out.println("**** REL�T�RIO DO FORNECEDOR ****");
		
		System.out.println("Nome: " + provider.getNome());
		System.out.println("Endere�o: " + provider.getEndereco());
		System.out.println("Telefone Comercial: " + provider.getTelefone());
		System.out.println("Cr�dito m�ximo: " + provider.getValorCredito());
		System.out.println("Valor da D�vida: " + provider.getValorDivida());
		System.out.println("Saldo dispon�vel: " + provider.obterSaldo());
		
	}

}
