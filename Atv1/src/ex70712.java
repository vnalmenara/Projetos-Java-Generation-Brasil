import java.util.Scanner;

public class ex70712 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numA, numB, numC, numD, numE, numF, x, y;
		
		System.out.println("Informe um n�mero para A: ");
		numA = leia.nextDouble();
		System.out.println("Informe um n�mero para B: ");
		numB = leia.nextDouble();
		System.out.println("Informe um n�mero para C: ");
		numC = leia.nextDouble();
		System.out.println("Informe um n�mero para D: ");
		numD = leia.nextDouble();
		System.out.println("Informe um n�mero para E: ");
		numE = leia.nextDouble();
		System.out.println("Informe um n�mero para F: ");
		numF = leia.nextDouble();
		
		x = ((numC * numE) - (numB * numF)) / ((numA * numE) - (numB * numD));
				
		y = ((numA * numF) - (numC * numD)) / ((numA * numE) - (numB * numD));
		
		System.out.println("O valor atribu�do a X � " + x + " e o valor atribu�do a Y � " + y);
		
		leia.close();
		
	}

}
