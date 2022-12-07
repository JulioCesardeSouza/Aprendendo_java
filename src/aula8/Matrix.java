package aula8;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// CAPTURE DO TECLADO VALORES PARA PREENCHIMENTO DE UMA MATRIX M
		// 3X3 APOS A CAPTURA IMPRIMA A MATRIX E ENCONTRE  A QUANTIDADE DE NUMEROS 
		// PARES E A QUANTIDADE DE NUMEROS IMPARES 

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Entre com o valor da posicao[" + i + "," + j + "]");
				numeros[i][j] = ler.nextInt();
			}
		}
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Entre com o valor da posicao[" + i + "," + j + "]");
				numeros[i][j] = ler.nextInt();

				if (numeros[i][j] % 2 == 0) {
					qtdPares++;

				} else {
					qtdImpares++;
				}

			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j]+" ");
				
	}
			System.out.println();
}
		System.out.println("Pares ="+ qtdPares);
		System.out.println("Impares"+ qtdImpares);
		
	}   
}
   
