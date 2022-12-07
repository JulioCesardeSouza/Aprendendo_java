package interfaces;

public class Quadrado implements FigurasGeometricas{
	
	// ATRUBUTOS
	private int lado;
	
	// CONSTRUTOR
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
   // METODO ESPECIFICOS
	public double calcularArea() {
		return this. lado * this.lado;
	
	}
	
	//GETTERS SETERS
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this. lado = lado;
	}
	
	

}
