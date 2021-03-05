package Se;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idadeNadador;

		System.out.println("Bem vindo a Escola de natação Generation!");
		System.out.print("Para verificar a sua turma , digite a idade do nadador(a): ");
		idadeNadador = ler.nextInt();

		if (idadeNadador < 5) {
			System.out.println("Infelizmente não podemos atender, verifique a idade minima com a secretaria.");
		} else if (idadeNadador <= 7) {
			System.out.println("A sua turma é:Infantil A = 5 a 7 anos.");
		} else if (idadeNadador <= 11) {
			System.out.println("A sua turma é:Infantil B = 8 a 11 anos.");
		} else if (idadeNadador <= 13) {
			System.out.println("A sua turma é:Juvenil A = 12 a 13 anos.");
		} else if (idadeNadador <= 17) {
			System.out.println("A sua turma é:Juvenil B = 14 a 17 anos.");
		} else {
			System.out.println("A sua turma é:Adultos = Maiores de 18 anos");
		}
		ler.close();
		System.out.println("\nObrigado volte sempre!");
	}
}