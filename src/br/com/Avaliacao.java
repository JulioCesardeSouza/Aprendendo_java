package br.com;

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {

		// Escrever um Programa que receba dois valores númericos e exiba o
		// maior entre os 2 numeros, use Scanner, validar
		// caso os numeros forem iguais também.
		Scanner ler = new Scanner(System.in);
		int valor[] = new int[2];
		int maior =0, menor =0; 
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = ler.nextInt() ;
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
			
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);

	
		
	}

}

