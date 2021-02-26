package Funcoes;

import java.util.Scanner;

//Quando o numero for negativo o programa deve parar, quando parar deve informar qual o maior numero digitado

public class Desafio3While {

	public static void main(String[] args) {

		int numero = 0, maiorNumero = 0;
			String nome;
			Scanner ler = new Scanner(System.in);
		
			System.out.print("Digite o seu nome:");
			nome = ler.next();

		do {
			System.out.print(nome + ", por favor digite um numero: ");
			numero = ler.nextInt();

		if (numero > maiorNumero) 
				{
					maiorNumero = numero;
				}
			} 
		
		while (numero > 0);
			System.out.printf("O maior numero é: %d", maiorNumero);
			ler.close();
	}
}
