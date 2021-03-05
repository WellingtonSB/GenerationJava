package PooPolimorfismo;

public class Teste {
	public static void main(String[] args) 
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Wellington");
		fisica.setCpf(1231231231L); //o L no final serve para informar que é um tipo LONG
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Mari");//o L no final serve para informar que é um tipo LONG
		juridica.setCnpj(12132131231L);
		
		Pessoa[] pessoas = new Pessoa [2]; //[]simboliza que é um ARRAY(vetor e matriz)
		pessoas [0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa pessoa: pessoas) //Pessoa--> Classe, pessoa-->vai chamar o array= pessoas(juridica ou fisica)
		{
			System.out.println(pessoa.getNome());
		}
		
	}
	
}
