package PooInterface;

public class Interface {
	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;

		System.out.println("O participante est� lendo: " + leitor.lendo());
		Programador programador = participante;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println("E programado: " + programador.digitando());

	}
}
 