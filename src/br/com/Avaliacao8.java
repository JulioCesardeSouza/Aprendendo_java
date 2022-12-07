package br.com;

import java.util.Scanner;

public class Avaliacao8 {

	public static void main(String[] args) {

		//Elaborar um Programa que efetue a apresentação do valor da conversão em real
       //(R$) de um valor lido em dólar(US$). O Programa deverá solicitar
		//o valor da cotação do dólar e também a quantidade de dólares disponíveis 
		
		
		Scanner ler = new Scanner(System.in);
		
		double conversao=0,valorDolar, valorReal;
		
		System.out.println("Digite o valor em reais a ser convertido:");
		valorReal=ler.nextDouble();
		
		System.out.println("Digite o valor do dolar:");
		valorDolar=ler.nextDouble();
		conversao=valorReal/valorDolar ;
		
		System.out.println("A conversão total: "  + conversao);
		
		
		
		
		
		

		
	}
}
