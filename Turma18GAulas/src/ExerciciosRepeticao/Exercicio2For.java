package ExerciciosRepeticao;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {

		int num = 0, par = 0, impar = 0;
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.print("Digite um numero:");
			num = ler.nextInt();

			if (num % 2 == 0) {

				par = par + 1;

			} else {
				impar = impar + 1;
			}

		}
		System.out.printf("Total de numeros pares: %d, total de numeros impares: %d.", par, impar);

	}

}
