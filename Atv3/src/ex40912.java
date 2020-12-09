import java.util.Scanner;

public class ex40912 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro: ");
		numero = scan.nextInt();
		
		System.out.println(numero);
		
		while(numero < 100) {
			numero = numero * 3;
			System.out.println(numero);
		}
		
		scan.close();
		
	}

}
