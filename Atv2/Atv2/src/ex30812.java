import java.util.Scanner;

public class ex30812 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numero1, numero2, numero3, numero4, resultadoQuadradoNumero3;
		double resultadoQuadradoNumero1, resultadoQuadradoNumero2, resultadoQuadradoNumero4;
		
		System.out.println("(1) Informe um número: ");
		numero1 = scan.nextDouble();
		System.out.println("(2) Informe um número: ");
		numero2 = scan.nextDouble();
		System.out.println("(3) Informe um número: ");
		numero3 = scan.nextDouble();
		System.out.println("(4) Informe um número: ");
		numero4 = scan.nextDouble();
		
		resultadoQuadradoNumero3 = numero3 * numero3;
		
		if(resultadoQuadradoNumero3 >= 1000) {
			System.out.println("O quadrado do terceiro número informado é: " + resultadoQuadradoNumero3);
		}
		else {
			resultadoQuadradoNumero1 = numero1 * numero1;
			resultadoQuadradoNumero2 = numero2 * numero2;
			resultadoQuadradoNumero4 = numero4 * numero4;
			System.out.println("Os resultados aferidos são respectivamente: ");
			System.out.println(numero1 + " X " + numero1 + " = " + resultadoQuadradoNumero1);
			System.out.println(numero2 + " X " + numero2 + " = " + resultadoQuadradoNumero2);
			System.out.println(numero3 + " X " + numero3 + " = " + resultadoQuadradoNumero3);
			System.out.println(numero4 + " X " + numero4 + " = " + resultadoQuadradoNumero4);
		}

		scan.close();
		
	}

}
