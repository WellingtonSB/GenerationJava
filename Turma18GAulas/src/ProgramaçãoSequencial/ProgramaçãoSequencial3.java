package Programa��oSequencial;

/*


	Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

import java.util.Scanner;

public class Programa��oSequencial3 {
	public static void main(String[] args) {
		int totalSegundos, segundos, minutos, horas;

		Scanner ler = new Scanner(System.in);
		System.out.print("Infome o total de segundos do evento: ");
		totalSegundos = ler.nextInt();

		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;

		System.out.println("A dura��o do evendo da f�brica � de " + horas + " hora(s), " + minutos + " minuto(s) "
				+ segundos + " e segundo(s).");

	}
}
