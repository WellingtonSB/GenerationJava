package ExerciciosRepeticao;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

import java.util.Scanner;

public class Exercicio3While {
	public static void main(String[] args) {

		int idade = 0, total21 = 0, total50 = 0;
		Scanner ler = new Scanner(System.in);

		while (idade !=-99) {

			System.out.print("Por favor,digite a sua idade: ");
			idade = ler.nextInt();

			if (idade == 21) {
				total21++;
			}
			if (idade == 50) {
				total50 ++ ;

			}
		}
		System.out.print("O total de pessoas com 21 anos: " + total21);
		System.out.print("O total de pessoas com 51 anos é: " + total50);
	}
}