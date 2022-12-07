package aula4;

import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {

		// ESCREVA UM PROGRAMA PARA LER UM VETOR B
		// E IMPRIMIR COM O VALOR DOBRADO

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o tamanho do array");
		int tamanho = ler.nextInt();
		int[] b = new int[tamanho];
		int posicao = 0;
        int[] bDobrado = new int[b.length];
        
		for (int i = 0; i < b.length; i++) {
			System.out.print("entre com o numero na posicao "+ (i+1));
			b[i] = ler.nextInt();
			bDobrado[i]=b[i]*2;

		}
		System.out.println("\n... leu os valores...\n ");

		
		System.out.print("saida do array. \n");

		do {
			System.out.print(b[posicao] + " ");
			posicao++;

		} while (posicao < tamanho);

		System.out.print("saida do array dobrada.\n");
      posicao = 0;
		do {
			System.out.print(bDobrado[posicao] + " ");
			posicao++;

		} while (posicao < tamanho);

	}

}
