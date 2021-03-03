package POO;
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Ex1 {
	public static void main(String[] args) {
		int conta = 0;
		int anoNascimento = 2000;

		Ex1Client client1 = new Ex1Client("Wellington", "Bezerra");

		System.out.println("Nome do cliente: " + client1.getDados());
		System.out.println("Idade do cliente: " + client1.idade(anoNascimento));
		System.out.println("Numero conta: " + client1.conta(conta));

	}
}
