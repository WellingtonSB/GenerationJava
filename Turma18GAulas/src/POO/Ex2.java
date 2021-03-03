package POO;

import java.util.Scanner;

/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex2Aviao aviao = new Ex2Aviao();
		double velocidade;

		aviao.Piloto = "Wellington Bezerra";
		aviao.Voo = "Origem: Congonhas-SSP Destino: Bahia-BHA";
		aviao.velocidadeAtual = 0;
		aviao.liga();
		
		do {
			System.out.println("Acelere até 80 para decolarmos.\n");
			System.out.print("Infome a velocidade desejada: ");
			velocidade = ler.nextDouble();
			aviao.acelerar(velocidade);
			System.out.println("Velocidade atual:" + aviao.velocidadeAtual);

		}

		while (aviao.velocidadeAtual < 80);

		System.out.println("\nAPERTEM OS CINTOS, VAMOS DECOLAR!");
		
		aviao.velocidadeMaxima();
	}
}
