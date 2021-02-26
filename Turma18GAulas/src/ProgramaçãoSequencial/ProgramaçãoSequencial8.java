package ProgramaçãoSequencial;
/*	O custo ao consumidor de um carro novo é a soma do custo de fábrica 
	com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/

import java.util.Scanner;

public class ProgramaçãoSequencial8 {
	public static void main(String[] args) {
		
		double custoFabrica, custoConsumidor;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o custo de fabrica(R$):");
		custoFabrica = ler.nextDouble();
		
		
		custoConsumidor= custoFabrica+((custoFabrica*0.28)+(custoFabrica*0.45));
		
		
		System.out.print("O custo do carro ao consumidor final é de R$: "+custoConsumidor);

	}

}
