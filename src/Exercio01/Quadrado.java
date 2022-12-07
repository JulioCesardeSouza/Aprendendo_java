package Exercio01;

public class Quadrado implements FigurasG {
	
	private int lado;

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this. lado * this.lado ;
	}
	
   
}
