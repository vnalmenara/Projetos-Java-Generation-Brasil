import java.util.Scanner;

public class ex21112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double altura, peso, imc=0;
		
		System.out.println("Para calcular o seu IMC, informe, por favor: ");
		System.out.println("ALTURA: ");
		altura = scan.nextDouble();
		System.out.println("PESO: ");
		peso = scan.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		}
		else if(imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("Acima do peso");
		}
		else {
			System.out.println("Obesidade");
		}
		
	scan.close();
		
	}

}
