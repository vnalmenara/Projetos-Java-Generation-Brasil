import java.util.Scanner;

public class ex60912 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero, contador=0, soma=0;
		
		System.out.println("Informe um n�mero inteiro: ");
		numero = scan.nextInt();
		
		do {
			contador = contador + 1;
			System.out.print(" | " + contador);

			soma = soma + contador;
			
		}while(contador < numero);
		
		System.out.println();
		System.out.println("A soma de todos os n�meros at� o pr�prio n�mero digitado � " + soma);
		
		scan.close();
	}

}
