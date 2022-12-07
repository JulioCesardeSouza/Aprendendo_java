package Exercio01;

import interfaces.Retangulo;
import interfaces.Triangulo;

public class Resultado {

	public static void main(String[] args) {
		
		
		Quadrado quadrado = new Quadrado (3);
	 System.out.println(" Valor do Quadrado " + quadrado.calcularArea());

        Retangulo retangulo = new Retangulo(3,0);
	    System.out.println(" Valor do Retangulo " + retangulo.calcularArea());
	    
	    Triangulo triangulo = new Triangulo(2);
		System.out.println(" valor do Triangulo  "  + triangulo.calcularArea ());
	}
	

}
