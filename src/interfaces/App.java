package interfaces;

public class App {
	
	public static void main(String [] args)throws Exception{
		
		
		Triangulo triangulo = new Triangulo(3);
		System.out.println(" valor do Triangulo  "  + triangulo.calcularArea ());
		
		
		Quadrado quadrado = new Quadrado(5);
		System.out.println(" Valor do Quadrado  " + quadrado.calcularArea ());
		
		Losango losango = new Losango (0, 0);
		System.out.println(" Valor do Losango  " + losango.calcularArea());
		
	    Retangulo retangulo = new Retangulo(0,0);
	    System.out.println(" Valor do Retangulo " + retangulo.calcularArea());
		
		
		
		Circulo circuloPequeno = new Circulo(2);
		circuloPequeno.calcularArea();
		double area = circuloPequeno.calcularArea();
		System.out.println("Valor do Circulo " + area);
		
		
		
		
		
		
	}
	

	
	
	}
	
	


