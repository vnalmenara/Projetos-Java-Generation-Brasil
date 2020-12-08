import java.util.Scanner;

public class ex80712 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, distribuidor, impostos, custoConsumidor;
		
		System.out.println("Informe o custo de fábrica na produção do veículo: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;

		custoConsumidor = custoFabrica + distribuidor + impostos;
		
		System.out.println("Considerando o custo de fábrica informado, o custo ao consumidor será de: "+ custoConsumidor);
		
		leia.close();

	}

}
