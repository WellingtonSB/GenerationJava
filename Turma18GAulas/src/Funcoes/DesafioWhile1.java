package Funcoes;

import java.util.Scanner;

public class DesafioWhile1 {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		String nome;
		char genero;
		
		System.out.print("Digite o seu nome: ");
		nome = ler.next().toUpperCase();
		System.out.print("Qual o genero que voce se identifica? M/F/O");
		genero = ler.next().toUpperCase().charAt(0);
		
		while(genero!='M' && genero!='F'  && genero!= 'O')
		{
		System.out.print("Você digitou errado! Tente novamente. M/F/O");	
		genero = ler.next().toUpperCase().charAt(0);
		}
		System.out.println("Fim do programa!");
	}
	
}
