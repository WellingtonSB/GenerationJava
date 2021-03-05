package Arrays;

import java.util.Random;

/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos 
	de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
	de mesma posição das matrizes N1 e N2.
*/

public class Ex4 {

	public static void main(String[] args) {

		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		Random dados = new Random();
		final int LINHA = 4, COLUNA = 6;
		int lin = 0, col = 0;

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				N1[lin][col] = dados.nextInt(9) + 1;
				N2[lin][col] = dados.nextInt(9) + 1;
				M1[lin][col] = N1[lin][col] + N2[lin][col];
				M2[lin][col] = N1[lin][col] - N2[lin][col];

			}
		}

		System.out.println("DADOS DE N1:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(N1[lin][col] + "\t");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("DADOS DE N2:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(N2[lin][col] + "\t");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("DADOS DE M1:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(M1[lin][col] + "\t");

			}
			System.out.println();
		}

		System.out.println("DADOS DE M2:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(M2[lin][col] + "\t");

			}
			System.out.println();
		}
	}
}
