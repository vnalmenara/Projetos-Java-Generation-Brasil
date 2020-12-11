import java.util.Scanner;

public class ex51112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int codigo, i;
		double vetor[] = new double [5];
		
		for(i = 0; i < 5; i++) {
			System.out.println("Informe um n�mero para ser armazenado: ");
			vetor[i] = scan.nextDouble();
			
		}
		
		do {
			System.out.println("\nInforme um c�digo: ");
			System.out.println("(0) - SAIR");
			System.out.println("(1) - Mostrar vetor na ordem direta");
			System.out.println("(2) - Mostrar vetor na ordem inversa");
			System.out.println("Op��o: ");
			codigo = scan.nextInt();
			
			if(codigo == 0) {
				System.out.println("Voc� optou por sair do programa");			
			}
			else if(codigo == 1) {
				for(i = 0; i < 5; i++) {
					System.out.printf(" | %.1f", vetor[i]);
				}
			}
			else if(codigo == 2) {
				for(i = 4; i >= 0; i--) {
					System.out.printf(" | %.1f", vetor[i]);
				}
			}
			else {
				System.out.println("C�digo digitado inv�lido.");
			}
		}while(codigo != 0);
		
		scan.close();
	}

}
