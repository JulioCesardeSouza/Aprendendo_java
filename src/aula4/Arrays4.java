package aula4;

import java.util.Scanner;

public class Arrays4 {

	public static void main(String[] args) {

		// ESCREVA UM PROGRAMA PARA LER UM VETOR C DE N POSICOES ONDE N É
		// MENOR OU IGUAL A 20 E IMPRIMIR SEUS ELEMENTOS. O USUARIO DEVE
		// INFORMAR O NUMEROS DE POSICOES E OS ELEMENTOS

		Scanner ler = new Scanner(System.in);

		int[] a;
		int tamanho;

		do {

			System.out.print("entre com  a quantidade de alunos:");
			tamanho = ler.nextInt();
			if (tamanho < 1 || tamanho > 15) {

				System.out.println();
			}
		} while (tamanho < 1 || tamanho > 15);

		a = new int[tamanho];

		for (int i = 0; i < a.length; i++) {
			System.out.println("entre com o nome do aluno");
			a[i] = ler.nextInt();

		}
	

		for (int i = 0; i < a.length; i++) {
          System.out.print( "Entre com a matricula ");
          a[i]= ler.nextInt();

		}

	}

}
