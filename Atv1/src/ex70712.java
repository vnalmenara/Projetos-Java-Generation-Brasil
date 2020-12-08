import java.util.Scanner;

public class ex70712 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numA, numB, numC, numD, numE, numF, x, y;
		
		System.out.println("Informe um número para A: ");
		numA = leia.nextDouble();
		System.out.println("Informe um número para B: ");
		numB = leia.nextDouble();
		System.out.println("Informe um número para C: ");
		numC = leia.nextDouble();
		System.out.println("Informe um número para D: ");
		numD = leia.nextDouble();
		System.out.println("Informe um número para E: ");
		numE = leia.nextDouble();
		System.out.println("Informe um número para F: ");
		numF = leia.nextDouble();
		
		x = ((numC * numE) - (numB * numF)) / ((numA * numE) - (numB * numD));
				
		y = ((numA * numF) - (numC * numD)) / ((numA * numE) - (numB * numD));
		
		System.out.println("O valor atribuído a X é " + x + " e o valor atribuído a Y é " + y);
		
		leia.close();
		
	}

}
