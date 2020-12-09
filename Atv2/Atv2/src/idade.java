import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		pula();
		
		int anoNascimento;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println(idade(anoNascimento));
		
		if(idade(anoNascimento) < 18) {
			System.out.println("Infanto juvenil");
		}
		else if (idade(anoNascimento) >= 18 && idade(anoNascimento) < 60){
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
		
		leia.close();
	}
	
	static void pula() {
		System.out.println( );
	}
	
	static int idade(int anoNascimento) {
		
		int idade, anoVigente=2020;
		
		idade = anoVigente - anoNascimento;
		
		return idade;
	}
	

}
