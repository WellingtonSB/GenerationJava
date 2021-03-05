package HerancaPolimorfismo;

public class Ex1Cachorro extends Ex1Animal {
	public Ex1Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}

	@Override
	public void acao() {
		System.out.println("Corre");
	}

	@Override
	public void emiteSom() {
		System.out.println("Latido");
	}

}
