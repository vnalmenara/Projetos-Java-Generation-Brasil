package banco;

import java.util.Random;

public class ContaPoupanca extends Conta {
	
	private int dataAniversario;
	
	Random sorteia = new Random();
	
	public ContaPoupanca(int numeroConta) {
		super(numeroConta);
		this.dataAniversario = sorteia.nextInt(31) + 1;
	}

	public int getDataAniversario() {
		return dataAniversario;
	}

	public void correcaoAniversario(int dataUsuario) {
		if(dataUsuario == this.dataAniversario) {
			super.credito((super.saldoAtual() * 0.0005));	
			System.out.println("Parab�ns! Hoje � anivers�rio da sua conta e seu saldo foi atualizado!");
		}
		else {
			System.out.println("Sinto muito! Hoje n�o � anivers�rio da sua conta :(");
			System.out.println("O anivers�rio da conta ser� no dia: " + this.dataAniversario);
		}
	}

}
