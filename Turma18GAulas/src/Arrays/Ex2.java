package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random aleat = new Random();
		int m[][] = new int[3][3];
		int soma = 0, somad = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				// System.out.printf("Digite o valor correnspondente a posição [%d] [%d]: ",
				// linha, coluna);
				// m[linha][coluna] = scan.nextInt();
				m[linha][coluna] = aleat.nextInt(9) + 1;
				soma += m[linha][coluna];
				if (linha == coluna) {
					somad += m[linha][coluna];
				}
			}
		}
		scan.close();
		System.out.printf("Soma dos valores da matriz: %d", soma);
		System.out.printf("\nSoma dos valores da diagonal principal: %d", somad);
	}

}
