package Arrays;

import java.util.Scanner;

public class DesafioCalendario {

	public static void main(String[] args) {
		String agenda[][] = new String[24][31]; // linhas:horas(00-23hr) Colunas:dias(0-30)
		int dia=0, hora=0;
		char opcao;
		int atividades = 0; // Computar a quantidade de atividades cadastradas na agenda
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("AGENDA: MARÇO");
			System.out.println("Digite o dia [1-31]: ");
			dia = ler.nextInt();
			dia = dia - 1;
			System.out.println("Digite a hora da atividade [0-23]: ");
			hora = ler.nextInt();
			System.out.println("Digite a tarefa: ");
			agenda[hora][dia] = ler.next();
			System.out.println("Continuar 1-sim ou 2-não: ");
			opcao = ler.next().charAt(0);

		} while (opcao == '1');
		for (int cH = 0;cH< agenda.length; cH++) {
			for (int cD = 0; cD < agenda[cH].length; cD++) {
				if (agenda[cH][cD] != null) {
					System.out.printf("Dia %d às %d: %s", cD + 1, cH, agenda[hora][dia]);
					atividades++;
				}
			}
		}
		System.out.printf("\nTotal de atividades cadastradas: %d ", atividades);
		// escreva(dia,"-", "tarefa hora", hora , ":", agenda[hora][dia-1])
	}

}
