import java.util.Scanner;

public class ex20912 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i, soma=0;
		
		for(i = 0; i < 500; i++) {
			if(i % 2 != 0 && i % 3 == 0) {
				soma = soma + i;
				System.out.println(i);
			}
		}
		
		System.out.println("A soma de todos os n�meros �mpares multiplos de tr�s � " + soma);
		
		scan.close();
	}
	
}
