import java.util.Scanner;

public class ex10712{
		
	public static void main (String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int diaNascimento, mesNascimento, anoNascimento, diaVigente, mesVigente, anoVigente;
		int diferencaDia, diferencaMes, diferencaAno, totalDias;
		
		System.out.println("Informe o dia do seu nascimento [dd]: ");
		diaNascimento = scan.nextInt();
		System.out.println("Informe o m�s do seu nascimento [mm]: ");
		mesNascimento = scan.nextInt();
		System.out.println("Informe o ano do seu nascimento [aaaa]: ");
		anoNascimento = scan.nextInt();
		
		System.out.println("Informe o dia vigente [dd]: ");
		diaVigente = scan.nextInt();
		System.out.println("Informe o m�s vigente [mm]: ");
		mesVigente = scan.nextInt();
		System.out.println("Informe o ano vigente [aaaa]: ");
		anoVigente = scan.nextInt();
		
		diferencaDia = (diaVigente - diaNascimento);
		diferencaMes = (mesVigente - mesNascimento) * 30;
		diferencaAno = (anoVigente - anoNascimento) * 365;
		
		totalDias = diferencaDia + diferencaMes + diferencaAno;
		
		System.out.println("Voc� est� respirando no Planeta Terra �: " + totalDias + " dias");
		
		scan.close();
	}
	
}
