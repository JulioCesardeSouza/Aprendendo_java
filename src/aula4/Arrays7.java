package aula4;

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {

		// ESCREVA UM PROGRAMA PARA 2 VETORES DE DIMENSAO N (N<=15)
		// E CALCULAR A SOMA ENTRE ELES GERANDO UM TECEIRO VETOR DA MESMA DEMENSAO

		Scanner ler = new Scanner(System.in);

		int tamanho;

		do {

			System.out.println("entre com a quantidade de alunos:");
			tamanho = ler.nextInt();
			if (tamanho < 1 || tamanho > 15) {

				System.out.println("quantidade invalido! digite um valor entre 1 e 15");
			}
		} while (tamanho < 1 || tamanho > 15);

		int[] nota1 = new int[tamanho], nota2 = new int[tamanho], soma = new int[tamanho];

		// nota1 vai de 0 ate 4

		System.out.print("entre com a primeira nota de avaliação dos aluno:");

		for (int i = 0; i < nota1.length; i++) {
			do {
				System.out.println("aluno" + (i + 1) + ":");
				nota1[i] = ler.nextInt();
			} while (nota1[i] < 0 || nota1[i] > 4);
		}

		//
		// nota2 vai de 0 ate 6

		System.out.print("entre com a segunda nota de avaliação dos alunos:");

		for (int i = 0; i < nota2.length; i++) {
			do {
				System.out.println("aluno" + (i + 1) + " :");
				nota2[i] = ler.nextInt();

			} while (nota2[i] < 0 || nota2[i] > 6);

		}
		
		//
		// A soma de nota1 e nota2 não passara de 10

		System.out.println("A soma da nota1 com a nota2 de cada aluno:");

		for (int i = 0; i < soma.length; i++) {

			soma[i] = nota1[i] + nota2[i];
			System.out.println("aluno" + (i + 1) + ":" + soma[i]);
		}
	}
}
