package ex11412;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cliente pessoa = new Cliente("Mônica", "Feminino", 1992, "São Paulo", false);
		
		System.out.println("Olá, " + pessoa.nomeCliente + " !!!");
		System.out.println("Você se declara do genero " + pessoa.generoCliente);
		System.out.println("Seu ano de nascimento é " + pessoa.anoNascimento);
		System.out.println("Residente em " + pessoa.endereçoCliente);
		
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
		
		System.out.println("Sua idade é " + pessoa.idade());
		System.out.println("Assim você possui " + (pessoa.desconto() * 100) + "% de desconto segundo sua idade");
		
	}

}
