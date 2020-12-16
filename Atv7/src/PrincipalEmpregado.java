
public class PrincipalEmpregado {

	public static void main(String[] args) {

		Empregado employee = new Empregado("Manoel", "Florianópolis-SC", "(47) 98776-7656", 1, 4500, 0.27);
		
		System.out.println("**** RELÁTÓRIO DO EMPREGADO ****");
		
		System.out.println("Nome: " + employee.getNome());
		System.out.println("Endereço: " + employee.getEndereco());
		System.out.println("Telefone Residencial: " + employee.getTelefone());
		System.out.println("Código do Setor: " + employee.getCodigoSetor());
		System.out.println("Salário Base: " + employee.getSalarioBase());
		System.out.println("Imposto aplicado: " + employee.getImposto() * 100 + "%");
		System.out.println("Salário Líquido: " + employee.calcularSalario());
		
		employee.setNome("Maria");
		employee.setEndereco("João Pessoa-PB");
		employee.setTelefone("(83) 98237-8237");
		employee.setCodigoSetor(3);
		employee.setSalarioBase(5300);
		employee.setImposto(0.24);
		
		System.out.println();
		System.out.println("**** RELÁTÓRIO DO EMPREGADO ****");
		
		System.out.println("Nome: " + employee.getNome());
		System.out.println("Endereço: " + employee.getEndereco());
		System.out.println("Telefone Residencial: " + employee.getTelefone());
		System.out.println("Código do Setor: " + employee.getCodigoSetor());
		System.out.println("Salário Base: " + employee.getSalarioBase());
		System.out.println("Imposto aplicado: " + employee.getImposto() * 100 + "%");
		System.out.println("Salário Líquido: " + employee.calcularSalario());
	}

}
