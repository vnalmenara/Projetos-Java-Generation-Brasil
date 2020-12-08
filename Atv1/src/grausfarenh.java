import java.util.Scanner;

public class grausfarenh {
		
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double grausCelsius, grausFahrenheits;
		
		System.out.println("Digite a temperatura atual em graus Fahrenheit: ");
		grausFahrenheits = leia.nextDouble();
		
		grausCelsius = (grausFahrenheits - 32) / 1.8;
		
		System.out.println("O graus em Celsius é: " + Math.round(grausCelsius));
		
		leia.close();
	}
	
}
