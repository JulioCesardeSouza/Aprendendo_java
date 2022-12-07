package br.com;

import java.util.Scanner;

public class Avaliacao01 {

	public static void main(String[] args) {

		// Escrever um Programa que receba dois valores númericos e exiba o
		// maior entre os 2 numeros, use Scanner, validar
		// caso os numeros forem iguais também.
		Scanner ler = new Scanner(System.in);

		System.out.println("Entrecom o 1º numero:");
		int num1 = ler.nextInt();
		System.out.println("Entre com 2º numero: ");
		int num2 = ler.nextInt();
		if (num1 > num2) {
			System.out.println("O maior é " + num1);

		}else if(num1 == num2) {
			System.out.println("Resultados iguais " );
			
		}else {
			System.out.println("O maior é " + num2);
		}

	}

}
