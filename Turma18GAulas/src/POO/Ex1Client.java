package POO;
import java.util.Random;
public class Ex1Client {
	private String nome;
	private String segundoNome;
	int idade;
	int conta;

	public Ex1Client(String primeiro, String segundo)// construtor
	{
		nome = primeiro;
		segundoNome = segundo;

	}

	public String getDados() // metodo
	{
		String Dados = (nome +" "+ segundoNome);
		return Dados;
	}
	
	public int idade (int anoNascimento) {
		return idade = 2021 - anoNascimento;
	}
	
	public int conta(int id) {
		Random idd = new Random();
		id = idd.nextInt(2000);
		conta = id;
		return conta;
		
	}
	
}
