package br.com;

import java.util.Scanner;

public class Execicio5 {

	public static void main(String[] args) {
		
		double a,b,c,valorTotal;
		
		
		Scanner ler = new Scanner(System.in);
		
	System.out.printf("qual o primeiro valor \n");	
	a=ler.nextDouble();
	System.out.printf("qual o segundo valor \n");
	b=ler.nextDouble();
	System.out.printf("qual o terceiro valor \n");
	c=ler.nextDouble();
	System.out.printf("Resultado: \n");
	
	valorTotal=a+b+c;
	if(valorTotal <= 20) {
		System.out.printf("A compra deu R$ %.2f", valorTotal);
		
	}else {
		System.out.printf("A compra deu R$ %.2f Ops, a compra passou do orçamento", valorTotal);
	}
	
	
	

	}

}
