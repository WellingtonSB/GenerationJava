package ProgramaçãoSequencial;

/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1, y1) e P(x2, y2),
escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
d = RAIZ QUADRADA DE (x2 - x1)² + (y2 - y1)²
*/

import java.util.Scanner;

public class ProgramaçãoSequencial6 {
	public static void main(String[] args) {
		double d, x1, x2, y1, y2;

		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.print("Informe o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.print("Informe o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.print("Informe o valor de y2: ");
		y2 = ler.nextDouble();

		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("O valor de d é: " + Math.round(d));

		// d = mat.raiz((mat.potencia((x2 - x1), 2) + mat.potencia((y2 - y1), 2)), 2)

	}

}
