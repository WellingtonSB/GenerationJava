package Programa��oSequencial;
/*
	O custo ao consumidor de um carro novo � a soma do custo de f�brica 
	com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
*/

import java.util.Scanner;

public class Programa��oSequencial8 {
	public static void main(String[] args) {
		
		double custoFabrica, custoConsumidor;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o custo de fabrica(R$):");
		custoFabrica = ler.nextDouble();
		
		
		custoConsumidor= custoFabrica+((custoFabrica*0.28)+(custoFabrica*0.45));
		
		
		System.out.print("O custo do carro ao consumidor final � de R$: "+custoConsumidor);

	}

}
