import java.util.Scanner;

public class ex31112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, contador1=0, contador2=0,contador3=0, contador4=0;
		
		do {
			System.out.println("Informe um número inteiro: ");
			numero = scan.nextInt();
			
			if(numero >= 0 && numero <= 25) {
				contador1++;
			}
			else if(numero >= 26 && numero <= 50) {
				contador2++;
			}
			else if(numero >= 51 && numero <= 75) {
				contador3++;	
			}
			else if(numero >= 76 && numero <= 100) {
				contador4++;
			}
			else if(numero >= 101) {
				System.out.println("Número não petencente a nenhum intervalo. Digite novamente");
			}

		}while(numero > 0);
		
		System.out.printf("\n%d números digitados entre 0 e 25.", contador1);
		System.out.printf("\n%d números digitados entre 26 e 50.", contador2);
		System.out.printf("\n%d números digitados entre 51 e 75.", contador3);
		System.out.printf("\n%d números digitados entre 76 e 100.", contador4);
		
		scan.close();
	}

}
