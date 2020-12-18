package banco;

public class Cliente {
	
	private String nome;
	private char genero;
	private ContaCorrente cc;
	private ContaPoupanca cp;
	private ContaEspecial ce;
	private ContaEmpresarial cemp;
	private ContaUniversitaria cuni;
	
	public Cliente(String nome, char genero, ContaCorrente cc, ContaPoupanca cp, ContaEspecial ce,
			ContaEmpresarial cemp, ContaUniversitaria cuni) {
		this.nome = nome;
		this.genero = genero;
		this.cc = cc;
		this.cp = cp;
		this.ce = ce;
		this.cemp = cemp;
		this.cuni = cuni;
	}

	public String getNome() {
		return nome;
	}

	public char getGenero() {
		return genero;
	}

	public ContaCorrente getCc() {
		return cc;
	}

	public ContaPoupanca getCp() {
		return cp;
	}

	public ContaEspecial getCe() {
		return ce;
	}

	public ContaEmpresarial getCemp() {
		return cemp;
	}

	public ContaUniversitaria getCuni() {
		return cuni;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public void boasVindas() {
		if (this.genero == 'M' || this.genero == 'm') {
			System.out.println("SEJA BEM-VINDO AO G4 BANk SR. " + this.nome);
		} 
		else if(this.genero == 'F' || this.genero == 'f') {
			System.out.println("SEJA BEM-VINDA AO G4 BANk SRa. " + this.nome);
		}
		else {
			System.out.println("SEJA BEM-VINDX AO G4 BANk SRx. " + this.nome);
		}
	}
	
	
	
}
