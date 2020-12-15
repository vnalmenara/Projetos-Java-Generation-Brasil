package ex41412;

public class Funcionario {
	
	public String nomeFuncionario;
	public String generoFuncionario;
	public int tempoCasa;
	public String cargoFuncionario;
	public int dependentes;
	
	public double auxilioDependentes() {
		if(this.dependentes == 0) {
			return 0;
		}
		else if(this.dependentes == 1) {
			return 200;
		}
		else if(this.dependentes > 3) {
			return 400;
		}
		else if(this.dependentes > 5) {
			return 600;
		}
		else if(this.dependentes > 7) {
			return 800;
		}
		else {
			return 1000;
		}
	}
	
	public double bonus() {
		if(this.tempoCasa <= 1) {
			return 1000;
		}
		else if(this.tempoCasa < 3) {
			return 2000;
		}
		else if(this.tempoCasa < 5) {
			return 3000;
		}
		else if(this.tempoCasa < 7) {
			return 4000;
		}
		else {
			return 5000;
		}
	}
	

}
