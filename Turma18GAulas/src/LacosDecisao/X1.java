package LacosDecisao;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
import java.util.Scanner;

public class X1 {
	public static void main(String[] args) {
		int numero = 0, i = 0, maiorNumero = 0;

		for (i = 0; i < 3; i++) {
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			numero = ler.nextInt();

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

		}
		System.out.println("O maior numero é: " + numero);

	}
}
