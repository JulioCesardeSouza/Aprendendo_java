package br.com;

import java.util.Scanner;

public class Avaliacao9 {

	public static void main(String[] args) {

		// Faça um Programa que receba um valor que foi depositado
		// e exiba o valor com rendimento após um mês.
		// Considere fixo o juro da poupança em 0,70% a. a.

		Scanner ler = new Scanner(System.in);

		double valor = 0;
		double rendimentos = 0;
		double jurosA;
		double meses;
		System.out.println("Entre com o valor depositado");
		valor = ler.nextDouble();

		System.out.println("Digite o mês do rendimento");
		meses = ler.nextDouble();

		System.out.println("Entre com o juros  Anual" + ":");
		jurosA = ler.nextDouble();

		rendimentos = valor * jurosA/12 ;
		valor=jurosA/meses;

		System.out.println("Rendimento do mes foi de " + (rendimentos));

	}
}
