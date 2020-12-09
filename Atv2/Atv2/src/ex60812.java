import java.util.Scanner;

public class ex60812{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idadeNadador;
		
		System.out.println("Informe a idade do nadador: ");
		idadeNadador = scan.nextInt();
		
		if(idadeNadador < 5) {
			System.out.println("Idade não permitida para nadar");
		}
		else if(idadeNadador >= 5 && idadeNadador <= 7) {
			System.out.println("Nadador na categoria Infantil A");
		}
		else if(idadeNadador >= 8 && idadeNadador <= 11) {
			System.out.println("Nadador na categoria Infantil B");
		}
		else if(idadeNadador >= 12 && idadeNadador <= 13) {
			System.out.println("Nadador na categoria Juvenil A");
		}
		else if(idadeNadador >= 14 && idadeNadador <= 17) {
			System.out.println("Nadador na categoria Juvenil B");
		}
		else {
			System.out.println("Nadador Adulto, maior de 18 anos");
		}

		scan.close();
	}

}
