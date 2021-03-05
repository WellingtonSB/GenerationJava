package PooPolimorfismo;

public class Pessoa {
	private String nome;

	protected String getNome() {
		return nome;
	}

	protected void setNome(final String nome) //final simboliza que darei uma constante ao nome.
	{
		this.nome = nome;
	}
	
}
