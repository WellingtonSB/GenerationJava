package Funcoes;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		int tamanhoLinha = 0;

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o tamanho da linha: ");
		tamanhoLinha = ler.nextInt();

		showLinha(tamanhoLinha);

	}

	public static void showLinha(int tamanho) {
		for (int x = 1; x < tamanho; x++) {
			System.out.print("-");

		}
	}
}
