package ProgramaçãoSequencial;

/*


	Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
*/
import java.util.Scanner;

public class ProgramaçãoSequencial5 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, mediaPonderada;

		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a 1°nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Informe a 2°nota: ");
		nota2 = ler.nextDouble();
		System.out.print("informe a 3°nota: ");
		nota3 = ler.nextDouble();

		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

		System.out.println("A sua média é de: " + mediaPonderada + "\n");

		if (mediaPonderada >= 6) {
			System.out.println("Você foi aprovado, parabens!");
		} else {
			System.out.println("Voce foi reprovado.");
		}

	}

}
