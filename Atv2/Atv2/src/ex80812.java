import java.util.Scanner;

public class ex80812 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n;
		int limite=100;
		
		System.out.println("Informe um n�mero: ");
		n = scan.nextDouble();
		
		if(n > limite) {
			System.out.println("O n�mero escolhido foi: " + n);
		}
		else {
			System.out.println("Fim do Programa");
		}
		
		scan.close();
	}

}
