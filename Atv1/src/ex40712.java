import java.util.Scanner;

public class ex40712 {
	
	public static void main(String[] args) {
		
		double numA, numB, numC, s, r, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um n�mero para A: ");
		numA = leia.nextDouble();
		System.out.println("Informe um n�mero para B: ");
		numB = leia.nextDouble();
		System.out.println("Informe um n�mero para C: ");
		numC = leia.nextDouble();
		
		s = (numB + numC) * (numB + numC);
		r = (numA + numB) * (numA + numB);

		d = (r + s) / 2;
		
		System.out.println("O resultado da express�o {d = (r + s)/2} �: " + d);
		
		leia.close();
	}

}
