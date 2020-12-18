package banco;

public class ContaEspecial extends ContaCorrente {
	
	private double limiteEspecial;

	public ContaEspecial(int numeroConta) {
		super(numeroConta);
		this.limiteEspecial = 5000;
	}

	@Override
	public void debito(double valor) {
		if(valor < saldoAtual()) {
			super.debito(valor);
			super.setLimiteMovimentacao(super.getLimiteMovimentacao()-1);
			System.out.println("Movimentações restantes: " + super.getLimiteMovimentacao());
		}
		else if(valor < saldoAtual() + this.limiteEspecial) {
			this.limiteEspecial = this.limiteEspecial - (valor - saldoAtual());
			super.debito(saldoAtual());
			super.setLimiteMovimentacao(super.getLimiteMovimentacao()-1);
			System.out.println("Movimentações restantes: " + super.getLimiteMovimentacao());
		}
		else {
			System.out.println("Não há limite disponível para a operação!");
		}
		
	}
	
	public double consultarLimite() {
		return this.limiteEspecial;
	}
	
	@Override
	public void credito(double valor) {
		if(valor < (5000 - this.limiteEspecial)) {
			this.limiteEspecial += valor;
		}
		else {
			super.credito(valor - (5000 - this.limiteEspecial));
			this.limiteEspecial = 5000;
		}
		super.setLimiteMovimentacao(super.getLimiteMovimentacao()-1);
		System.out.println("Movimentações restantes: " + super.getLimiteMovimentacao());
	}
	
}
