package ex41412;

public class Exercicio4 {

	public static void main(String[] args) {

		Funcionario empregado = new Funcionario();
		
		empregado.nomeFuncionario = "João";
		empregado.generoFuncionario = "Masculino";
		empregado.tempoCasa = 6;
		empregado.cargoFuncionario = "Analista de TI";
		empregado.dependentes = 5;
		
		if(empregado.generoFuncionario == "Masculino") {
			System.out.println("O Funcionário Público se chama " + empregado.nomeFuncionario);
		}
		else {
			System.out.println("A Funcionária Pública se chama " + empregado.nomeFuncionario);
		}

		System.out.println("Há " + empregado.tempoCasa + " anos trabalha nessa Secretaria");
		System.out.println("Ocupando o cargo de " + empregado.cargoFuncionario);
		System.out.println("Este ano receberá R$" + empregado.bonus() + " de bônus por tempo de serviço");
		System.out.println("Possui " + empregado.dependentes + " dependentes, por isso, recebe R$ " + empregado.auxilioDependentes() + " de auxílio dependente");

	}

}
