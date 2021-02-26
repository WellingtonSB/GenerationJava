package ExerciciosRepeticao;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.

 */
import java.util.Scanner;

public class Exercicio4While {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int pessoas = 0;
		int idade, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int outrosCalmos = 0, maior40 = 0, menor18 = 0;
		char sexo, emocoes;

		while (pessoas <= 150) {
			System.out.print("Digite o seu nome: ");
			nome = ler.next();
			System.out.print("Digite a sua idade:");
			idade = ler.nextInt();
			System.out.println("Digite uma das opções: 1-feminino / 2-masculino / 3-Outros.");
			sexo = ler.next().charAt(0);
			System.out.println("Você se considera uma pessoa: 1-Calma/2-Nervosa/ 3-Agressiva");
			emocoes = ler.next().toUpperCase().charAt(0);

			if (emocoes == '1') {
				pessoasCalmas = pessoasCalmas + 1;
			}

			else if (sexo == '1' && emocoes == '2') {
				mulheresNervosas = mulheresNervosas + 1;

			} else if (sexo == '2' && emocoes == '3') {
				homensAgressivos = homensAgressivos + 1;
			} else if (sexo == '3' && emocoes == '1') {
				outrosCalmos = outrosCalmos + 1;
			} else if (idade >= 40 && emocoes == '2') {
				maior40 = maior40 + 1;
			} else if (idade < 18 && emocoes == '1') {
				menor18 = menor18 + 1;
			}
			pessoas++;
		}
		System.out.printf("O número de pessoas calmas:%d\n", pessoasCalmas);
		System.out.printf("O número de mulheres nervosas:%d\n", mulheresNervosas);
		System.out.printf("O número de homens agressivos:%d\n", homensAgressivos);
		System.out.printf("O número de outros calmos:%d\n", outrosCalmos);
		System.out.printf("O número de pessoas nervosas com mais de 40 anos:%d\n", maior40);
		System.out.printf("O número de pessoas calmas com menos de 18 anos:%d\n", menor18);
	}
}
