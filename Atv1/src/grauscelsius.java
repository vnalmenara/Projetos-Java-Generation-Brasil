import java.util.Scanner;

public class grauscelsius {
		
		public static void main(String [] args) {
			
			Scanner leia = new Scanner(System.in);
			
			double grausCelsius, fahrenheits;
			
			System.out.println("Digite a temperatura atual em graus Celsius: ");
			grausCelsius = leia.nextDouble();
			
			fahrenheits = (1.8 * grausCelsius) + 32;
			
			System.out.printf("O graus em Fahrenheits é: %.2f", fahrenheits);
			
			leia.close();
			
		}
}
