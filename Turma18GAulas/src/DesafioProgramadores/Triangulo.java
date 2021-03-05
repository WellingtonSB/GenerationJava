package DesafioProgramadores;

import java.util.Scanner;

//Recebe o dado de 3 triangulos do usuario, mostrar o valor da base,altura e a area e qual o triangulo com a maior area
public class Triangulo {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double maior = 0;
		double base1, base2, base3;
		double altura1, altura2, altura3;
		double area1, area2, area3;

		System.out.print("Informe o valor da base 1配riangulo: ");
		base1 = ler.nextDouble();
		System.out.print("Informe o valor da altura do 1配riangulo: ");
		altura1 = ler.nextDouble();
		System.out.print("Informe o valor da base do 2配riangulo: ");
		base2 = ler.nextDouble();
		System.out.print("Informe o valor da altura do 2配riangulo: ");
		altura2 = ler.nextDouble();
		System.out.print("Informe o valor da base do 3配riangulo: ");
		base3 = ler.nextDouble();
		System.out.print("Informe o valor da altura do 3配riangulo:  ");
		altura3 = ler.nextDouble();

		area1 = (base1 * altura1) / 2;
		area2 = (base2 * altura2) / 2;
		area3 = (base3 * altura3) / 2;

		if (area1 > area2 && area1 > 3) {
			maior = area1;
		}

		if (area2 > area1 && area2 > area3) {
			maior = area2;
		}

		if (area3 > area1 && area3 > area2) {
			maior = area3;
		}

		System.out.printf("A area do 1配riangulo � %f, com a sua altura:%f e sua base:%f \n", area1, altura1, base1);
		System.out.printf("A area do 2配riangulo � %f, com a sua altura:%f e sua base:%f \n", area2, altura2, base2);
		System.out.printf("A area do 3配riangulo � %f, com a sua altura:%f e sua base:%f \n", area3, altura2, base2);
		System.out.println("Maior area: " + maior);

	}

}
