package aula4;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o tamanho do array");
		int tamanho = ler.nextInt();
		
		double[] notas = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {

			System.out.printf("Digite o nome " + (i) + " do aluno :");
			notas[i] = ler.nextDouble();

			notas[i] = tamanho;

			System.out.print("nota 1 = ");
		}
		for (int i = 0; i < tamanho; i++) {
			System.out.print(notas[i] + " ");

		}
		System.out.println();

		
	}
}