package JavaCollectionsSetHashSet;

public class Aluno {

	private String nome;
	private String curso;
	double nota;

	public Aluno(String nome, String curso, double nota) {
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public String toString() {
		return this.nome;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getCurso() {
		return curso;
	}

	protected void setCurso(String curso) {
		this.curso = curso;
	}

	protected double getNota() {
		return nota;
	}

	protected void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}
