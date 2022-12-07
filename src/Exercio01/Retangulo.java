package Exercio01;

public class Retangulo implements FigurasG{
	
	private int altura , largura;

	public Retangulo(int altura, int largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.altura * this.largura;
	}
	

}
