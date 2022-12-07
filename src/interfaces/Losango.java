package interfaces;

public class Losango implements FigurasGeometricas {

	// ATRUBUTOS
	private int diagMaior;
	private int diagMenor;

	// CONSTRUTOR
	public Losango(int diagMaior, int diagMenor) {
		this.diagMaior = diagMaior;
		this.diagMenor = diagMenor;
	}

	// METODO ESPECIFICOS
	public double calcularArea() {
		return this.diagMaior * this.diagMenor / 2;

	}

}