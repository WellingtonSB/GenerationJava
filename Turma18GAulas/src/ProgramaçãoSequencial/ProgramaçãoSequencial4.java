package Programa��oSequencial;

/*


	Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
	e calcule a seguinte express�o: D = (R + S) / 2, onde 
	R = (A + B)�
	S = (B + C)�
*/

import java.util.Scanner; //biblioteca

public class Programa��oSequencial4 {
	public static void main(String[] args) {
		int numA, numB, numC, numD, numR, numS;

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		numA = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		numB = ler.nextInt();
		System.out.print("Digite o valor de C: ");
		numC = ler.nextInt();

		numR = (int) Math.pow((numA + numB), 2);
		numS = (int) Math.pow((numB + numC), 2);
		numD = (numR + numS) / 2;

		System.out.println("O resultado �: " + numD);

	}
}
