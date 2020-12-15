package ex51412;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Paciente doente = new Paciente("Luiza", "Feminino", "Suspeita Covid", 24);
		
		System.out.println(" ***** RELATÓRIO MÉDICO ***** ");
		System.out.println("Paciente: " + doente.nomePaciente);
		System.out.println("Gênero: " + doente.generoPaciente);
		System.out.println("Diagnóstico: " + doente.diagnostico);
		System.out.println("Idade: " + doente.idade);
		
		System.out.println("Prescrição: REALIZAR TESTE DE COVID-19");
		
		doente.testeCovid();		

	}

}
