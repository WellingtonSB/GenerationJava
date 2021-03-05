package HerancaPolimorfismo;

public class Ex3Preguica extends Ex1Animal {
	public Ex3Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void acao() {
		System.out.println("Sobe em arvores");
	}

	@Override
	public void emiteSom() {
		System.out.println("(dorme)");
	}
}
