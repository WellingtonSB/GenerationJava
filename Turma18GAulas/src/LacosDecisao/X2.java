package LacosDecisao;

//Faça um programa que entre com três números e coloque em ordem crescente.
import java.util.Arrays; //listagem de matrizes (vetores)
import java.util.Scanner;

public class X2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int listaDeNumeros[] = new int[4];

		// Preenche o Array a partir da 1°posição
		for (int i = 1; i < listaDeNumeros.length; i++) {
			System.out.print("Digite " + i + "° numero: ");
			listaDeNumeros[i] = (ler.nextInt());
		}
		// Coloca o Array em ordem crescente
		Arrays.sort(listaDeNumeros);

		// Lista o Array em ordem crescente
		System.out.print("Ordem crescente:" + "\n");
		for (int j = 1; j < listaDeNumeros.length; j++) {
			System.out.print(listaDeNumeros[j] + "\n");
			ler.close();
		}

	}
}
