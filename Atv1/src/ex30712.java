import java.util.Scanner;

public class ex30712 {

	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundo, tempoMinuto, tempoHora;
		
		System.out.println("Informe a duração do evento agendado em segundos: ");
		tempoSegundo = leia.nextInt();
		
		tempoHora = tempoSegundo / 3600;
		tempoSegundo = tempoSegundo % 3600;
		tempoMinuto = tempoSegundo / 60;
		tempoSegundo = tempoSegundo % 60;
		
		System.out.println("O evento possui " + tempoHora + " horas, " + tempoMinuto + " minutos e " + tempoSegundo + " segundo de duração");
		
		leia.close();
	}
}
