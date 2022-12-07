package aula4;

import java.util.Scanner;

public class Arrays8 {

	public static void main(String[] args) {

		// ESCREVA UM PROGRAMA PARA LER UM VETOR B
		// E IMPRIMIR O MENOR VALOR DA POSICAO 
		// E A SOMA TOTAL DO ARRAY

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o tamanho do array");
		int tamanho = ler.nextInt();
		int[] b = new int[tamanho];
		int posicao = 0;
        int somaTotal = 0;
        int valorMenor = 0;
        int aux = 0;
        
		for (int i = 0; i < b.length; i++) {
			System.out.print("entre com o numero na posicao "+ (i+1));
			b[i] = ler.nextInt();
		    somaTotal += b[i];
		    if(i == 0) {
		       aux = b[0];
			   valorMenor = aux;
		    }
		    
		    if(b[i] <= valorMenor) {
		    valorMenor = b[i];	
		    }
		    
      }
		System.out.println("\n... leu os valores...\n ");
		
		System.out.printf("Menor valor= %d . \n", valorMenor);
		System.out.printf("Soma total do array = %d.\n", somaTotal);

	}

}
