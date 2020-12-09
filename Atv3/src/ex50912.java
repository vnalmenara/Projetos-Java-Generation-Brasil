import java.util.Scanner;

public class ex50912 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int contador=233;
		
		do{
			if(contador >= 300 && contador <= 400) {
				System.out.println(contador);
				contador = contador + 3;
			}
			else {
				System.out.println(contador);
				contador = contador + 5;
			}
			
		}while(contador <= 456);

		scan.close();
		
	}

}
