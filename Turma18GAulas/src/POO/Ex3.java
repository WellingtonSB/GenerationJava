package POO;
/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex3GenerationComputadores Cliente = new Ex3GenerationComputadores();

		String nome;
		int numeroPedido = 0;
		double total = 0;
		char opcao = 0;
		char item = 0;
		char maquina = 0;
		char Inicio = 0;
		char Final = 0;

		System.out.println("\t Bem vindo a Generation Computadores!\n");

		System.out.println("++++++++++++++++ Generation Computadores +++++++++++++++++++++");
		System.out.println("                                                              ");
		System.out.println("\t\t\t\t\tPEÇAS                                               ");
		System.out.println("                                                              ");
		System.out.println("HD Seagate SATA 3.5\" IronWolf NAS 1TB			R$ 100,10	  ");
		System.out.println("Memoria 8gb ddr3 1600mhz multilaser mm810.		R$ 100,10	  ");
		System.out.println("Placa-Mãe ASRock B450M 							R$ 100,10	  ");
		System.out.println("PLACA DE VIDEO NVIDIA GEFORCE GTX 1660			R$ 100,10     ");
		System.out.println("                                                              ");
		System.out.println("\t\t\t\t\tMAQUINAS                          	              ");
		System.out.println("                                                              ");
		System.out.println("Vetor R$ 1000,00\n" + "-Processador Intel® Pentium® Gold\r\n" + "-Ubuntu Linux\r\n"
				+ "-Tela HD de 14\"\r\n" + "-HD de 1TB\r\n" + "-Memória de 4GB\n");
		System.out.println("Matriz R$ 2000,00\n  " + "Processador Intel® Core™ i3\r\n" + "Windows 10 Home\r\n"
				+ "Tela HD de 15.6\"\r\n" + "SSD de 256GB\r\n" + "Memória de 4GB\n");
		System.out.println("POO R$ 3000,00\n " + "-Processador Intel® Core™ i7\r\n" + "-Windows 10 Home\r\n"
				+ "-Placa de vídeo AMD Radeon™ 520\r\n" + "-Tela HD de 15.6\"\r\n" + "-SSD de 128GB + HD de 1TB\r\n"
				+ "-Memória de 8GB");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println("Deseja comprar algum de nossos produtos?");
		System.out.println("[1]Sim\n[2]Nao");
		Inicio = ler.next().charAt(0);

		if (Inicio == '1') {

			System.out.println("Para seguir com o atendimento por favor informe o seu nome: ");
			nome = ler.next();

			System.out.printf("Olá %s selecione a opção desejada:", nome);
			System.out.println("\n[1]Comprar uma peça [2]Comprar uma maquina");
			opcao = ler.next().charAt(0);

			if (opcao == '1') {
				System.out.print("Selecione as peça desejada:");
				System.out.print("\n[1]HD\n[2]Memoria Ram\n[3]Placa mãe\n[4]Placa de video\n");
				item = ler.next().charAt(0);
				if (item == '1') {
					total = Cliente.getHD();
				}
				if (item == '2') {
					total = Cliente.getMemoriaRam();
				}
				if (item == '3') {
					total = Cliente.getPlacaMae();
				}
				if (item == '4') {
					total = Cliente.getPlacaVideo();
				}
				System.out.print("Total:" + total);
				System.out.print("\nDeseja confirmar a compra? [1]Sim [2]Não");
				Final = ler.next().charAt(0);
			}

			if (opcao == '2') {
				System.out.print("Selecione a Maquina: ");
				System.out.println("\n[1]Vetor");
				System.out.println("\n[2]Matriz");
				System.out.println("\n[3]POO\n");
				maquina = ler.next().charAt(0);

				if (maquina == '1') {
					total = Cliente.getVetor();

				}
				if (maquina == '2') {
					total = Cliente.getMatriz();

				}
				if (maquina == '3') {
					total = Cliente.getPOO();
				}
				System.out.print("Total:" + total);
				System.out.print("Deseja confirmar a compra? [1]Sim [2]Não\n");
				Final = ler.next().charAt(0);
			}

			if (Final == '1') {
				System.out.println("Obrigado por comprar com a GenerationComputadores!\nSeu produto será entregue em até 30 dias.");
				System.out.println("Numero pedido " + Cliente.numeroPedido(numeroPedido));
				System.out.println("Cliente " + nome);
				System.out.println("Valor do pedido " + total);

			}
			if (Final == '2') {
				System.out.println("Por favor, reinicie o seu pedido."); // precisa de melhorias
			}
		}
	}
}
