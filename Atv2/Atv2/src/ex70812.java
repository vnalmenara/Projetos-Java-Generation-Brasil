import java.util.Scanner;

public class ex70812 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double base, altura, areaTriangulo;
		
		System.out.println("Informe a medida da base do tri�ngulo que queira calcular: ");
		base = scan.nextDouble();
		
		System.out.println("Informe a medida da altura do tri�ngulo que queira calcular: ");
		altura = scan.nextDouble();
		
		if(base > 0 && altura > 0) {
			areaTriangulo = (base * altura) /  2;
			System.out.println("A �rea do tri�ngulo �: " + areaTriangulo);
		}
		else {
			System.out.println("Valores Inv�lidos");
		}

		scan.close();
		
	}

}
