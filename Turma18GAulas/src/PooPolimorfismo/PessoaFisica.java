package PooPolimorfismo;

public class PessoaFisica extends Pessoa {
	//Atributos
	private long cpf;
 
	//Contrutor (vazio)
	public PessoaFisica() {

	}
	//Encapsulamento (get and set)
	protected long getCpf() {
		return cpf;
	}

	protected void setCpf(long cpf) {
		this.cpf = cpf;
	}

	// metodo que vou herdar da classe Pessoa
	public String getNome() 
	{
		return "Pessoa fisica: " + super.getNome() + " - CPF: " + this.getCpf();
	}

}
