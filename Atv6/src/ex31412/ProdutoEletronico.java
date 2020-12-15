package ex31412;

public class ProdutoEletronico {
	
	public String tipo;
	public int voltagem;
	public char porte;
	public String marca;
	public boolean ligado;
	
	public ProdutoEletronico(String tipo, int voltagem, char porte, String marca, boolean ligado) {
		
		this.tipo = tipo;
		this.voltagem = voltagem;
		this.porte = porte;
		this.marca = marca;
		this.ligado = ligado;
		
	}
	
	public void turnOn () {
		if(this.ligado) {
			System.out.println("O produto eletr�nico j� est� ligado.");
		}
		else {
			this.ligado = true;
			System.out.println("O produto eletr�nico foi ligado.");
		}
	}
	
	public void turnOff () {
		if(!this.ligado) {
			System.out.println("O produto eletr�nico j� est� desligado.");
		}
		else {
			this.ligado = false;
			System.out.println("O produto eletr�nico foi desligado.");
		}
	}
	
}
