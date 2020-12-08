import java.util.Scanner;

public class ex20712 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idadeDias, idadeMes, idadeAno;
		
		System.out.println("Informe sua idade em dias [dd]: ");
		idadeDias = scan.nextInt();
		
		idadeAno = idadeDias / 365;
		idadeDias = idadeDias % 365;
		idadeMes = idadeDias / 12;
		idadeDias = idadeDias % 12;
		
		System.out.println("Você possui " + idadeAno + " anos, " + idadeMes + " meses e " + idadeDias + " dias de vida");
		
		scan.close();
	}

}
