package loja;

public class Produto {
	
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	private int qtdeCarrinho;
	
	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
		this.qtdeCarrinho = 0;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	public int getQtdeCarrinho() {
		return qtdeCarrinho;
	}
	
	public void adicionaCarrinho(int entrada) {
		if(testarEstoque(entrada + this.qtdeCarrinho)) {
			this.qtdeCarrinho = this.qtdeCarrinho + entrada;
		}
		else {
			System.out.println("Não foi possível adicionar ao carrinho. Indisponibilidade de Estoque.");
		}
	}
	
	public void removeCarrinho(int saida) {
		if (saida <= this.qtdeCarrinho) {
			this.qtdeCarrinho -= saida;
		} else {
			this.qtdeCarrinho = 0;
		}
	}

	public void tiraEstoque(int saida) {
		this.qtdeProdutoEstoque -= saida;
	}
	
	public void adicionaEstoque(int entrada) {
		this.qtdeProdutoEstoque = this.qtdeProdutoEstoque + entrada;
	}
	
	public boolean testarEstoque(int valor) {
		if(valor <= this.qtdeProdutoEstoque) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double venda() {
		return this.qtdeCarrinho * this.precoUnitario;	
		
	}
	
	
}
