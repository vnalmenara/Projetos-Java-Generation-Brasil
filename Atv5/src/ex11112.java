import java.util.Scanner;

public class ex11112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double etiqueta, condicao;
		int codigoCondicao;
		
		do{
			
			System.out.println("Informe o valor do produto contido na etiqueta: ");
			etiqueta = scan.nextDouble();
			
			System.out.println("Escolha a condi��o de pagamento: ");
			System.out.println("(1) - � vista em dinheiro ou cheque, com 20% de desconto");
			System.out.println("(2) - � vista no cart�o de cr�dito, com 15% de desconto");
			System.out.println("(3) - Em duas vezes sem juros");		
			System.out.println("(4) - Em tr�s vezes com juros de 10%");
			System.out.println("(5) - SAIR");
			codigoCondicao = scan.nextInt();
			
			switch (codigoCondicao){
				case 1:{
					condicao = etiqueta * 0.20;
					etiqueta = etiqueta - condicao;
					System.out.printf("Considerando a condi��o selecionada, o valor a ser pago pelo produto � R$ %.2f", etiqueta);
					System.out.println();
				break;	
				}
				
				case 2:{
					condicao = etiqueta * 0.15;
					etiqueta = etiqueta - condicao;
					System.out.printf("Considerando a condi��o selecionada, o valor a ser pago pelo produto � R$ %.2f", etiqueta);
					System.out.println();
				break;	
				}
				
				case 3:{
					condicao = etiqueta / 2;
					etiqueta = etiqueta - condicao;
					System.out.printf("Considerando a condi��o selecionada, o valor a ser pago pelo produto � 2X R$ %.2f", condicao);
					System.out.println();
				break;	
				}
				
				case 4:{
					condicao = etiqueta * 0.10;
					etiqueta = etiqueta + condicao;
					condicao = etiqueta / 3;
					System.out.printf("Considerando a condi��o selecionada, o valor a ser pago pelo produto � 3X R$ %.2f", condicao);
					System.out.println();
				break;	
				}
				
				case 5:{
					System.out.printf("Voc� optou por sair.");
					System.out.println();
				break;
				}
				
				default: {
					System.out.printf("Op��o inv�lida. Selecione nova op��o.");
					System.out.println();
				break;				
				}
					
			}
			
		}while(codigoCondicao != 5);
		
		scan.close();

	}

}
