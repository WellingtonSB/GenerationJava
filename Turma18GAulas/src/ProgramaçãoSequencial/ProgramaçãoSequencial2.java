package ProgramaçãoSequencial;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. */

import java.util.Scanner;

public class ProgramaçãoSequencial2 {

	public static void main(String[] args) {

		int dias, meses, anos, totalEmDias;

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o total de dias de vida: ");
		totalEmDias = ler.nextInt();

		anos = totalEmDias / 365;
		meses = (totalEmDias % 365) / 30;
		dias = (totalEmDias % 365) % 30;

		System.out.println("Sua idade aproximada é de: " + anos + "anos, " + meses + " meses e " + dias + " dias.");

	}

}
