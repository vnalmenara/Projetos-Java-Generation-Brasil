package ex31412;

public class Exercicio3 {

	public static void main(String[] args) {
		
		ProdutoEletronico televisao = new ProdutoEletronico("Televisor", 110, 'M', "Panasonic", false);
		
		System.out.println("O produto eletrônico é do tipo: " + televisao.tipo);
		System.out.println("Voltagem: " + televisao.voltagem);
		System.out.println("Tamanho do aparelho: " + televisao.porte);
		System.out.println("Marca: " + televisao.marca);
		
		televisao.turnOn();
		
		televisao.turnOn();
		
		televisao.turnOff();
		
	}

}
