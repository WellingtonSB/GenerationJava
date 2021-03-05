package JavaCollectionsMap;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import JavaCollectionsSetHashSet.Aluno;

public class MapaAluno {
	public static void main(String[] args) {
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

		Aluno a = new Aluno("João da Silva", "Java", 6.8);
		Aluno b = new Aluno("Maria Souza", "Linux", 7.8);
		Aluno c = new Aluno("Renata Alemeida", "So", 8.9);

		mapa.put("João da Silva", a);
		mapa.put("Maria Souza", b);
		mapa.put("Renata Almeida", c);

		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));

		Collection<Aluno> alunos = mapa.values();// valores do aluno
		for (Aluno e : alunos) {
			System.out.println(e);
		}

	}

}
