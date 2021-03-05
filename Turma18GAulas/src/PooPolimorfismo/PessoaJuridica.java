package PooPolimorfismo;

public class PessoaJuridica extends Pessoa {
	private long cnpj;

	public PessoaJuridica() {

	}

	protected long getCnpj() {
		return cnpj;
	}

	protected void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return "Pessoa juridica:  " + super.getNome() + " -CNPJ: " + this.getCnpj();
	}
}
