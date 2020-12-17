package exercicio;

public class Produto {
	
	private String tipo;
	private String codigo;
	private double preco;
	private int qtdeEstoque;
	
	public Produto(String tipo, String codigo, double preco, int qtdeEstoque) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	
	
}
