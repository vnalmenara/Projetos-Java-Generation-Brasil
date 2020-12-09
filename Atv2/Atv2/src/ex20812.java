import java.util.Scanner;

public class ex20812 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double c, n=0.0, e=0.0, horasExcedentes, valorHoraExcedente;
		double salarioNormal, valorHora, salarioTotal, salarioExcedente=0.0;
		
		horasExcedentes = 50.0;
		valorHoraExcedente = 20.0;
		valorHora = 10.0;
		
		System.out.println("Informe o código referencial do funcionário: ");
		c = scan.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = scan.nextDouble();
		
		if(n > horasExcedentes) {
			salarioNormal = n * valorHora;
			salarioTotal = salarioNormal;
		}
		else {
			e = n - horasExcedentes;
			salarioExcedente = e * valorHoraExcedente;
			salarioNormal = horasExcedentes * valorHora;
			salarioTotal = salarioNormal + salarioExcedente;
		}
		
		System.out.println("O salário total do funcionário " + c + " é: " + salarioTotal + " reais, sendo que recebeu " + salarioExcedente + " reais pelas horas trabalhadas a mais.");

		scan.close();
		
	}

}
