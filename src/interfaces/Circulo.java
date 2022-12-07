package interfaces;

public class Circulo implements FigurasGeometricas{
	
	// ATRUBUTOS
	private int raio;
	
	// CONSTRUTOR
	public Circulo(int raio) {
		this.raio = raio;
	}
	
   // METODO ESPECIFICOS
	public double calcularArea() {
		double area = Math.PI*Math.pow(raio, 2);
		return area;
	}
	
	//GETTERS SETERS
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this. raio = raio;
	}
	
	

}
