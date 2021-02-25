package LacosDecisao;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

public class X3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idadeAluno;

		System.out.println("Bem vindo a Escola de box Generation!");

		System.out.print("Para verificar a sua turma , digite a idade do aluno(a): ");
		idadeAluno = ler.nextInt();

		if (idadeAluno < 10) {
			System.out.println("Infelizmente não podemos atender, verifique a idade minima com a secretaria.");

		} else if (idadeAluno <= 14) {
			System.out.println("A sua turma será a infantil.");

		} else if (idadeAluno <= 17) {
			System.out.println("A sua turma será a juvenil.");

		} else {
			System.out.println("A sua turma será a de adultos.");
		}
		ler.close();
		System.out.println("\nA Generation agradece a sua visita!");
	}

}