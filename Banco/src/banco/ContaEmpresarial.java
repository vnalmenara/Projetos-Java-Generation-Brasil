package banco;

public class ContaEmpresarial extends ContaCorrente {
	
	private double emprestimo;

	public ContaEmpresarial(int numeroConta) {
		super(numeroConta);
		this.emprestimo = 10000;
	}
	
	public void pegarEmprestimo(double valorEmprestimo) {
		if (valorEmprestimo < this.emprestimo) {
			this.emprestimo -= valorEmprestimo;
			super.credito(valorEmprestimo);
		} 
		else {
			System.out.println("N�o h� limite dispon�vel para a opera��o!");
		}
	}
	
	public double consultarEmprestimo() {
		return this.emprestimo;
	}
	
}
