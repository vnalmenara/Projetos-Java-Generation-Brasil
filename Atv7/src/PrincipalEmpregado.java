
public class PrincipalEmpregado {

	public static void main(String[] args) {

		Empregado employee = new Empregado("Manoel", "Florian�polis-SC", "(47) 98776-7656", 1, 4500, 0.27);
		
		System.out.println("**** REL�T�RIO DO EMPREGADO ****");
		
		System.out.println("Nome: " + employee.getNome());
		System.out.println("Endere�o: " + employee.getEndereco());
		System.out.println("Telefone Residencial: " + employee.getTelefone());
		System.out.println("C�digo do Setor: " + employee.getCodigoSetor());
		System.out.println("Sal�rio Base: " + employee.getSalarioBase());
		System.out.println("Imposto aplicado: " + employee.getImposto() * 100 + "%");
		System.out.println("Sal�rio L�quido: " + employee.calcularSalario());
		
		employee.setNome("Maria");
		employee.setEndereco("Jo�o Pessoa-PB");
		employee.setTelefone("(83) 98237-8237");
		employee.setCodigoSetor(3);
		employee.setSalarioBase(5300);
		employee.setImposto(0.24);
		
		System.out.println();
		System.out.println("**** REL�T�RIO DO EMPREGADO ****");
		
		System.out.println("Nome: " + employee.getNome());
		System.out.println("Endere�o: " + employee.getEndereco());
		System.out.println("Telefone Residencial: " + employee.getTelefone());
		System.out.println("C�digo do Setor: " + employee.getCodigoSetor());
		System.out.println("Sal�rio Base: " + employee.getSalarioBase());
		System.out.println("Imposto aplicado: " + employee.getImposto() * 100 + "%");
		System.out.println("Sal�rio L�quido: " + employee.calcularSalario());
	}

}
