
public class Fornecedor extends Pessoa {
	
	private double valorCredito; //correspondente ao cr�dito m�ximo atribu�do ao fornecedor
	private double valorDivida; //montante da d�vida para com o fornecedor
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
	
	
}
