package br.com;

import java.util.Scanner;

public class Avaliacao2 {

	public static void main(String[] args) {

		//Escrever um Programa que receba dois valores n�mericos e
		//ao final mostre a soma, subtra��o, multiplica��o e a
		//divis�o dos valores lidos
		
		Scanner ler = new Scanner(System.in);
		   int a = 0;
	        int b = 0;
	        int adicao;
	        int subtracao;
	        int multiplicacao;
	        int divisao;
	 
	       System.out.println("Informe o primeiro valor");
	       a =ler.nextInt();
	       System.out.println("Informe o segundo valor");
	       b = ler.nextInt();
	 
	        adicao = ((a + b));
	        subtracao = (a - b);
	        multiplicacao = (a * b);
	        divisao = (a / b);
	 
	        System.out.println("A adicao entre os dois valores � : " + adicao);
	        System.out.println("a subtracao � : " + subtracao);
	        System.out.println("a multiplicacao � : " + multiplicacao);
	        System.out.println("a divisao � : " + divisao);
	}

}
