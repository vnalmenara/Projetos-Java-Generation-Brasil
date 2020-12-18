package banco;

public class ContaCorrente extends Conta {
	
	private int talaoCheque;
	private final int LIMITETALAO = 3;
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
		this.talaoCheque = 0;
	}

	public int getTalaoCheque() {
		return talaoCheque;
	}

	public int getLimiteTalao() {
		return LIMITETALAO;
	}
	
	public int talaoRestante() {
		return LIMITETALAO - this.talaoCheque;
	}
	
	public void emitirTalao() {
		this.talaoCheque++;
		System.out.println("Talão emitido sob o número nº 00" + this.talaoCheque);
	}
	
	@Override
	public void fimDia() {
		super.setLimiteMovimentacao(10);
		this.talaoCheque = 3;		
	}
}
