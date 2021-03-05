package JavaCollectionsSetHashSet;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();// não permite duplicatas
		Aluno a = new Aluno("João da Silva", "Java", 6.8);
		Aluno b = new Aluno("Maria Souza", "Linux", 7.8);
		Aluno c = new Aluno("Renata Alemeida", "So", 8.9);

		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);

		System.out.println(conjunto);

	}

}
