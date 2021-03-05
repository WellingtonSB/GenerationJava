package PooInterface;

public class ParticipanteForum implements Programador, Leitor {
	String pensamento;

	public String lendo() {
		return "Forum";
	}

	public void pensando(char[] ideias) {
		pensamento = new String(ideias);

	}

	public String digitando() {
		return pensamento;
	}

	private String aprendendo() {
		return "JAVA";
	}
}
