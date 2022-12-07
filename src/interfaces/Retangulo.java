package interfaces;

public class Retangulo implements FigurasGeometricas {

	// ATRUBUTOS
	private int altura;
	private int largura;

	// CONSTRUTOR
	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}

	// METODO ESPECIFICOS
	public double calcularArea() {
		return this.altura * this. largura;

	}
	

}