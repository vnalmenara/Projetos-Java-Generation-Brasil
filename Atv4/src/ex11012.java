import java.util.Scanner;

public class ex11012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int indice, maiorValor=0;
		int vetor[] = new int[5];
		
		for(indice = 0; indice < 5; indice++) {
			System.out.printf("Informe a pontua��o da %d� atividade: ", indice+1);
			vetor[indice] = scan.nextInt();
		}
		
		System.out.printf("As pontua��es das atividades foram: ");
		
		for(indice = 0; indice < 5; indice++) {
			System.out.printf(" | %d", vetor[indice]);
			
			if(vetor[indice] > maiorValor) {
				maiorValor = vetor[indice];
			}
		}
		
		System.out.println();
		System.out.printf("A maior pontua��o informada foi: %d", maiorValor);
		
		scan.close();
		
	}

}
