import java.util.Scanner;

public class ex61112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l, c;
		double vetor[] = new double [3]; 
		double matriz[][] = new double [3][3]; 
		double matrizResposta[][] = new double [3][3];
		
		for(c = 0; c < 3; c++) {
			System.out.printf("Informe um número para ser armazenado no vetor[%d]: ", c);
			vetor[c] = scan.nextDouble();
		}
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				System.out.printf("Informe um número para ser armazenado na matriz [%d][%d]", l, c);
				matriz[l][c] = scan.nextDouble();
			}
		}
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				matrizResposta[l][c] = matriz[l][c] * vetor[c];
				System.out.printf("\t %.1f", matrizResposta[l][c]);
			}
			
			System.out.println();
		}
	
		scan.close();
	}
	
}
