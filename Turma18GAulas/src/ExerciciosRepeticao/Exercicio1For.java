package ExerciciosRepeticao;

//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

public class Exercicio1For {

	public static void main(String[] args) {

		for (int num = 1000; num < 1999; num++) {

			if (num % 11 == 5) {
				System.out.printf("Result %d\n", num);
			}

		}
	}

}