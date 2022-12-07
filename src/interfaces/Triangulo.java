package interfaces;

public class Triangulo implements FigurasGeometricas{
	
	// ATRUBUTOS
	private int altura;
	private int base;
	// CONSTRUTOR
	public Triangulo(int altura) {
		this.altura = altura;
	}
	
   // METODO ESPECIFICOS
	public double calcularArea() {
		return  this.altura * this.altura;
	
	}
	
	//GETTERS SETERS
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this. altura = altura;
	}
	
	

}
