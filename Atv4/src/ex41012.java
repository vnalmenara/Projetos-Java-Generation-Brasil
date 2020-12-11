import java.util.Scanner;

public class ex41012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int linha=3, coluna=3;
		int valores[][] = new int [linha][coluna];
		int soma=0, somaDiagonal=0, l, c;
		
		for(l = 0; l < linha; l++) {
			for(c = 0; c < coluna; c++) {
				System.out.printf("Informe alguns números para preencher a matriz[%d x %d]: ", l, c);
				valores[l][c] = scan.nextInt();
				
				soma = soma + valores[l][c];
				
				if(l == c) {
					somaDiagonal = somaDiagonal + valores[l][c];
				}
			}
			
		}
		
		System.out.printf("A soma dos valores informados na matriz é ", soma);
		System.out.println("A soma dos valores da diagonal principal é " + somaDiagonal);
	
		scan.close();
	}

}
