package ExerciciosRepeticao;
//Crie um programa que leia um n�mero do teclado at� que encontre um

//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

import java.util.Scanner;

public class Exercicio5DoWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite o Numero : ");
			numero = sc.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("A soma � : " + soma);

		sc.close();
	}
}
