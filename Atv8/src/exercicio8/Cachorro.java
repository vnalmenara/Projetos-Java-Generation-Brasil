package exercicio8;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Latindo");	
	}

	@Override
	public void correr() {
		System.out.println("Correndo com a língua para fora");	
	}
	
	
	
	
}
