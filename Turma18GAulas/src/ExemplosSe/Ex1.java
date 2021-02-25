package ExemplosSe;

import java.util.Scanner; //biblioteca

public class Ex1 {

	public static void main(String[] args) {
		int numero;

		Scanner ler = new Scanner(System.in); // classe
		System.out.print("Informe um numero: ");
		numero = ler.nextInt();
		ler.close();
		 

		if (numero % 2 == 0) {
			System.out.print("O número " + numero + " é par!");

		} else {
			System.out.printf("O número %d é impar!", numero);
		}

		// %d - numero interio - tipo int
		// %s - tipo String - cadeia de caracteres
		// %f - tipo real - tipo double -- %. 2f(2f-informa o numero de casas decimais)
	}
}

