package Outros;

public class TestaVariaveis {

	public static void main(String[] args) {

		double salario;
		int idade = 20;
		salario = 1250.70;

		System.out.println("ola novo teste");

		if (idade >= 18) {
			System.out.println("a idade é " + idade + ", parabéns!");
			System.out.println("A sua media salarial é de: " + salario);
		} else {
			System.out.println("Infelizmente você não pode trabalhar aqui.");
		}

	}
}