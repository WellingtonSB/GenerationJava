package Programa��oSequencial;

import java.util.Scanner; //Biblioteca identificar o que o u

public class Programa��oSequencial1 {

	public static void main(String[] args) {
		int anos, meses, dias, TotalEmDias;
		int diaNascimento, mesNascimento, anoNascimento, totalEmDias;

		Scanner ler = new Scanner(System.in);
		System.out.print("Informe os anos: ");
		anos = ler.nextInt();
		System.out.print("Informe os meses: ");
		meses = ler.nextInt();
		System.out.print("Informe os dias: ");
		dias = ler.nextInt();

		TotalEmDias = (anos * 365) + (meses * 30) + (dias);
		System.out.println("Sua idade em dias � de: " + TotalEmDias);

	}
}
