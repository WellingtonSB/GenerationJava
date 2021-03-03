package POO;

import java.util.Random;

public class Ex3GenerationComputadores {
	private int numeroPedido;
	private double HD;
	private double memoriaRam;
	private double placaMae;
	private double placaVideo;
	private double Vetor;
	private double Matriz;
	private double POO;

	public double getHD() {
		return HD = 100.10;
	}

	public void setHD(double hD) {
		HD = hD;
	}

	public double getMemoriaRam() {
		return memoriaRam = 100.10;
	}

	public void setMemoriaRam(double memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public double getPlacaMae() {
		return placaMae = 100.10;
	}

	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}

	public double getPlacaVideo() {
		return placaVideo = 100.10;
	}

	public void setPlacaVideo(double placaVideo) {
		this.placaVideo = placaVideo;
	}

	public double getVetor() {
		return Vetor = 1000;
	}

	public void setVetor(double vetor) {
		Vetor = vetor;
	}

	public double getMatriz() {
		return Matriz = 2000;
	}

	public void setMatriz(double matriz) {
		Matriz = matriz;
	}

	public double getPOO() {
		return POO = 3000;
	}

	public void setPOO(double pOO) {
		POO = pOO;
	}

	public int numeroPedido(int id) {
		Random idd = new Random();
		id = idd.nextInt(32321);
		numeroPedido = id;

		return numeroPedido;
	}
}