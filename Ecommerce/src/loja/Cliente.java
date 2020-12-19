package loja;

import java.util.Calendar;

public class Cliente extends Pessoa {
	
	private String cpf;

	public Cliente() {
	}
	
	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void corrigeCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void boasVindas() {
		if (super.getGenero() == 'M' || super.getGenero() == 'm') {
			System.out.println("SEJA BEM-VINDO AO BRILHO ETERNO SR. " + super.getNome());
		} 
		else if(super.getGenero() == 'F' || super.getGenero() == 'f') {
			System.out.println("SEJA BEM-VINDA AO BRILHO ETERNO SRa. " + super.getNome());
		}
		else {
			System.out.println("SEJA BEM-VINDX AO BRILHO ETERNO SRx. " + super.getNome());
		}
	}
	
	public int voltaIdade() {
		return  Calendar.getInstance().get(Calendar.YEAR) - super.getAnoNascimento();
	}
	
}
