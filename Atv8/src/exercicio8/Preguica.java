package exercicio8;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de pregui�a");	
	}

	@Override
	public void correr() {
		System.out.println("Pregui�as n�o correm");			
	}

}
