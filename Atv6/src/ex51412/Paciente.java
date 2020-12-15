package ex51412;

import java.util.Random;

public class Paciente {
	
	Random random = new Random();
	
	public String nomePaciente;
	public String generoPaciente;
	public String diagnostico;
	public int idade;
	public boolean covid;
	
	public Paciente(String nomePaciente, String generoPaciente, String diagnostico, int idade) {
		
		this.nomePaciente = nomePaciente;
		this.generoPaciente = generoPaciente;
		this.diagnostico = diagnostico;
		this.idade = idade;
		
	}
	
	public void testeCovid() {
		this.covid = random.nextBoolean();
		if(this.covid) {
			System.out.println("O teste para covid retornou como positivo.");
		}
		else {
			System.out.println("O teste para covid retornou como negativo.");
		}
	}
	
	

}
