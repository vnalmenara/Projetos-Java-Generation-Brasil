import java.util.Scanner;

public class ex60712 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, radicando, d;
		
		System.out.println("Considere um plano cartesiano P (x1, y1) e P (x2, y2).");
		System.out.println("Informe x1: ");
		x1 = leia.nextDouble();
		System.out.println("Informe y1: ");
		y1 = leia.nextDouble();
		System.out.println("Informe x2: ");
		x2 = leia.nextDouble();
		System.out.println("Informe y2: ");
		y2 = leia.nextDouble();
		
		radicando = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
				
		d = Math.sqrt(radicando);
		
		System.out.println("A distância entre os pontos P (x1, y1) e P (x2, y2) é: " + d);
		
		leia.close();
		
	}

}
