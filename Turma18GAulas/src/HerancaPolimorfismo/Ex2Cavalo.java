package HerancaPolimorfismo;

public class Ex2Cavalo extends Ex1Animal {
	public Ex2Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void acao() {
		System.out.println("Corre");
	}

	@Override
	public void emiteSom() {
		System.out.println("Relincha");
	}

}
