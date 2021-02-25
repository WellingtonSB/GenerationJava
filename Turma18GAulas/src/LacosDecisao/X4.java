package LacosDecisao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class X4 {
	public static void main(String[] args) {

		int numero;
		double raiz, pot;

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {

			raiz = Math.sqrt(numero);

			System.out.printf("O valor de %d é par e sua raiz é %f ", numero, raiz);

		} else {
			pot = Math.pow(numero, numero);

			System.out.printf("O valor de %d é ímpar e seu valor ao quadrado é %d ", numero, Math.round(pot));
		}

	}
}