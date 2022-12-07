package aula4;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {

		// ESCREVA UM PROGRAMA PARA LER UM VETOR B 
		// E IMPRIMIR EM ORDEM INVERTIDA

		Scanner ler = new Scanner(System.in);

		int [] b = new int[4];
		int posicao;

		for (int i = 0; i < b.length; i++) {
        System.out.print("entre com o numero");
        b[i] = ler.nextInt();

		}
		System.out.println("\n... leu os valores...\n ");
		
		posicao = b.length -1;
		System.out.print("saida invertida:");
		
		do {
			System.out.print( b [posicao]+ " ");
			posicao--;
			
		}while (posicao >= 0);
			
		}

	}


