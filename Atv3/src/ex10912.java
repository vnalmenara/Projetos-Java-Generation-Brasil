import java.util.Scanner;

public class ex10912 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int indice, habitantes=20, filhos, totalfilhos=0;
		double salario, mediaSalario=0, mediaFilhos=0, totalsalario=0, percentual100, soma=0, maiorSalario=0;
		
		for(indice = 0; indice < habitantes; indice++) {
			
			System.out.println("Informe seu salário: ");
			salario = scan.nextDouble();
			
			System.out.println("Informe o número de filhos: ");
			filhos = scan.nextInt();
			
			totalsalario = totalsalario + salario;

			totalfilhos = totalfilhos + filhos;
			
			if(salario <= 100) {
				soma = soma + 1;
			}
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}

			mediaFilhos = totalfilhos / habitantes;
			mediaSalario = totalsalario / habitantes;
			percentual100 = (soma / habitantes) * 100;
		}
		
	System.out.println("A média salarial dos habitantes é de " + Math.round(mediaSalario) + " reais");
	
	scan.close();
	
	}

}
