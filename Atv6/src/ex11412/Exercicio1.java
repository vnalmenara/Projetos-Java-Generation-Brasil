package ex11412;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cliente pessoa = new Cliente("M�nica", "Feminino", 1992, "S�o Paulo", false);
		
		System.out.println("Ol�, " + pessoa.nomeCliente + " !!!");
		System.out.println("Voc� se declara do genero " + pessoa.generoCliente);
		System.out.println("Seu ano de nascimento � " + pessoa.anoNascimento);
		System.out.println("Residente em " + pessoa.endere�oCliente);
		
		if(pessoa.nacionalidade && pessoa.generoCliente == "Masculino") {
			System.out.println("Brasileiro");
		}
		else if(pessoa.nacionalidade && pessoa.generoCliente == "Feminino") {
			System.out.println("Brasileira");
		}
		else if(!pessoa.nacionalidade && pessoa.generoCliente == "Masculino") {
			System.out.println("Estrangeiro");
		}
		else {
			System.out.println("Estrangeira");
		}
		
		System.out.println("Sua idade � " + pessoa.idade());
		System.out.println("Assim voc� possui " + (pessoa.desconto() * 100) + "% de desconto segundo sua idade");
		
	}

}
