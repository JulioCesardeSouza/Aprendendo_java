package aula4;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		// ESCREVA UM PROGRAMA PARA LER UM VETOR A DE 15 POSIÇÕES
		// E IMPRIMIR SEUS ELEMENTOS

		Scanner ler = new Scanner(System.in);

		int a[] = new int[15];
		int posicao;

		for (int i = 0; i < a.length; i++) {
        System.out.print("entre com o numero");
        a[i] = ler.nextInt();

		}
	
		
		posicao = 0;
		while (posicao < a.length) {
			System.out.println("["+ (posicao +1)+"]"+ a [posicao]);
			posicao++;
		}

	}

}
