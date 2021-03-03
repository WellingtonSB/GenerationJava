package POO;

public class Ex2Aviao {
	String Piloto;
	String Voo;
	double velocidadeAtual;
	
	void liga() {
		System.out.println("As turbinas estão ligadas!!");
	}

	void acelerar(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	void velocidadeMaxima()
	{	
		if(this.velocidadeAtual>=160) {
			System.out.println("\nPERIGO! VOCÊ ATINGIU A VELOCIDADE MAXIMA PERMITIDA!\nDIMINUA");
		}
	}
	


}
