package HerancaPolimorfismo;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Zoo {
		public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List<Ex1Animal> lista = new ArrayList<>();

		System.out.print("Digite a quantidade de novos animais: ");
		int quantidade = leia.nextInt();
		char opcao;

		for (int x = 1; x <= quantidade; x++) {

			do {
				System.out.println("\t\t\tQual animal deseja incluir:");
				System.out.println("\t[1]Cachorro\n[2]Cavalo\n[3]Preguica");
				opcao = leia.next().charAt(0);

			} while (opcao != '1' && opcao != '2' && opcao != '3');

			System.out.println("Nome: ");
			String nome = leia.next();
			System.out.println("Idade: ");
			int idade = leia.nextInt();

			if (opcao == '1') {
				lista.add(new Ex1Cachorro(nome, idade));
			} else if (opcao == '2') {
				lista.add(new Ex2Cavalo(nome, idade));
			} else if (opcao == '3') {
				lista.add(new Ex3Preguica(nome, idade));
			}

		}

		System.out.println();
		for (Ex1Animal animal : lista) {
			System.out.println(animal.getNome() + " tem " + animal.getIdade() + " anos. Seu som é: ");

			animal.emiteSom();
			System.out.println(animal.getNome() + ":");
			animal.acao();
		}

	}

}