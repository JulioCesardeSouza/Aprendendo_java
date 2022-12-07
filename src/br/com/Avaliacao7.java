package br.com;

import java.util.Scanner;

public class Avaliacao7 {

	public static void main(String[] args) {
		
		
		//- Ler uma temperatura em graus Celsius e apresentá-la 
				//convertida em graus Fahrenheit. A fórmula de conversão é:
		       //F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
			
				
		Scanner input = new Scanner(System.in);
		
		float c;
	
		System.out.println("Informe a temperatura em Celsius:");
		c=input.nextFloat();
		System.out.println("A temperatura de Fahrenheit: " +((9*c+160)/5));
		
 
		
		
		
	
			
		}
		
	}

