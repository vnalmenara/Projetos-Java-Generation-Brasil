import java.util.Scanner;

public class ex50812 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double indicePoluicao;
		
		System.out.println("Informe o índice de poluição da indústria: ");
		indicePoluicao = scan.nextDouble();

		System.out.println("O índice auferido foi de " + indicePoluicao);

		if(indicePoluicao < 0.3){
			System.out.println("Índice de poluição aceitável");
		}
		else if (indicePoluicao < 0.4 ){
			System.out.println("1º Grupo intimado a suspender suas atividades");
		}
		else if (indicePoluicao < 0.5 ){
			System.out.println("1 e 2º Grupo intimado a suspender suas atividades");
		}
		else{
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
		}

	}

}
