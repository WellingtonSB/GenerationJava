package Funcoes;

import java.util.Scanner;

public class Desafio2while {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String nome;
		int senha = 123;
		char opcao = '1';

		do {

			System.out.println("Digite o seu nome:");
			nome = ler.next().toUpperCase();
			System.out.println("Digite a senha: ");
			senha = ler.nextInt();
			System.out.println("Desenha continuar? 1-sim ou 2-não.");
			opcao = ler.next().charAt(0);

		} while (opcao == '1');

		System.out.println("Fim do programa");

	}

}
