package ex41412;

public class Exercicio4 {

	public static void main(String[] args) {

		Funcionario empregado = new Funcionario();
		
		empregado.nomeFuncionario = "Jo�o";
		empregado.generoFuncionario = "Masculino";
		empregado.tempoCasa = 6;
		empregado.cargoFuncionario = "Analista de TI";
		empregado.dependentes = 5;
		
		if(empregado.generoFuncionario == "Masculino") {
			System.out.println("O Funcion�rio P�blico se chama " + empregado.nomeFuncionario);
		}
		else {
			System.out.println("A Funcion�ria P�blica se chama " + empregado.nomeFuncionario);
		}

		System.out.println("H� " + empregado.tempoCasa + " anos trabalha nessa Secretaria");
		System.out.println("Ocupando o cargo de " + empregado.cargoFuncionario);
		System.out.println("Este ano receber� R$" + empregado.bonus() + " de b�nus por tempo de servi�o");
		System.out.println("Possui " + empregado.dependentes + " dependentes, por isso, recebe R$ " + empregado.auxilioDependentes() + " de aux�lio dependente");

	}

}
