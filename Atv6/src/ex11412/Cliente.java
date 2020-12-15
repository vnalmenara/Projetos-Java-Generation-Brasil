package ex11412;

public class Cliente {
	
	public String nomeCliente;
	public String generoCliente;
	public int anoNascimento;
	public String endereçoCliente;
	public boolean nacionalidade;
	

	public Cliente(String nomeCliente, String generoCliente, int anoNascimento, 
			String endereçoCliente, boolean nacionalidade) {
		
		this.nomeCliente = nomeCliente;
		this.generoCliente = generoCliente;
		this.anoNascimento = anoNascimento;
		this.endereçoCliente = endereçoCliente;
		this.nacionalidade = nacionalidade;
		
	}
	
	public double desconto() {
		int idade = idade();
		if(idade <= 20) {
			return 0.15;
		}
		else if(idade <= 40) {
			return 0.25;
		}
		else if(idade <= 60) {
			return 0.35;
		}
		else{
			return 0.5;
		}
	}
	
	public int idade() {
		return 2020 - this.anoNascimento;
	}
	
}
