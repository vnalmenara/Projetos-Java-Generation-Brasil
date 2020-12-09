import java.util.Scanner;

public class ex40812 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("O número informado é par e ");
		}
		else {
			System.out.print("O número informado é ímpar e ");
		}
		if(numero >= 0) {
			System.out.print("positivo.");
		}
		else {
			System.out.print("negativo.");
		}
		
		scan.close();
	}

}
