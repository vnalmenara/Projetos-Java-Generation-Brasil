import java.util.Scanner;

public class ex80812 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n;
		int limite=100;
		
		System.out.println("Informe um número: ");
		n = scan.nextDouble();
		
		if(n > limite) {
			System.out.println("O número escolhido foi: " + n);
		}
		else {
			System.out.println("Fim do Programa");
		}
		
		scan.close();
	}

}
