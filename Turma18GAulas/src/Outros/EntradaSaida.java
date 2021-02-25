package Outros;

import java.util.Scanner; //Biblioteca

public class EntradaSaida {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);//forma de solicitar os dados do usuario
		int a,b,soma;
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println("O total é: " + soma);
	}
}
