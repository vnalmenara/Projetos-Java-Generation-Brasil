import java.util.Scanner;

public class ex80712 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, distribuidor, impostos, custoConsumidor;
		
		System.out.println("Informe o custo de f�brica na produ��o do ve�culo: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;

		custoConsumidor = custoFabrica + distribuidor + impostos;
		
		System.out.println("Considerando o custo de f�brica informado, o custo ao consumidor ser� de: "+ custoConsumidor);
		
		leia.close();

	}

}
