import java.util.Scanner;

public class ex21012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int indice, maiorValor=0, ocorrencia=0;
		double media=0, contador=0;
		int dado[] = new int[10];
		
		for(indice = 0; indice < 10; indice++) {
			System.out.printf("Informe o valor obtido na %dª jogada do dado: ", indice+1);
			dado[indice] = scan.nextInt();
		}
		
		for(indice = 0; indice < 10; indice++) {
			System.out.printf(" | %d", dado[indice]);
			
			if(dado[indice] > maiorValor) {
				ocorrencia = 0;
				maiorValor = dado[indice];
				ocorrencia++;
			}
			else if(dado[indice] == maiorValor) {
				ocorrencia++;
			}
			
			contador = contador + dado[indice];
		}
		
		media = contador / 10;
		
		System.out.println();
		System.out.printf("O maior valor nos lançamentos do dado foi %d, ocorrendo %d vezes", maiorValor, ocorrencia);
		System.out.println();
		System.out.println("A média dos valores obtidos nos lançamentos é: " + media);
		
		scan.close();
	}

}
