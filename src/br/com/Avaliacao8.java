package br.com;

import java.util.Scanner;

public class Avaliacao8 {

	public static void main(String[] args) {

		//Elaborar um Programa que efetue a apresenta��o do valor da convers�o em real
       //(R$) de um valor lido em d�lar(US$). O Programa dever� solicitar
		//o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis 
		
		
		Scanner ler = new Scanner(System.in);
		
		double conversao=0,valorDolar, valorReal;
		
		System.out.println("Digite o valor em reais a ser convertido:");
		valorReal=ler.nextDouble();
		
		System.out.println("Digite o valor do dolar:");
		valorDolar=ler.nextDouble();
		conversao=valorReal/valorDolar ;
		
		System.out.println("A convers�o total: "  + conversao);
		
		
		
		
		
		

		
	}
}
