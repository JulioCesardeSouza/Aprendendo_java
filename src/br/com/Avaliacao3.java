package br.com;

import java.util.Scanner;

public class Avaliacao3 {

	public static void main(String[] args) {

		//Escrever um Programa para determinar o consumo m�dio 
		//de um autom�vel sendo fornecida a dist�ncia total
		//percorrida pelo autom�vel e o total de combust�vel gasto.
		
		Scanner ler = new Scanner(System.in);
		
		int  distancia,volume;
		double consumo;

		  System.out.println("quantidade ou volume de combustivel");
		  volume = ler.nextInt();

		  System.out.println(" distancia percorrida "); 
		  distancia = ler.nextInt();

		  consumo = distancia/volume;
		  
		 System.out.println("Consumo medio � de ");
		   System.out.printf("%.3f km/l\n", consumo);

		  if (volume >= 0) {
		    System.out.printf("Seu carro eh uma bicicleta!\n");
		  }
		  else {
		   System.out.printf("Seu carro nao eh uma bicicleta!\n");
		  }
	}

}
