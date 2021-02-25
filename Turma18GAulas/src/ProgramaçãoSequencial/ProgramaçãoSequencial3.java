package ProgramaçãoSequencial;

/*


	Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

import java.util.Scanner;

public class ProgramaçãoSequencial3 {
	public static void main(String[] args) {
		int totalSegundos, segundos, minutos, horas;

		Scanner ler = new Scanner(System.in);
		System.out.print("Infome o total de segundos do evento: ");
		totalSegundos = ler.nextInt();

		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;

		System.out.println("A duração do evendo da fábrica é de " + horas + " hora(s), " + minutos + " minuto(s) "
				+ segundos + " e segundo(s).");

	}
}
