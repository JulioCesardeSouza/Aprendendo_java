package aula4;

import java.util.Scanner;

public class Execicio3 {

	public static void main(String[] args) {
    // numeros primos s�o dividido por 1 ou por ele mesmo (somente)[
	// numeros divisores � 2 !
		
		Scanner ler = new Scanner(System.in);
		
		int numprimo;
		int numdivisores =0;

		System.out.println("Entre com o numero");
		 numprimo = ler.nextInt();
	

		for (int i = 1; i < numprimo; i++) {
			if (numprimo % i == 0) {
				numdivisores++;
			}

		}
		if(numdivisores == 1) {
			System.out.println("O numero digitado � primo");
			
		}else {
			System.out.println("O numero digitado n�o � primo");
		}

	}

	{

	}

}
