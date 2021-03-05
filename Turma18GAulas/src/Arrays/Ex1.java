package Arrays;

/*
 
 * de uma atividade e o escreva em seguida. Encontre após a maior pontuação 
 * e o apresente.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de
		 * uma atividade e o escreva em seguida. Encontre após a maior pontuação e a
		 * apresente.
		 */
		// inteiro valores[5]
		Scanner leia = new Scanner(System.in);
		int valores[] = new int[5]; // 0-4
		int maiorPontuacao = 0;

		for (int y = 0; y < valores.length; y++) {
			System.out.println("Digite o valor " + (y + 1) + " :");
			valores[y] = leia.nextInt();
		}

		for (int y = 0; y < valores.length; y++) {
			System.out.println("O valor " + (y + 1) + " é " + valores[y]);
			if (valores[y] > maiorPontuacao) {
				maiorPontuacao = valores[y];
			}
		}

		System.out.printf("A maior pontuação é %d", maiorPontuacao);// usual linguagem C

	}

}