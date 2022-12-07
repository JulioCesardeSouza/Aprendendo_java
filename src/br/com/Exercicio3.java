package br.com;

import java.util.Scanner;

public class Exercicio3 {
	
public static void main(String[] args) {

	Scanner ler= new Scanner(System.in);
	System.out.println("digite o valor:");
	int numero = ler.nextInt();
	
	System.out.println("valor anterior:"+(numero-1));
	
	System.out.println("proximo valor:"+(numero+1));
	
	
	
}
}

