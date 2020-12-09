import java.util.Scanner;

public class ex10812 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double p, e, m, regulamentoSP, valorMulta;
		
		regulamentoSP = 50;
		valorMulta = 4;
		
		System.out.println("Informe o peso dos tomates: ");
		p = scan.nextDouble();
		
		if(p >= regulamentoSP) {
			e = p - regulamentoSP;
			m = e * valorMulta;
		}
		else {
			e = 0;
			m = 0;
		}
		
		System.out.println("Considerando que o peso dos tomates foi de " + p + " Kg verificou-se " + e + " Kg de excesso frente ao regulamento de São Paulo, devendo pagar " + m + " reais de multa");
		
		scan.close();
		
	}
}
