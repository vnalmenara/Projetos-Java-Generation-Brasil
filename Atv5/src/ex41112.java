
public class ex41112 {

	public static void main(String[] args) {
		
		int i, x, j=1;
		double resposta=0;
		double vetor[] = new double [50];
		double vetor2[] = new double [50];
		double vetorSoma[] = new double [50];
		
		vetor[0] = 0;
		vetor2[0] = 1;
		
		for(i = 0; i < 50; i++) {
			vetor[i] = j;
			j = j + 2;
			vetor2[i] = i+1;
			vetorSoma[i] = vetor[i] / vetor2[i];
			System.out.printf("\n%.2f", vetorSoma[i]);
			resposta = resposta + vetorSoma[i];
		}
		
		System.out.printf("\nA resposta é %.2f", resposta);
		
	}

}
