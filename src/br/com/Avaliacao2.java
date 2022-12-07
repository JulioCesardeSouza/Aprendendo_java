package br.com;

import java.util.Scanner;

public class Avaliacao2 {

	public static void main(String[] args) {

		//Escrever um Programa que receba dois valores númericos e
		//ao final mostre a soma, subtração, multiplicação e a
		//divisão dos valores lidos
		
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
	 
	        System.out.println("A adicao entre os dois valores é : " + adicao);
	        System.out.println("a subtracao é : " + subtracao);
	        System.out.println("a multiplicacao é : " + multiplicacao);
	        System.out.println("a divisao é : " + divisao);
	}

}
