import java.util.Scanner;

public class ex30912 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero=0, soma=0, indice=0, media=0;
		
		while(numero >= 0){
			System.out.println("Informe um n�mero inteiro: ");
			numero = scan.nextInt();
			
			if(numero >=0) {
				soma = soma + numero;
				indice = indice + 1;
			}
			
		}
		
		media = soma / indice;
				
		System.out.println("A soma dos n�meros obtidos alcan�ou " + soma);
		System.out.println("A quantidade de n�meros digitados foi de " + indice);
		System.out.println("A m�dia dos n�mero digitados � " + media);
		
		scan.close();
	}

}
