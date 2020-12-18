package banco;

public class Conta {
	
	private double saldo;
	private int numeroConta;
	private int limiteMovimentacao;
	
	public Conta(int numeroConta) {
		this.saldo = 0;
		this.numeroConta = numeroConta;
		this.limiteMovimentacao = 10;
	}

	public int getLimiteMovimentacao() {
		return limiteMovimentacao;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setLimiteMovimentacao(int limiteMovimentacao) {
		this.limiteMovimentacao = limiteMovimentacao;
	}
	
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
		this.limiteMovimentacao--;
		System.out.println("Movimentações restantes: " + this.limiteMovimentacao);
	}
	
	public void debito(double valor) {
		if(valor < this.saldo) {
			this.saldo = this.saldo - valor;
			this.limiteMovimentacao--;
			System.out.println("Movimentações restantes: " + this.limiteMovimentacao);
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public double saldoAtual() {
		return this.saldo;
	}
	
	public void fimDia() {
		this.limiteMovimentacao = 10;
		
	}
	
}
