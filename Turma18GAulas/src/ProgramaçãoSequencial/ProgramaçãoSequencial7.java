package ProgramaçãoSequencial;

/*	Um sistema de equações lineares do tipo: 
	ax + by = c
	dx + ey = f
	pode ser resolvido segundo mostrado abaixo:
	x = (ce - bf) / (ae - bd)
	y = (af - cd) / (ee - bd)
	Escreva um sistema que lê os coeficientes a,b,c,d,e, f 
	e calcula e mostra os valores de x e y.
*/

import java.util.Scanner;

public class ProgramaçãoSequencial7 {
	public static void main(String[] args) {

		double numA, numB, numC, numD, numE, numF, somaX, somaY;

		Scanner ler = new Scanner(System.in);
		System.out.print("informe o primeiro valor: ");
		numA = ler.nextInt();
		System.out.print("informe o segundo valor: ");
		numB = ler.nextInt();
		System.out.print("informe o terceiro valor: ");
		numC = ler.nextInt();
		System.out.print("informe o quarto valor: ");
		numD = ler.nextInt();
		System.out.print("informe o quinto valor: ");
		numE = ler.nextInt();
		System.out.print("informe o sexto valor: ");
		numF = ler.nextInt();

		somaX = (numC * numE - numB * numF) / (numA * numE - numB * numD);
		somaY = (numA * numF - numC * numD) / (numA * numE - numB * numD);

		System.out.println("O valor de X é: " + Math.round(somaX) + " e o valor de Y é:" + Math.round(somaY));

	}
}
