package Outros;

public class TestaVariaveis {

	public static void main(String[] args) {

		double salario;
		int idade = 20;
		salario = 1250.70;

		System.out.println("ola novo teste");

		if (idade >= 18) {
			System.out.println("a idade � " + idade + ", parab�ns!");
			System.out.println("A sua media salarial � de: " + salario);
		} else {
			System.out.println("Infelizmente voc� n�o pode trabalhar aqui.");
		}

	}
}