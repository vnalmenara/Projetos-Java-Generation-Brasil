package ex51412;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Paciente doente = new Paciente("Luiza", "Feminino", "Suspeita Covid", 24);
		
		System.out.println(" ***** RELAT�RIO M�DICO ***** ");
		System.out.println("Paciente: " + doente.nomePaciente);
		System.out.println("G�nero: " + doente.generoPaciente);
		System.out.println("Diagn�stico: " + doente.diagnostico);
		System.out.println("Idade: " + doente.idade);
		
		System.out.println("Prescri��o: REALIZAR TESTE DE COVID-19");
		
		doente.testeCovid();		

	}

}
