package ex21412;

public class Aviao {
	
	public String modelo;
	public int anoFabricacao;
	public int numeroPassageiros;
	public String Fabricante;
	public boolean lotado;
	
	
	public int idade() {
		return 2020 - this.anoFabricacao;
	}
	
	public void ocupacao() {
		if(this.lotado) {
			System.out.println("Sem assentos disponíveis.");
		}
		else {
			System.out.println("Assentos diponíveis.");
		}
	}
	
	
	
}
