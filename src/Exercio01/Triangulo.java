package Exercio01;

public class Triangulo implements FigurasG{
	 
	private int altura,base;

	public Triangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this. altura * this.base;
	}
	

}
