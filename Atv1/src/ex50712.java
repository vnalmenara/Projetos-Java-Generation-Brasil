import java.util.Scanner;

public class ex50712 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Informe a nota 1 (p1) do aluno: ");
		nota1 = leia.nextDouble();
		System.out.println("Informe a nota 2 (p2) do aluno: ");
		nota2 = leia.nextDouble();
		System.out.println("Informe a nota 3 (p3) do aluno: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média ponderada das notas do aluno é: " + media);
		
		leia.close();

	}

}
