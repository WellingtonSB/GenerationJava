package LacosDecisao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

public class X4 {
	public static void main(String[] args) {

		int numero;
		double raiz, pot;

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {

			raiz = Math.sqrt(numero);

			System.out.printf("O valor de %d � par e sua raiz � %f ", numero, raiz);

		} else {
			pot = Math.pow(numero, numero);

			System.out.printf("O valor de %d � �mpar e seu valor ao quadrado � %d ", numero, Math.round(pot));
		}

	}
}