import java.util.Scanner;

public class ex31012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int linha=4, coluna=6;
		int n1[][] = new int[linha][coluna];
		int n2[][] = new int[linha][coluna];
		int m1[][] = new int[linha][coluna];
		int m2[][] = new int[linha][coluna];
		int l, c;
		
		linha();
		pula();
		System.out.print("MATRIZ N1");
		pula();
		linha();
		pula();
		
		for(l = 0; l < linha; l++) {
			for(c = 0; c < coluna; c++) {
				System.out.println("Informe alguns números para preencher a matriz: ");
				n1[l][c] = scan.nextInt();
			}
			pula();
		}
		
		pula();
		linha();
		pula();
		System.out.print("MATRIZ N2");
		pula();
		linha();
		pula();
		
		for(l = 0; l < linha; l++) {
			for(c = 0; c < coluna; c++) {
				System.out.println("Informe alguns números para preencher a matriz: ");
				n2[l][c] = scan.nextInt();
			}
			pula();
		}
		
		pula();
		linha();
		pula();
		System.out.print("MATRIZ M1");
		pula();
		linha();
		pula();
		
		for(l = 0; l < linha; l++) {
			for(c = 0; c < coluna; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
				System.out.printf(" | %d", m1[l][c]);
				
			}
			pula();
		}
		
		pula();
		linha();
		pula();
		System.out.print("MATRIZ M2");
		pula();
		linha();
		pula();
		
		for(l = 0; l < linha; l++) {
			for(c = 0; c < coluna; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.printf(" | %d", m2[l][c]);
				
			}
			pula();
		}
		
		scan.close();

	}
	
	public static void pula() {
		System.out.print("\n");
	}
	
	public static void linha() {
		for(int i = 1; i <= 15; i++) {
			System.out.print("*");
		}
	}

}
