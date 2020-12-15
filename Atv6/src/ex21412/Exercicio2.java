package ex21412;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Aviao transporte = new Aviao();
		
		transporte.modelo = "Caça";
		transporte.anoFabricacao = 1978;
		transporte.numeroPassageiros = 2;
		transporte.Fabricante = "Embraer";
		transporte.lotado = true;
		
		System.out.println("Modelo: " + transporte.modelo);
		System.out.println("Ano de fabricação: " + transporte.anoFabricacao);
		System.out.println("Capacidade máxima de passageiros-tripulantes: " + transporte.numeroPassageiros);
		System.out.println("Fabricação da aeronave: " + transporte.Fabricante);


		if(transporte.lotado) {
			System.out.println("Aeronave lotada.");
		}
		else {
			System.out.println("Aeronave não lotada.");
		}
		
		System.out.println("A aeronave tem: " + transporte.idade() + " anos de serviço");

	}

}
