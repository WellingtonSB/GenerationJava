package Programa��oSequencial;

import java.util.Scanner;

public class Programa��oSequencial2 {

	public static void main(String[] args) {

		int dias, meses, anos, totalEmDias;

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o total de dias de vida: ");
		totalEmDias = ler.nextInt();

		anos = totalEmDias / 365;
		meses = (totalEmDias % 365) / 30;
		dias = (totalEmDias % 365) % 30;

		System.out.println("Sua idade aproximada � de: " + anos + "anos, " + meses + " meses e " + dias + " dias.");

	}

}
